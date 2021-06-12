package DesafioKotlin


private val <E> MutableList<E>.length: Any
    get() {
        return 1
    }

abstract class Curso(nomeCurso: Curso, codigoCurso: Integer, quantidadeMaxAlunos: Integer, val codigoProfessor: Integer) {

    abstract var novoAlunoMatriculado: Any
    abstract val listaProfessor: MutableList<Curso>
    abstract var listaCurso: MutableList<Curso>
    abstract var nomeCurso: String
    abstract val codigoDeCurso: Integer
    abstract val quantidadeMaxAlunos: Integer
    val cursoProfessorTitular: Professor = TODO()
    val cursoProfessorAdjunto: Professor = TODO()
    var listaAlunosMatriculados: MutableList<Alunos>


    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }


    fun adicionarUmAluno(umAlunos: Alunos): Boolean {

        if (adicionandoAluno(umAlunos)) {
            listaAlunosMatriculados.add(umAlunos)
            return true
        }
        return false
    }

    fun adicionandoAluno(umAlunos: Alunos) =
        !listaAlunosMatriculados.contains(Char, umAlunos) && (listaAlunosMatriculados.length < quantidadeMaxAlunos)


    fun excluirAluno(umAlunos: Alunos) {
        if (listaAlunosMatriculados.contains(umAlunos)) {
            listaAlunosMatriculados.remove(umAlunos)
            println("Aluno ${umAlunos.nomeAluno} excluido com Sucesso")
        } else {
            println("Aluno não encontrado")
        }
    }


    operator fun Int.compareTo(quantidadeMaxAlunos: Integer): Int {
        return 1
    }


    private fun String.remove(umAlunos: Alunos) {

    }

    private fun String.contains(umAlunos: Alunos): Boolean {
        return true
    }

    operator fun Any.not(): Boolean {
        return true
    }

    private fun String.contains(char: Char.Companion, umAlunos: Alunos): Any {
        return 1
    }

    private fun String.add(umAlunos: Alunos) {

    }

    abstract fun Curso(curso: Curso, codigoCurso: Integer, quantidadeMaxAlunos: Integer, nomeCurso: Curso): Curso
    abstract fun Alunos(nomeAluno: String, sobrenomeAluno: String, codigoDeAluno: Integer): Alunos
    abstract fun Curso(nomeCurso: Curso, codigoCurso: Integer, quantidadeMaxAlunos: Integer): Curso
}

private operator fun Any.compareTo(quantidadeMaxAlunos: Integer): Int {
 return 1
}

private operator fun Any.compareTo(quantidadeMaxAlunos: Int): Int {
    return 1
}

private fun <E> MutableList<E>.contains(element: Char.Companion, umAluno: E): Boolean {
    return true
}










