package DesafioKotlin


abstract class Aluno(
    val nomeAluno: String,
    val sobrenomeAluno: String,
    var codigoAluno: Integer,

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