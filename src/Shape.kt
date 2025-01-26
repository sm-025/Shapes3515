abstract class Shape(name: String) : Dimensionable{
    val name = name

    open fun getArea() : Double {
        return 0.0
    }
}
