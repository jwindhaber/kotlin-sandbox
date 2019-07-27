package com.eaxample.kotlin.sandbox

import io.kotlintest.inspectors.forAll
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.matchers.string.shouldStartWith
import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe

class DSLKotlinTest : StringSpec({


    "your test case" {
        val xs = listOf("aa_1", "aa_2", "aa_3")
        xs.forAll {
            it.shouldContain("_")
            it.shouldStartWith("aa")
        }
    }

    "my dsl must" {

        //val wrapper = Wrapper()
        val provideWorkout = provideWorkout()

        provideWorkout.activities.size shouldBe 2

    }

})