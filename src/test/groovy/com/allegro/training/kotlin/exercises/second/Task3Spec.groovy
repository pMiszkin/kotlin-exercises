package com.allegro.training.kotlin.exercises.second

import kotlin.Pair
import spock.lang.Specification

import static com.allegro.training.kotlin.exercises.second.Task3Kt.pairContains

class Task3Spec extends Specification {
    def "should be able to loop over a Pair with for loop"() {
        given:
        def pair = new Pair("a", "b")

        expect:
        pairContains(pair, "a")
        pairContains(pair, "b")
        !pairContains(pair, "c")
    }
}
