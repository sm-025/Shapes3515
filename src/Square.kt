class Square(name : String = "Square") : Shape(name) {
    private var length: Double = 0.0
    private var height: Double = 0.0

    private fun setDimensions(length : Double, height: Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("${this.name}: \n\tHeight = ${this.height}" +
                "\n\tLength = ${this.length}" +
                "\n\tArea = %.2f".format((this.getArea())))
        println()
    }

    override fun getArea() : Double{
        return (length*height)
    }

    fun getFromUser() {
        println("Enter the length and height of the square.")
        print("Length: ")
        length = readln().toDouble()
        print("Height: ")
        height = readln().toDouble()
        this.setDimensions(length, height)
        println()
    }
}