package pl.allegro.training.kotlin.exercises.third

import spock.lang.Specification

class Task8Spec extends Specification {
    def "should correctly convert Quadraple to String"() {
        given:
        def quadraple = new Quadraple(1, 2, 3, 4)

        expect:
        Task8Kt.asString(quadraple) == "Quadraple(first=1, second=2, third=3, fourth=4)"
        Task8Kt.asString(null as Quadraple) == "NULL"
    }
}
