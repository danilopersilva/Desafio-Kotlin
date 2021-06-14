package DesafioKotlin




abstract class Curso(
    open var nomeCurso: Curso,
    var codigoCurso: Integer,
    open var quantidadeMaxAlunos: Integer,
    var codigoProfessor: Integer) {


    abstract val listaAlunos: MutableList<Aluno>
    abstract var professorTitular: Any
    abstract var professorAdjunto: Any
    abstract var novoAlunoMatriculado: Any
    abstract val listaProfessor: MutableList<Curso>
    abstract var listaCurso: MutableList<Curso>
    abstract val codigoDeCurso: Integer
    val cursoProfessorTitular: Professor = TODO()
    val cursoProfessorAdjunto: Professor = TODO()
    var listaAlunosMatriculados: MutableList<Aluno>


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

    abstract fun ProfessorAdjunto(qtdDeHrMonitoria: Integer, nomeProfessor: String, sobrenomeProfessor: String, tempoDeCasa: Integer, codigoProfessor: Integer): ProfessorAdjunto
}

private operator fun Any.compareTo(quantidadeMaxAlunos: Integer): Int {
return 1
}
     

    