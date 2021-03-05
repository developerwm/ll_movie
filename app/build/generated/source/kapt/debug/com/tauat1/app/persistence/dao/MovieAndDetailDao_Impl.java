package com.tauat1.app.persistence.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.tauat1.app.model.Movie;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieAndDetailDao_Impl implements MovieAndDetailDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMovie;

  private final EntityInsertionAdapter __insertionAdapterOfMovie_1;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfMovie;

  public MovieAndDetailDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `movie`(`id`,`title`,`poster_path`,`backdrop_path`,`vote_average`,`vote_count`,`language`,`release_date`,`overview`,`popularity`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdropPath());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getVoteAverage());
        }
        stmt.bindLong(6, value.getVoteCount());
        if (value.getLanguage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLanguage());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReleaseDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOverview());
        }
        stmt.bindDouble(10, value.getPopularity());
      }
    };
    this.__insertionAdapterOfMovie_1 = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie`(`id`,`title`,`poster_path`,`backdrop_path`,`vote_average`,`vote_count`,`language`,`release_date`,`overview`,`popularity`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdropPath());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getVoteAverage());
        }
        stmt.bindLong(6, value.getVoteCount());
        if (value.getLanguage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLanguage());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReleaseDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOverview());
        }
        stmt.bindDouble(10, value.getPopularity());
      }
    };
    this.__updateAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `movie` SET `id` = ?,`title` = ?,`poster_path` = ?,`backdrop_path` = ?,`vote_average` = ?,`vote_count` = ?,`language` = ?,`release_date` = ?,`overview` = ?,`popularity` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getBackdropPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBackdropPath());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindDouble(5, value.getVoteAverage());
        }
        stmt.bindLong(6, value.getVoteCount());
        if (value.getLanguage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLanguage());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getReleaseDate());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getOverview());
        }
        stmt.bindDouble(10, value.getPopularity());
        stmt.bindLong(11, value.getId());
      }
    };
  }

  @Override
  public long[] insertMovies(final Movie... movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long[] _result = __insertionAdapterOfMovie.insertAndReturnIdsArray(movie);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMovie_1.insert(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateMovie(final Movie movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMovie.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Movie>> getMovies(final int pageNumber) {
    final String _sql = "SELECT * FROM movie LIMIT (?*20)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pageNumber);
    return __db.getInvalidationTracker().createLiveData(new String[]{"movie"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final int _tmpVoteCount;
            _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            final String _tmpLanguage;
            _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            _item = new Movie(_tmpId,_tmpTitle,_tmpPosterPath,_tmpBackdropPath,_tmpVoteAverage,_tmpVoteCount,_tmpLanguage,_tmpReleaseDate,_tmpOverview,_tmpPopularity);
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
    });
  }

  @Override
  public LiveData<List<Movie>> searchListMovie(final String query, final int pageNumber) {
    final String _sql = "SELECT * FROM movie WHERE title LIKE '%' || ? || '%'  LIMIT (?*20) ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageNumber);
    return __db.getInvalidationTracker().createLiveData(new String[]{"movie"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdrop_path");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPosterPath;
            _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            final String _tmpBackdropPath;
            _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final int _tmpVoteCount;
            _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            final String _tmpLanguage;
            _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final double _tmpPopularity;
            _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            _item = new Movie(_tmpId,_tmpTitle,_tmpPosterPath,_tmpBackdropPath,_tmpVoteAverage,_tmpVoteCount,_tmpLanguage,_tmpReleaseDate,_tmpOverview,_tmpPopularity);
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
    });
  }
}
