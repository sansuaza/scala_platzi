var a = Option(2)

val b = Option(null)

// en lugar de salir error, si el objeto no existe arroja un none.
val c = Some(null)

// ejemplo
lista.find(x => x == 3).flatMap(x => lista.headOption.map(y => x + y ))
