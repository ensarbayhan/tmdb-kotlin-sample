package com.ensar.tmdbkotlin.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\'J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0015H\u0016R\u001b\u0010\t\u001a\u00028\u00018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/ensar/tmdbkotlin/core/BaseActivity;", "VM", "Lcom/ensar/tmdbkotlin/core/BaseViewModel;", "DB", "Landroid/databinding/ViewDataBinding;", "Landroid/support/v7/app/AppCompatActivity;", "mViewModelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "binding$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lcom/ensar/tmdbkotlin/core/BaseViewModel;", "viewModel$delegate", "getLayoutRes", "", "initViewModel", "", "(Lcom/ensar/tmdbkotlin/core/BaseViewModel;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInject", "app_debug"})
public abstract class BaseActivity<VM extends com.ensar.tmdbkotlin.core.BaseViewModel, DB extends android.databinding.ViewDataBinding> extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final java.lang.Class<VM> mViewModelClass = null;
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutRes();
    
    @org.jetbrains.annotations.NotNull()
    public final DB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    /**
     * * If you want to inject Dependency Injection
     *     * on your activity, you can override this.
     */
    public void onInject() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * *
     *     *  You need override this method.
     *     *  And you need to set viewModel to binding: binding.viewModel = viewModel
     *     *
     */
    public abstract void initViewModel(@org.jetbrains.annotations.NotNull()
    VM viewModel);
    
    public BaseActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> mViewModelClass) {
        super();
    }
}