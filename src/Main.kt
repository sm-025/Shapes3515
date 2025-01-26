fun main() {
    val square : Shape = Square()
    val circle : Shape = Circle()
    val triangle : Shape = Triangle()
    val equilateralTriangle : Shape = EquilateralTriangle()

    (square as Square).getFromUser()
    (circle as Circle).getFromUser()
    (triangle as Triangle).getFromUser()
    (equilateralTriangle as EquilateralTriangle).getFromUser()

    square.printDimensions()
    circle.printDimensions()
    triangle.printDimensions()
    equilateralTriangle.printDimensions()
}