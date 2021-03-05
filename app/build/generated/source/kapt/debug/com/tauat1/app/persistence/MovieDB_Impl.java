package com.tauat1.app.persistence;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.tauat1.app.persistence.dao.MovieAndDetailDao;
import com.tauat1.app.persistence.dao.MovieAndDetailDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDB_Impl extends MovieDB {
  private volatile MovieAndDetailDao _movieAndDetailDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie` (`id` INTEGER NOT NULL, `title` TEXT, `poster_path` TEXT, `backdrop_path` TEXT, `vote_average` REAL, `vote_count` INTEGER NOT NULL, `language` TEXT, `release_date` TEXT, `overview` TEXT, `popularity` REAL NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE  INDEX `index_movie_id` ON `movie` (`id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '23970ef303133c27136b200d7cb56d9e')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movie`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovie = new HashMap<String, TableInfo.Column>(10);
        _columnsMovie.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsMovie.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsMovie.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0));
        _columnsMovie.put("backdrop_path", new TableInfo.Column("backdrop_path", "TEXT", false, 0));
        _columnsMovie.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0));
        _columnsMovie.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", true, 0));
        _columnsMovie.put("language", new TableInfo.Column("language", "TEXT", false, 0));
        _columnsMovie.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0));
        _columnsMovie.put("overview", new TableInfo.Column("overview", "TEXT", false, 0));
        _columnsMovie.put("popularity", new TableInfo.Column("popularity", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovie = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovie = new HashSet<TableInfo.Index>(1);
        _indicesMovie.add(new TableInfo.Index("index_movie_id", false, Arrays.asList("id")));
        final TableInfo _infoMovie = new TableInfo("movie", _columnsMovie, _foreignKeysMovie, _indicesMovie);
        final TableInfo _existingMovie = TableInfo.read(_db, "movie");
        if (! _infoMovie.equals(_existingMovie)) {
          throw new IllegalStateException("Migration didn't properly handle movie(com.tauat1.app.model.Movie).\n"
                  + " Expected:\n" + _infoMovie + "\n"
                  + " Found:\n" + _existingMovie);
        }
      }
    }, "23970ef303133c27136b200d7cb56d9e", "316ef62613428bf6c16d26dce306c599");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movie");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movie`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieAndDetailDao getMovieDao() {
    if (_movieAndDetailDao != null) {
      return _movieAndDetailDao;
    } else {
      synchronized(this) {
        if(_movieAndDetailDao == null) {
          _movieAndDetailDao = new MovieAndDetailDao_Impl(this);
        }
        return _movieAndDetailDao;
      }
    }
  }
}
