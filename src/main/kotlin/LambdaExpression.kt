fun main() {
    val lambdaName: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "Hello $firstName $lastName"
        result
    }

    val lambdaSingleArgs: (Number) -> String = {
        "Umur Kamu $it"
    }

    println(lambdaName("Ahmad", "Shaleh"))
    println(lambdaSingleArgs(18))
}