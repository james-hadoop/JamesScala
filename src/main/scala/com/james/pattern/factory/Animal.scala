package com.james.pattern.factory

/**
  * Created by james on 16-9-10.
  */
class Animal {
    def yell {}
}

//object Animal {
//    def apply(kind: String): Animal = kind.match {
//        case "dog" => new Dog
//        case "cat" => new Cat
//    }
//}
//
//class Cat extends Animal {
//    override def yell: Unit = {
//        print("miao")
//    }
//}
//
//class Dog extends Animal {
//    override def yell: Unit = {
//        print("wang")
//    }
//}
//
//object runAnimal extends App {
//    Animal("dog").yell
//    Animal("cat").yell
//}