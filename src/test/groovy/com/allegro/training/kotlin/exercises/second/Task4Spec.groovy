package com.allegro.training.kotlin.exercises.second

import spock.lang.Specification

class Task4Spec extends Specification {
    def "should correctly convert Quadraple to String"() {
        given:
        def quadraple = new Quadraple(1, 2, 3, 4)

        expect:
        Task4Kt.asString(quadraple) == "Quadraple(first=1, second=2, third=3, fourth=4)"
        Task4Kt.asString(null as Quadraple) == "NULL"
    }
}
