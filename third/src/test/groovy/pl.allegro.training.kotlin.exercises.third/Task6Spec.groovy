package pl.allegro.training.kotlin.exercises.third

import spock.lang.Specification

class Task6Spec extends Specification {
    def "should correctly implement containsTimes"() {
        given:
        def list = ["alone", "abroad", "about", "abroad", "abroad", "about"]

        expect:
        Task6Kt.regularContainsTimes(list, word, times) == expectedValue

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
