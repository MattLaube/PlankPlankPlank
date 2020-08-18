package com.laube.tech.plankplankplank.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise")
    fun fetchAllExercise() : Flowable<List<Exercise>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertExersise(exercise: Exercise): Completable
}