Right(10).map(_ + 1)
// como map opera por la derecha, si hace la operación
// Satisfactoriamente

Left(10).map(_ + 1)
// lanza error, ya que en el lado derecho (por donde opera)
// .map es un nothing entonces se debe indicar al compilador
// el tipo disponible
left[Int, Int](10).map(_ + 1)
