package com.james.Enumeration

/**
  * Created by james on 16-12-29.
  */
object EnumerationDemo extends App {
    var currentMargin = Margin.TOP
    // later in the code ...
    if (currentMargin == Margin.TOP) println("working on Top")

    Margin.values foreach println
}

object Margin extends Enumeration {
    type Margin = Value
    val TOP, BOTTOM, LEFT, RIGHT = Value
}
