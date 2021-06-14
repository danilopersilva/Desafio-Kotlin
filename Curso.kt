package DesafioKotlin




class Curso(
    open var nomeCurso: Curso,
    var codigoCurso: Int,
    open var quantidadeMaxAlunos: Int,
    var professorTitular: Professor? = null,
    var professorAdjunto: Professor? = null
) {



    lateinit var listaAlunosMatriculados: MutableList<Aluno>


    override fun hashCode(): Int {
        return super.hashCode()
    }


    fun adicionarUmAluno(umAlunos: Aluno): Boolean {

        if (adicionandoAluno(umAlunos)) {
            listaAlunosMatriculados.add(umAlunos)
            return true
        }
        return false
    }

    fun excluirAluno(umAlunos: Aluno) {
        if (listaAlunosMatriculados.contains(umAlunos)) {
            listaAlunosMatriculados.remove(umAlunos)
            println("Aluno ${umAlunos.nomeAluno} excluido com Sucesso")
        } else {
            println("Aluno não encontrado")
        }
    }

    fun adicionandoAluno(umAlunos: Aluno) =
        !listaAlunosMatriculados.contains(umAlunos) && (listaAlunosMatriculados.size < quantidadeMaxAlunos)

    operator fun Int.compareTo(quantidadeMaxAlunos: Integer): Int {
        return 1
    }

    override fun equals(other: Any?): Boolean {
        val outroCurso = other as? Curso
        return when (other) {
            is Curso -> {
                this.nomeCurso == outroCurso?.nomeCurso
            }
            is Double -> {
                true
            }
            else -> {
                super.equals(other)
            }
        }
    }
    fun Curso(nomeCurso: Curso, codigoCurso: Int, quantidadeMaxAlunos: Int): Curso {
TODO()
    }


}

private operator fun Any.compareTo(quantidadeMaxAlunos: Integer): Int {
return 1
}
     

    