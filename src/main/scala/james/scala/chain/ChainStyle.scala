package james.scala.chain

/**
  * Created by james on 16-4-24.
  */
class Animal {
  def breathe: this.type = {
    println("Animal.breathe()")
    this
  }
}

class Cat extends Animal {
  def eat: this.type = {
    println("Cat.eat()")
    this
  }
}

object ChainStyle {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.breathe
    cat.eat
    println
    cat.breathe.eat
  }
}
