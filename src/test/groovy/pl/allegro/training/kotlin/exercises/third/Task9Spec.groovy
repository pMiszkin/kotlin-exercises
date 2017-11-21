package pl.allegro.training.kotlin.exercises.third

import spock.lang.Specification

class Task9Spec extends Specification {
    def "should convert String to BigDecimal"() {
        expect:
        Task9Kt.asBigDecimal(null) == null
        Task9Kt.asBigDecimal("1") == new BigDecimal("1")
    }

    def "should create user"() {
        expect:
        Task9Kt.createUser1("Jane", "Fonda") == new User("Jane", "Fonda", Sex.MALE)
        Task9Kt.createUser2("Jane", "Fonda") == new User("Jane", "Fonda", Sex.MALE)
    }

    def "should get user"() {
        when:
        Task9Kt.logs.clear()
        def result = Task9Kt.getUser("Wayne")

        then:
        result == new User("John", "Wayne", Sex.MALE)
        Task9Kt.logs == ["Wayne"]
    }

    def "should create logging service"() {
        given:
        def loggingService = Task9Kt.createLoggingService("pref-")

        when:
        loggingService.log("Hello")

        then:
        1 == 1
    }
}
