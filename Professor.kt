package DesafioKotlin

open class Professor(
    val nomeProfessor: String,
    val sobrenomeProfessor: String,
    val tempoDeCasa: Integer,
    var codigoProfessor: Integer
) {
    override fun equals(other: Any?): Boolean {
        val outroProfessor = other as? Professor
        return when (other) {
            is Professor -> {
                this.nomeProfessor == outroProfessor?.nomeProfessor
            }
            is Double -> {
                true
            }
            else -> {
                super.equals(other)
            }
        }
    }
}
