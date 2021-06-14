package DesafioKotlin


class Aluno(
    val nomeAluno: String,
    val sobrenomeAluno: String,
    var codigoAluno: Int,

    )

{
override fun equals(other: Any?): Boolean {
    val outroAluno = other as? Aluno
    return when (other) {
        is Aluno -> {
            this.nomeAluno == outroAluno?.nomeAluno
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