import java.lang.Exception

fun main(args: Array<String>) {
    var X = Input("Введите координату X проверяемой точки: ")
    var Y = Input("Введите координату Y проверяемой точки: ")
    var treangle : Triangle = Triangle()
    treangle.FirstPoint.X = Input("Введите координату X для первой точки треугольника: ")
    treangle.FirstPoint.Y = Input("Введите координату Y для первой точки треугольника: ")
    treangle.SecondPoint.X = Input("Введите координату X для второй точки треугольника: ")
    treangle.SecondPoint.Y = Input("Введите координату Y для второй точки треугольника: ")
    treangle.ThirdPoint.X = Input("Введите координату X для третьей точки треугольника: ")
    treangle.ThirdPoint.Y = Input("Введите координату Y для третьей точки треугольника: ")
    var a = (treangle.FirstPoint.X - X) * (treangle.SecondPoint.Y - treangle.FirstPoint.Y) - (treangle.SecondPoint.X - treangle.FirstPoint.X) * (treangle.FirstPoint.Y - Y)
    var b = (treangle.SecondPoint.X - X) * (treangle.ThirdPoint.Y - treangle.SecondPoint.Y) - (treangle.ThirdPoint.X - treangle.SecondPoint.X) * (treangle.SecondPoint.Y - Y)
    var c = (treangle.ThirdPoint.X - X) * (treangle.FirstPoint.Y - treangle.ThirdPoint.Y) - (treangle.FirstPoint.X - treangle.ThirdPoint.X) * (treangle.ThirdPoint.Y - Y)

    if((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0))
    {
        println("Точка принадлежит треугольнику")
    }
    else
    {
        println("Точка не принадлежит треугольнику")
    }

}

fun Input(message : String) : Double{
    var isCorrect = false
    var result : Double = 0.0
    while(!isCorrect)
    {
        try {
            println(message)
            result = readln().toDouble()
            isCorrect = true
        }
        catch(e : Exception)
        {
            print("Значение введено неверно. Дробное значение должно быть в десятичном представлении и разделённое точкой")
        }
    }
    return result
}