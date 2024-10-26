import kotlin.random.Random

fun main(args: Array<String>) {
    var isCorrect = false
    var pointsCount = 0
    while(!isCorrect)
    {
        print("Введите количество точек: ")
        pointsCount = readln().toInt()
        if(pointsCount > 2)
        {
            isCorrect = true
        }
        else
        {
            println("Количество точек должно быть больше двух!")
        }
    }
    var poitns = createPoints(pointsCount) as Array<Point>
    var result = GetMaxDistant(poitns)
    println("Наибольшее растояние между точками = $result")
}

fun GetMaxDistant(massiv : Array<Point>) : Double{
    var maxDistant = 0.0
    for(i in 0..massiv.size - 1)
    {
        for(j in 0..massiv.size - 1)
        {
            if(massiv.get(j) != massiv.get(i))
            {
                var distant = Math.sqrt(Math.pow(massiv.get(j).X - massiv.get(i).X, 2.0) + Math.pow(massiv.get(j).Y - massiv.get(i).Y, 2.0))
                if(distant > maxDistant)
                {
                    maxDistant = distant
                }
            }
        }
    }
    return maxDistant
}

fun createPoints(pointsCount : Int) : Array<Point?>{
    var result = arrayOfNulls<Point>(pointsCount)
    var i = 0
    while (i < result.size)
    {
        var point = Point()
        point.X = Random.nextDouble()
        point.Y = Random.nextDouble()
        if(haveCopy(result, point))
        {
            i--
        }
        else
        {
            result.set(i, point)
        }
        i++
    }
    return result
}

fun haveCopy(massiv : Array<Point?>, elementBeingChecked : Point) : Boolean{
    for(i in 0..massiv.size - 1)
    {
        if(massiv.get(i) != null)
        {
            if((massiv.get(i)?.X == elementBeingChecked.X) && (massiv.get(i)?.Y == elementBeingChecked.Y))
            {
                return true
            }
        }
    }
    return false
}