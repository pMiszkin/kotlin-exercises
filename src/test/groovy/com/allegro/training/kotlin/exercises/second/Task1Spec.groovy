package com.allegro.training.kotlin.exercises.second

import spock.lang.Specification
import spock.lang.Unroll

class Task1Spec extends Specification {
    @Unroll
    def "should find #word in WordSet"() {
        given:
        def wordSet = new WordSet()

        expect:
        wordSet.contains(word)

        where:
        word << ["about", "abroad"]
    }

    @Unroll
    def "should not find #word in WordSet"() {
        given:
        def wordSet = new WordSet()

        expect:
        !wordSet.contains(word)

        where:
        word << ["aboo", "shoe"]
    }
}
