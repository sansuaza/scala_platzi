//Diferences between tail recursion and recursion

// Recursion
def factorial(n: Long): Long =
    if n == 0 {
        println("terminó")
        1
    }
    else{
        println(s"Va calculando ${n}")
        n * factorial(n-1)
    }

//Tail recursion
def factorial(n: Long, resultado: Long = 1L): Long =
    if n == 0 {
        println("terminó")
        resultado
    }
    else{
        println(s"Va calculando ${n}")
        factorial(n-1, n * resultado )
    }
