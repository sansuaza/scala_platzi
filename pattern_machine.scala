var saludo = "hi"
saludo match {
    case "mundo" => "oo"
    case "hola" => "aa"
}

def g(x: Seq[Int]) = x match {
    case List(a, b, c) => a + b + c
    case List(a,b,c,d) => a + b + c + d
    case _ => 0
}

case class  Persona(nombre : String, edad: Int)

val p1 = Persona("Maria", 20)

val p2 = Persona("Fredy", 15)

def h(x:Persona) = x match {
    case y if y.edad >= 18 && y.nombre == "Maria"=> "Maria es mayor de edad"
    case _ => "No es mayor de edad"
}
