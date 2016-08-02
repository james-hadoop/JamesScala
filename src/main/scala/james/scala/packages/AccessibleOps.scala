package james.scala.packages

package spark {
    package navigation {
        //accessible in package "spark"
        //called in package "launch"
        private[spark] class Navigator {
            //accessible in class "Navigator", sub classes and package "navigation"
            protected[navigation] def useStarChart() {}

            class LogOfJourney {
                //accessible in class"Navigator"
                private[Navigator] val distance = 1000
            }

            //accessible by current object
            private[this] var speed = 200
        }
    }

    package launch {
        import navigation._

        object Vehicle {
            // accessible in package "launch"
            private[launch] val guide = new Navigator
        }
    }
}

class AccessibleOps {
    import AccessibleOps.power

    private def canMakeItTrue = power > 1001
}

object AccessibleOps {
    private def power = 10000

    def makeItTrue(p: AccessibleOps): Boolean = {
        val result = p.canMakeItTrue
        result
    }
}