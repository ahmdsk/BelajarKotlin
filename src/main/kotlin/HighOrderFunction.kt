fun sayThanks(name: String, transformer: (String) -> String): String {
    return "Hello, Thanks for give pineapple ${transformer(name)}"
}
fun main() {
    val upperTransformer = { value: String -> value.toUpperCase() }

    println(sayThanks("ahmad ganteng", upperTransformer))
    println(sayThanks("AHMAD GANTENG", { value: String -> value.toLowerCase() }))

//  Trailing lambda
    println(sayThanks("Aku Ganteng") { value: String -> value.toUpperCase() })
}