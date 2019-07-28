package com.eaxample.kotlin.sandbox

import java.util.*

enum class Feeling { BAD, OK, GOOD }

enum class FragmentIdentifier(val text: String, val color: String) {
    REST("REST", "#f0c674"),
    WORK("WORK", "#ab4642"),
    SESSION_REST("REST", "#a1b56c")
}

data class Workout(var name: String = "", var activities: MutableList<Activity> = mutableListOf()) {
    operator fun invoke(function: Workout.() -> Unit) {
        this.apply(function)
    }

    fun activity(lambda: Activity.() -> Unit) {
        activities.add(Activity().apply(lambda))
    }

    fun activities(lambda: Activity.() -> Unit) {
        Activity().apply(lambda)
    }

}


data class Activity(var name: String = "", var rest: Int = 0, val exercises: MutableList<Exercise> = mutableListOf(), var activityId: String = UUID.randomUUID().toString()) {
    fun exercise(lambda: Exercise.() -> Unit) {
        exercises.add(Exercise().apply(lambda))
    }

    fun exercises(lambda: Exercise.() -> Unit) {
        Exercise().apply(lambda)
    }
}

data class Exercise(var name: String = "", var rest: Int = 0, var repetitions: Int = 0, var weight: Int = 0, var workUnit: WorkUnit = WorkUnit(), var alternateHands: Boolean = false, var feeling: Feeling = Feeling.OK)
data class WorkUnit(var name: String = "", var work: Int = 0, var rest: Int = 0) {
    operator fun invoke(function: WorkUnit.() -> Unit) {
        WorkUnit().apply(function)
    }
}

//class Wrapper {


   fun provideWorkout(): Workout {
        val workout = Workout()
       workout {
            name =  "bsjd"
            activities {
                activity {
                    name = "bsjd"
                    rest = 1
                    exercises {
                        exercise {
                            name = "test"
                            workUnit {
                                work = 7
                                rest = 4
                            }
                        }
                        exercise {
                            name = "second"
                            workUnit {
                                work = 10
                                rest = 29
                            }
                        }
                    }

                }
                activity {
                    name = "ddddddd"
                }
            }

        }

        return workout
    }
//}

//fun workout (function: Workout.() -> Unit) : Workout{
//    val address = Workout()
//    address.apply(function)
//    return address
//}
//fun activity (function: Activity.() -> Unit) : Activity{return Activity()}
//
//fun activities(function: MutableList<Activity>.() -> Unit) :MutableList<Activity> {
//    val activities = mutableListOf<Activity>()
//    activities.apply(function)
//    return activities
//}

//object DomainProvider{
//
//    fun provideWorkout(): Workout {
//        return workout {
//             name = "ss"
//             activities {
//                 activity {
//                     name = ""
//                 }
//                 activity {
//                     name = ""
//                 }
//             }
//         }
//    }

//}




