package com.allegro.training.kotlin.exercises.second

import spock.lang.Specification

class Task2Spec extends Specification {
    def "should correctly implement containsTimes"() {
        given:
        def list = ["alone", "abroad", "about", "abroad", "abroad", "about"]

        expect:
        Task2Kt.regularContainsTimes(list, word, times) == expectedValue

        where:
        word     | times | expectedValue
        "alone"  |     1 | true
        "alone"  |     2 | false
        "abroad" |     3 | true
        "abroad" |     2 | false
        "abroad" |     4 | false
        "about"  |     2 | true
        "about"  |     1 | false
        "about"  |     3 | false
        "about"  |     0 | false
    }
}
