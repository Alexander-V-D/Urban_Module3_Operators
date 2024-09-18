const val pi = 3.14

fun main() {
    //Переменная для задачи 1
    val square1A = 5
    //Переменная для задачи 2
    val square2A = 4
    //Переменные для задачи 3
    val rectangleA = 3
    val rectangleB = 6
    //Переменная для задачи 4
    val circleDiameter = 7
    //Переменная для задачи 5
    val length = 684
    //Переменные для задачи 6
    val a = 10
    val b = 3
    println("""
        |Периметр квадрата 1 = ${square1A * 4}
        |Площадь квадрата 2 = ${square2A * square2A}
        |Периметр прямоугольника = ${2 * (rectangleA + rectangleB)}
        |Площадь прямоугольника = ${square1A * square2A}
        |Длинна окружности = ${circleDiameter * pi}
        |Число полных метров в $length см равно: ${length / 100}
        |Число отрезков В длинной $b расположенных на отрезке А длинной $a равно: ${a / b}
    """.trimIndent())
}
