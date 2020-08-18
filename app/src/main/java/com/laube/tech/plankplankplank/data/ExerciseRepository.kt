package com.laube.tech.plankplankplank.data

import io.reactivex.Completable
import io.reactivex.Flowable

class ExerciseRepository(private val exerciseDao: ExerciseDao) {
    fun fetchAllExercise() : Flowable<List<Exercise>>{
        return exerciseDao.fetchAllExercise()
    }

    fun insertExersise(exercise: Exercise): Completable {
        return exerciseDao.insertExersise(exercise)
    }
}