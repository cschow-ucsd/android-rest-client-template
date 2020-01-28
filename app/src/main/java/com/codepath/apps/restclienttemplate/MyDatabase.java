package com.codepath.apps.restclienttemplate;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.codepath.apps.restclienttemplate.models.*;

@Database(entities={SampleModel.class, Tweet.class, User.class}, version=2)
public abstract class MyDatabase extends RoomDatabase {
    public abstract SampleModelDao sampleModelDao();

    public abstract TweetDao tweetDao();

    // Database name to be used
    public static final String NAME = "MyDataBase";
}
