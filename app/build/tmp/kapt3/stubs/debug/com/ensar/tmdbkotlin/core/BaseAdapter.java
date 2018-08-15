package com.ensar.tmdbkotlin.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH$J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001e\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016\u00a8\u0006\u0015"}, d2 = {"Lcom/ensar/tmdbkotlin/core/BaseAdapter;", "T", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/ensar/tmdbkotlin/core/BaseViewHolder;", "Landroid/databinding/ViewDataBinding;", "callback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "(Landroid/support/v7/util/DiffUtil$ItemCallback;)V", "bind", "", "binding", "position", "", "createBinding", "parent", "Landroid/view/ViewGroup;", "viewType", "getViewHolder", "onBindViewHolder", "holder", "onCreateViewHolder", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object> extends android.support.v7.recyclerview.extensions.ListAdapter<T, com.ensar.tmdbkotlin.core.BaseViewHolder<? extends android.databinding.ViewDataBinding>> {
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ensar.tmdbkotlin.core.BaseViewHolder<? extends android.databinding.ViewDataBinding> holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ensar.tmdbkotlin.core.BaseViewHolder<android.databinding.ViewDataBinding> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.ensar.tmdbkotlin.core.BaseViewHolder<android.databinding.ViewDataBinding> getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.databinding.ViewDataBinding createBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
    
    protected abstract void bind(@org.jetbrains.annotations.NotNull()
    android.databinding.ViewDataBinding binding, int position);
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v7.util.DiffUtil.ItemCallback<T> callback) {
        super(null);
    }
}