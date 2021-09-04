def factorial(n: Long, resultado: Long = 1L): Long =
    if n == 0 {
        println("terminó")
        resultado
    }
    else{
        println(s"Va calculando ${n}")
        factorial(n-1, n * resultado )
    }

// Fold left recorre la lista de derecha a izq, n es el valor que va llegando, y r el acumulador,
// 1L es valor inicial
val (1 to 3).foldLeft(1L)((r, n) => r*n)
