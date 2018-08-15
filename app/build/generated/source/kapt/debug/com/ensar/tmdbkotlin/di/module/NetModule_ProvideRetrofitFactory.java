// Generated by Dagger (https://google.github.io/dagger).
package com.ensar.tmdbkotlin.di.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public final class NetModule_ProvideRetrofitFactory implements Factory<Retrofit.Builder> {
  private final NetModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> clientProvider;

  public NetModule_ProvideRetrofitFactory(
      NetModule module, Provider<Gson> gsonProvider, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit.Builder get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(gsonProvider.get(), clientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetModule_ProvideRetrofitFactory create(
      NetModule module, Provider<Gson> gsonProvider, Provider<OkHttpClient> clientProvider) {
    return new NetModule_ProvideRetrofitFactory(module, gsonProvider, clientProvider);
  }

  public static Retrofit.Builder proxyProvideRetrofit(
      NetModule instance, Gson gson, OkHttpClient client) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(gson, client),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
