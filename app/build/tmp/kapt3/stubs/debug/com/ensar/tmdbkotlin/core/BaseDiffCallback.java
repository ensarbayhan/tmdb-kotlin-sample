package com.ensar.tmdbkotlin.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/ensar/tmdbkotlin/core/BaseDiffCallback;", "T", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areItemsTheSame", "app_debug"})
public class BaseDiffCallback<T extends java.lang.Object> extends android.support.v7.util.DiffUtil.ItemCallback<T> {
    
    @java.lang.Override()
    public boolean areItemsTheSame(T oldItem, T newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(T oldItem, T newItem) {
        return false;
    }
    
    public BaseDiffCallback() {
        super();
    }
}