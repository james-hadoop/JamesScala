package james.scala.packages

package com.scala.spark
//package object
package object people {
    // visited by all the classes in package people
    val defaultName = "Scala"
}

package people {
    class people {
        var name = defaultName
    }
}

/*
 * implicit import
 */
import java.lang._
import scala._
import Predef._

//partial import
import java.awt.{ Color, Font }
// alias import
import java.util.{ HashMap => JavaHashMap }
// not accessible import
import scala.{ StringBuilder => _ }

class PackageOps {}

// package style 1
package spark.navigation {
    class Navigator

    package tests {
        //visualable in spark.navigation.tests
        class NavigatorSuite
    }

    package impls {
        class Action extends Navigator {

        }
    }
}

// package style 2
package hadoop {
    package navigation {
        class Navigator
    }

    package launch {
        class Booster {
            val nav = new navigation.Navigator
        }
    }
}

object PackageOps {

}