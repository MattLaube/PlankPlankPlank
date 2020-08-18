package com.laube.tech.plankplankplank.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Exercise::class], version = 1)
abstract class ExerciseDatabase: RoomDatabase() {
    abstract fun clientDao(): ExerciseDao

    companion object {

        @Volatile private var INSTANCE: ExerciseDatabase? = null

        fun getInstance(context: Context): ExerciseDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                ExerciseDatabase::class.java, "exercise.db")
                .build()
    }
}