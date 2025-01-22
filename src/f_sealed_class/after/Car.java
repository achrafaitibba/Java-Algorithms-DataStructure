package f_sealed_class.after;

//Must be final/sealed/non-sealed (to control if it's extensible)
// final -> strictly not extensible
// non-sealed ->
// sealed -> to control allowed subclasses
sealed class Car extends Service permits test {
}
