package com.ensar.tmdbkotlin.di

import android.content.Context
import android.os.Environment
import androidx.room.Room
import com.ensar.tmdbkotlin.BuildConfig
import com.ensar.tmdbkotlin.db.local.AppDatabase
import com.ensar.tmdbkotlin.db.remote.AppService
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by ebayhan on 22.01.2019.
 */
object NetworkModule {
    fun getRemote(): AppService {
        return Retrofit.Builder()
                .client(getOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create(getGson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BuildConfig.API_URL)
                .build()
                .create(AppService::class.java)
    }

    fun getLocal(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "Movie").build()
    }

    private fun getApiKeyInterceptor(): Interceptor {
        return Interceptor { chain ->
            var request = chain.request()
            val url = request.url()!!.newBuilder()?.addQueryParameter("api_key", BuildConfig.API_KEY)?.build()
            request = request.newBuilder().url(url!!).build()
            chain.proceed(request)
        }
    }

    private fun getHttpLoggingInterceptor(): Interceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    private fun getOkHttpClient(): OkHttpClient {
        val cache = Cache(Environment.getDownloadCacheDirectory(), 10 * 1024 * 1024)
        return OkHttpClient.Builder()
                .readTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .cache(cache)
                .addInterceptor(getApiKeyInterceptor())
                .addInterceptor(getHttpLoggingInterceptor())
                .build()
    }

    private fun getGson(): Gson {
        return GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()
    }
}