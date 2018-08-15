package com.ensar.tmdbkotlin.db.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.ensar.tmdbkotlin.db.entities.Example;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unchecked")
public class ExampleDao_Impl implements ExampleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfExample;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfExample;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfExample;

  public ExampleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExample = new EntityInsertionAdapter<Example>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Example`(`id`,`exampleString`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Example value) {
        stmt.bindLong(1, value.getId());
        if (value.getExampleString() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExampleString());
        }
      }
    };
    this.__deletionAdapterOfExample = new EntityDeletionOrUpdateAdapter<Example>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Example` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Example value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfExample = new EntityDeletionOrUpdateAdapter<Example>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Example` SET `id` = ?,`exampleString` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Example value) {
        stmt.bindLong(1, value.getId());
        if (value.getExampleString() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExampleString());
        }
        stmt.bindLong(3, value.getId());
      }
    };
  }

  @Override
  public void insertExample(Example example) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfExample.insert(example);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteExample(Example example) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfExample.handle(example);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateExample(Example example) {
    __db.beginTransaction();
    try {
      __updateAdapterOfExample.handle(example);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Example>> getExamples() {
    final String _sql = "SELECT * FROM Example";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Example>>() {
      private Observer _observer;

      @Override
      protected List<Example> compute() {
        if (_observer == null) {
          _observer = new Observer("Example") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfExampleString = _cursor.getColumnIndexOrThrow("exampleString");
          final List<Example> _result = new ArrayList<Example>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Example _item;
            _item = new Example();
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpExampleString;
            _tmpExampleString = _cursor.getString(_cursorIndexOfExampleString);
            _item.setExampleString(_tmpExampleString);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public Example getExample(long exampleId) {
    final String _sql = "SELECT * FROM Example where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, exampleId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfExampleString = _cursor.getColumnIndexOrThrow("exampleString");
      final Example _result;
      if(_cursor.moveToFirst()) {
        _result = new Example();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpExampleString;
        _tmpExampleString = _cursor.getString(_cursorIndexOfExampleString);
        _result.setExampleString(_tmpExampleString);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getCount() {
    final String _sql = "Select count(*) from Example";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
