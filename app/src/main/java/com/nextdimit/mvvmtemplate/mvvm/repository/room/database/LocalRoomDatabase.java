package com.nextdimit.mvvmtemplate.mvvm.repository.room.database;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.nextdimit.mvvmtemplate.MyApp;

//@Database(entities = {MyModel.class}, version = 1, exportSchema = false)
public abstract class LocalRoomDatabase extends RoomDatabase {
    private static final String TAG = "LocalRoomDatabase";

    private static final String DB_NAME = "jyasalesprodb";
    private static LocalRoomDatabase instance;

    public static LocalRoomDatabase getInstance() {
        if(instance == null)
            instance = initDatabaseRef();
        return instance;
    }

    private static LocalRoomDatabase initDatabaseRef() {
        return Room.databaseBuilder(MyApp.getInstance().getAppContext(), LocalRoomDatabase.class, DB_NAME)
                .allowMainThreadQueries()
                //.fallbackToDestructiveMigrationFrom(1) // only uncomment it if your db version is greater than 1
                .fallbackToDestructiveMigration()
                .build();
    }

    //public abstract ModelClassDao getModelClassDao();
}
