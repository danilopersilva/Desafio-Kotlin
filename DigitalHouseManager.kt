package DesafioKotlin


abstract class DigitalHouseManager {
    val listaAlunosMatriculados: MutableList<Matricula>()
    val listaAlunos: MutableList<Aluno>()
    val listaProfessor: MutableList<Professor>()
    var listaCurso: MutableList<Curso>()


    fun registrarCurso(
        nomeCurso: Curso,
        codigoCurso: Integer,
        quantidadeMaxAlunos: Integer
    ) {
        var novoCurso = Curso(
            nomeCurso = nomeCurso,
            codigoCurso = codigoCurso,
            quantidadeMaxAlunos = quantidadeMaxAlunos,
        )
        if (!listaCurso.contains<Any>(codigoCurso)) {
            listaCurso.add(nomeCurso)
            println("Curso inserido com Sucesso")
        } else {
            println("O Curso já existe")
        }

    }

    abstract fun Curso(nomeCurso: Curso, codigoCurso: Integer, quantidadeMaxAlunos: Integer)

    fun excluirCurso(codigoCurso: Integer) {
        val excluindoCurso = encontrarCurso(codigoCurso)
        if (excluindoCurso != null) {
            listaCurso.remove(excluindoCurso)
            println("Curso ${excluindoCurso.nomeCurso} removido com sucesso")

        } else {
            println("Curso não encontrado")
        }

    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Integer,
        quantidadeDeHoras: Integer
    ) {
        val novoProfessorAdjunto = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, 0, codigoProfessor)
        if (!listaProfessor.contains(novoProfessorAdjunto)) {
            listaProfessor.add(novoProfessorAdjunto)
            println("Professor adjunto ${novoProfessorAdjunto.nomeProfessor} ${novoProfessorAdjunto.sobrenomeProfessor} registrado com sucesso")
        } else {
            println("O professor adjunto ${novoProfessorAdjunto.nomeProfessor} ${novoProfessorAdjunto.sobrenomeProfessor} já está registrado")
        }
    }


    fun registrarProfessorTitular(
        nomeProfessor: String,
        sobrenomeProfessor: String,
        codigoProfessor: Integer,
        especialidade: String
    ) {
        val novoProfessorTitular =
            ProfessorTitular(especialidade, nomeProfessor, sobrenomeProfessor, 0, codigoProfessor)

        if (!listaProfessor.contains<Any>(novoProfessorTitular)) {
            listaProfessor.add(novoProfessorTitular)
            println("Professor titular ${novoProfessorTitular.nomeProfessor} ${novoProfessorTitular.sobrenomeProfessor} registrado com sucesso")
        } else {
            println("O professor titular ${novoProfessorTitular.nomeProfessor} ${novoProfessorTitular.sobrenomeProfessor} já está registrado")
        }
    }

    fun excluirProfessor(codigoProfessor: Integer) {
        val professor = encontrarProfessor(codigoProfessor)
        if (professor != null) {
            listaProfessor.remove(professor)
        } else {
            listaProfessor.remove<Any>(codigoProfessor)
        }

    }

    fun matricularAluno(nomeAluno: String, sobrenomeAluno: String, codigoAluno: Integer) {
        val novoAluno = Aluno(nomeAluno, sobrenomeAluno, codigoAluno)
        if (!listaAlunos.contains(novoAluno)) {
            listaAlunos.add(novoAluno)
            println("Aluno ${novoAluno.nomeAluno} ${novoAluno.sobrenomeAluno} matriculado com sucesso")
        } else {
            println("O aluno ${novoAluno.nomeAluno} ${novoAluno.sobrenomeAluno} já está matriculado")
        }

    }


    fun matricularAluno(codigoAluno: Integer, codigoCurso: Integer) {
        val aluno = encontrarAluno(codigoAluno)
        val curso = encontrarCurso(codigoCurso)

        if (curso != null && aluno != null) {

            if (curso.adicionarUmAluno(aluno)) {
                val novaMatricula = Matricula(aluno, curso)
                listaAlunos.add(novaMatricula)
                println("Aluno ${aluno.nomeAluno} matriculado no curso de ${curso.nomeCurso} com sucesso. Data da matricula ${novaMatricula.dataMatricula}")
            } else {
                verificaPorqueNaoEPossivelMatricular(curso, aluno)
            }
        } else {
            println("Dados para matricula não encontrados")
        }
    }

    fun alocarProfessores(codigoCurso: Integer, codigoProfessorTitular: Integer, codigoProfessorAdjunto: Integer) {
        val titular = encontrarProfessor(codigoProfessorTitular)
        val adjunto = encontrarProfessor(codigoProfessorAdjunto)
        val curso = encontrarCurso(codigoCurso)

        if (titular != null && adjunto != null && curso != null) {

            if (curso.professorAdjunto == null && curso.professorTitular == null) {
                curso.professorAdjunto = adjunto
                curso.professorTitular = titular
                println("Professores ${titular.nomeProfessor} e ${adjunto.nomeProfessor} alocados no curso ${curso.nomeCurso}")
            } else {
                println("O curso ${curso.nomeCurso} já possui os professores alocados")

            }
        } else {
            println("Dados para alocação não encontrados")
        }
    }

    fun encontrarCurso(codigoCurso: Integer): Curso? {
        var cursoEncontrado: Curso? = null
        listaCurso.forEach { curso ->
            if (curso.codigoCurso == codigoCurso) {
                cursoEncontrado = curso
            }
        }
        return cursoEncontrado
    }

    fun encontrarAluno(codigoAluno: Integer): Aluno? {
        var alunoEncontrado: Aluno? = null
        val listaAlunos = listaAlunos
        listaAlunos.forEach { aluno ->
            if (aluno.codigoAluno == codigoAluno) {
                alunoEncontrado = aluno
            }
        }
        return alunoEncontrado
    }

    fun encontrarProfessor(codigoProfessor: Integer): Professor? {
        var professorEncontrado: Professor? = null
        listaProfessor.forEach { professor ->
            if (professor.codigoProfessor === codigoProfessor) {
                professorEncontrado == professor
            }
        }
        return professorEncontrado
    }

    fun encontrarMatricula(curso: Curso, aluno: Aluno): Boolean {
        var aux = false

        listaAlunosMatriculados.forEach { matricula ->
            if (matricula.curso == curso && matricula.aluno == aluno) {
                aux = true
            }
        }
        return aux
    }

    fun verificaPorqueNaoEPossivelMatricular(curso: Curso, aluno: Aluno) {
        if (encontrarMatricula(curso, aluno)) {
            println("Aluno ${aluno.nomeAluno} já está matriculado no curso de ${curso.nomeCurso}")
        } else {
            println("Quantidade maxima de ${curso.quantidadeMaxAlunos} vagas já preenchidas para o curso de ${curso.nomeCurso}")
        }
    }
}



}


























