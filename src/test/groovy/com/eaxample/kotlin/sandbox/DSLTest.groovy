package com.eaxample.kotlin.sandbox

import spock.lang.Specification

class DSLTest extends Specification {
    void setup() {
    }

    def "Two activities in the workout"() {
        when:
        Wrapper wrapper = new Wrapper()
        def workout = wrapper.provideWorkout()

        then:
        workout.activities.size() == 2
    }
}
