package com.eaxample.kotlin.sandbox

import spock.lang.Specification

import static com.eaxample.kotlin.sandbox.DomainSpecificLanguageKt.provideWorkout
import static com.eaxample.kotlin.sandbox.Feeling.*

class DSLTest extends Specification {

    setup() {

    }

    def "Two activities in the workout"() {
        when:
        def workout = provideWorkout()

        then:
        workout.activities.size() == 2
        workout.activities.first().exercises.first().feeling == OK
    }
}
