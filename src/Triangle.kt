import kotlin.math.sqrt

open class Triangle(name : String = "Triangle") : Shape(name){
    private var side1 : Double = 0.0
    private var side2 : Double = 0.0
    private var side3 : Double = 0.0

    fun setDimensions(side1:Double, side2:Double, side3:Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions() {
        println("${this.name}: \n\tSide 1 = ${this.side1}" +
                "\n\tSide 2 = ${this.side2}" +
                "\n\tSide 3 = ${this.side3}" +
                "\n\tArea = %.2f".format((this.getArea())))
        println()
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }

    open fun getFromUser() {
        println("Enter the lengths of the triangle's sides.")
        print("Side 1: ")
        side1 = readln().toDouble()
        print("Side 2: ")
        side2 = readln().toDouble()
        print("Side 3: ")
        side3 = readln().toDouble()
        this.setDimensions(side1, side2, side3)
        println()
    }
}