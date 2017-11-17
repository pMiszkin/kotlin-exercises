package com.allegro.training.kotlin.exercises.second

import spock.lang.Specification

class Task6Spec extends Specification {
    def "should create proper brands"() {
        expect:
        Task6Kt.getBrands() == ["BMW", "Fiat", "Ford"]
    }

    def "should create proper brandSet"() {
        expect:
        Task6Kt.getBrandSet() == ["BMW", "Fiat", "Ford"] as Set
    }

    def "should create proper brandArray"() {
        expect:
        Task6Kt.getBrandArray() as List == ["BMW", "Fiat", "Ford"]
    }

    def "should create proper brandIterable"() {
        expect:
        Task6Kt.getBrandIterable() as List == ["BMW", "Fiat", "Ford"]
    }

    def "should create proper mutableBrands"() {
        expect:
        Task6Kt.getMutableBrands() == ["BMW", "Fiat", "Ford"]
    }

    def "should create proper models"() {
        expect:
        Task6Kt.getModels() == ["Fiesta", "Mondeo", "Mustang", "X5", "X6", "126p"] as Set
    }

    def "should create proper cars"() {
        expect:
        Task6Kt.getCars() as List == [new Car("BMW", "X5"), new Car("BMW", "X6"),
                                 new Car("Fiat", "126p"),
                                 new Car("Ford", "Fiesta"), new Car("Ford", "Mondeo"), new Car("Ford", "Mustang")]
    }

    def "should create proper model map"() {
        expect:
        Task6Kt.getModelMap() == ["X5": new Car("BMW", "X5"),
                             "X6": new Car("BMW", "X6"),
                             "126p": new Car("Fiat", "126p"),
                             "Fiesta": new Car("Ford", "Fiesta"),
                             "Mondeo": new Car("Ford", "Mondeo"),
                             "Mustang": new Car("Ford", "Mustang")]
    }

    def "should create proper carModelMap"() {
        expect:
        Task6Kt.getCarBrandMap() == ["BMW": [new Car("BMW", "X5"), new Car("BMW", "X6")],
                                "Fiat": [new Car("Fiat", "126p")],
                                "Ford": [new Car("Ford", "Fiesta"), new Car("Ford", "Mondeo"), new Car("Ford", "Mustang")]]
    }

    def "should create proper fordsMModels"() {
        expect:
        Task6Kt.getFordsMModels() == ["Mondeo", "Mustang"] as Set
    }


    def "should create proper models set"() {
        expect:
        Task6Kt.getAllModels(["BMW": [new Car("BMW", "X5"), new Car("BMW", "X6")],
                              "Fiat": [new Car("Fiat", "126p")],
                              "Ford": [new Car("Ford", "Fiesta"), new Car("Ford", "Mondeo"), new Car("Ford", "Mustang")]]) == ["Fiesta", "Mondeo", "Mustang", "X5", "X6", "126p"] as Set
    }
}
