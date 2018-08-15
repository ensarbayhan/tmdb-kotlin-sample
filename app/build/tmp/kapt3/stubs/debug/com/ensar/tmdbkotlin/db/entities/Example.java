package com.ensar.tmdbkotlin.db.entities;

import java.lang.System;

@android.arch.persistence.room.Entity()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/ensar/tmdbkotlin/db/entities/Example;", "", "()V", "exampleString", "", "getExampleString", "()Ljava/lang/String;", "setExampleString", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "app_debug"})
public final class Example {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String exampleString;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExampleString() {
        return null;
    }
    
    public final void setExampleString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Example() {
        super();
    }
}