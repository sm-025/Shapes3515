class EquilateralTriangle(name : String = "Equilateral Triangle") : Triangle(name) {
    private var sideLength : Double = 0.0

    private fun setDimensions(sideLength : Double) {
        super.setDimensions(sideLength, sideLength, sideLength)
    }

    override fun getFromUser() {
        println("Enter the length of the equilateral triangle's sides.")
        sideLength = readln().toDouble()
        this.setDimensions(sideLength)
        println()
    }
}