package com.nextdimit.mvvmtemplate.mvvm.repository.room.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import java.util.List;

public interface BaseDao<T> {

    @Insert
    void insert(T item);

    @Insert
    void insert(List<T> items);

    @Insert (onConflict = OnConflictStrategy.IGNORE)
    void insertOrIgnore(T item);

    @Insert (onConflict = OnConflictStrategy.IGNORE)
    void insertOrIgnore(List<T> items);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertOrReplace(T item);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertOrReplace(List<T> items);

    @Update
    void update(T item);

    @Update
    void update(List<T> items);

    @Delete
    void delete(T item);

    @Delete
    void delete(List<T> items);
}
