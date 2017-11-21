package pl.allegro.training.kotlin.exercises.third

import kotlin.Pair
import spock.lang.Specification

import static com.allegro.training.kotlin.exercises.second.Task3Kt.pairContains

class Task7Spec extends Specification {
    def "should be able to loop over a Pair with for loop"() {
        given:
        def pair = new Pair("a", "b")

        expect:
        pairContains(pair, "a")
        pairContains(pair, "b")
        !pairContains(pair, "c")
    }
}
