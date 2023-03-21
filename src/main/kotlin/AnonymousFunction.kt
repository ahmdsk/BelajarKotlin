fun main() {

    fun callGrade(nilai: Int, transform: (Int) -> String): String {
        return "Halo pada semester kali ini nilai kamu ${transform(nilai)}"
    }

    val checkGrade = fun(value: Int): String {
        return when {
            value >= 70 -> "A"
            value >= 50 -> "B"
            else -> "C"
        }
    }

    println(callGrade(80, checkGrade))
    println(callGrade(60, checkGrade))
    println(callGrade(45, checkGrade))

    println(callGrade(45, fun(value: Int): String {
        return if(value >= 0) { "Mengerjakan Tugas" }
        else { "Tidak Mengerjakan Tugas" }
    }))

}
