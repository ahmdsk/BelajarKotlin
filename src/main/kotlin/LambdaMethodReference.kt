fun toUpper(value: String): String = value.toUpperCase()
fun toLower(value: String): String = value.toLowerCase()
fun sayHelloWithAge(fullName: String, age: Number): String = "Hello $fullName, your age $age"

fun main() {
    val lambdaRef: (String) -> String = ::toUpper

    val lambdaRefTwoArgs: (String, Number) -> String = ::sayHelloWithAge

    val lambdaRefTes: (String) -> String = ::toLower

    println(lambdaRef("yanTo"))
    println(lambdaRefTwoArgs("Narto", 20))
    println(lambdaRefTes("kEcIl SemUA"))
}