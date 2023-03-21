fun sayThanks(name: String, transformer: (String) -> String): String {
    return "Hello, how are you? ${transformer(name)}"
}
fun main() {
    val upperTransformer = { value: String -> value.toUpperCase() }
    val lowerTransformer = { value: String -> value.toLowerCase() }

    println(sayThanks("ahmad ganteng", upperTransformer))
    println(sayThanks("SELAMAT BERBUKA PUASA", lowerTransformer))
}