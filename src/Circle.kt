import kotlin.math.PI
import kotlin.math.pow

class Circle(name : String = "Circle") : Shape(name) {
    private var radius : Double = 0.0

    private fun setDimensions(radius : Double) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("${this.name}: \n\tRadius = ${this.radius}" +
                "\n\tArea = %.2f".format((this.getArea())))
        println()
    }

    override fun getArea(): Double {
        return PI*(radius.pow(2))
    }

   fun getFromUser() {
        println("Enter the radius of the circle.")
        print("Radius: ")
        radius = readln().toDouble()
        this.setDimensions(radius)
        println()
    }
}