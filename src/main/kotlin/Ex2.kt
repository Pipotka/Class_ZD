fun main(args: Array<String>) {
    var firstPoint : Point = Point()
    firstPoint.X = Input("Введите координату X для первой точки: ")
    firstPoint.Y = Input("Введите координату Y для первой точки: ")

    var secondPoint : Point = Point()
    secondPoint.X = Input("Введите координату X для второй точки: ")
    secondPoint.Y = Input("Введите координату Y для второй точки: ")

    var distant = Math.sqrt(Math.pow(firstPoint.X - secondPoint.X, 2.0) + Math.pow(firstPoint.Y - secondPoint.Y, 2.0))
    println("Расстояние между точками равно = $distant")
}