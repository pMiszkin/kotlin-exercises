package com.allegro.training.kotlin.exercises.second

import spock.lang.Specification

class Task5Spec extends Specification {
    def "should convert String to BigDecimal"() {
        expect:
        Task5Kt.asBigDecimal(null) == null
        Task5Kt.asBigDecimal("1") == new BigDecimal("1")
    }

    def "should create user"() {
        expect:
        Task5Kt.createUser1("Jane", "Fonda") == new User("Jane", "Fonda", Sex.MALE)
        Task5Kt.createUser2("Jane", "Fonda") == new User("Jane", "Fonda", Sex.MALE)
    }

    def "should get user"() {
        when:
        Task5Kt.logs.clear()
        def result = Task5Kt.getUser("Wayne")

        then:
        result == new User("John", "Wayne", Sex.MALE)
        Task5Kt.logs == ["Wayne"]
    }

    def "should create logging service"() {
        given:
        def loggingService = Task5Kt.createLoggingService("pref-")

        when:
        loggingService.log("Hello")

        then:
        1 == 1
    }
}
