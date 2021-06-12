package DesafioKotlin



open class DigitalHouseManager(
    val listaAlunos: MutableList<Alunos>,
    val listaProfessor: MutableList<Professor>,
    var listaCurso: MutableList<Curso>,
    val listaMatricula: MutableList<Matricula>

) {

    class novoCurso(nomeCurso: Curso, codigoCurso: Integer, quantidadeMaxAlunos: Integer,
                    override var novoAlunoMatriculado: Any,
                    override val listaProfessor: MutableList<Curso>, codigoProfessor: Any
    ) : Curso(
        nomeCurso,
        codigoCurso,
        quantidadeMaxAlunos, codigoProfessor as Integer
    ) {
        override lateinit var listaCurso: MutableList<Curso>
        override var nomeCurso: String = TODO()
        override var codigoDeCurso: Integer
        override val quantidadeMaxAlunos: Integer

        fun registrarCurso(
            nomeCurso: Curso,
            codigoCurso: Integer,
            quantidadeMaxDeAlunos: Integer
        ) {
            val novoCurso = Curso(
                nomeCurso = nomeCurso,
                codigoCurso = codigoCurso,
                quantidadeMaxAlunos = quantidadeMaxAlunos,
            )
            if (!listaCurso.contains(codigoCurso)) {
                listaCurso.add(nomeCurso)
                println("Curso inserido com Sucesso")
            } else {
                println("O Curso já existe")
            }

        }

        override fun equals(other: Any?): Boolean {
            val outroCurso = other as? Curso
            return when (other) {
                is Curso -> {
                    this.listaCurso == outroCurso?.listaCurso
                }
                is Double -> {
                    true
                }
                else -> {
                    super.equals(other)
                }
            }
        }

        override fun Curso(curso: Curso, codigoCurso: Integer, quantidadeMaxAlunos: Integer, nomeCurso: Curso): Curso {
            TODO("Not yet implemented")
        }

        override fun Curso(nomeCurso: Curso, codigoCurso: Integer, quantidadeMaxAlunos: Integer): Curso {
            TODO("Not yet implemented")
        }

        override fun Alunos(nomeAluno: String, sobrenomeAluno: String, codigoDeAluno: Integer): Alunos {
            TODO("Not yet implemented")
        }

        fun excluirCurso(codigoCurso: Integer) {
            val excluindoCurso = listaCurso.find { it.codigoDeCurso == codigoCurso }
            if (codigoCurso == null) {
                println("Curso não encontrado")

            } else {
                listaCurso.remove(codigoCurso)
            }

        }

        fun registrarProfessorAdjunto(
            nome: String,
            sobrenome: String,
            codigoProfessor: Integer,
            qtdDeHrMonitoria: Integer
        ) {
            val novoProfessorAdjunto = ProfessorAdjunto(
                qtdDeHrMonitoria = qtdDeHrMonitoria, nomeProfessor = nome, sobrenomeProfessor = sobrenome,
                tempoDeCasa = 0, codigoProfessor = codigoProfessor
            )
            if (!listaProfessor.contains(novoProfessorAdjunto)) {
                listaProfessor.add(novoProfessorAdjunto)
                println("Professor adjunto ${novoProfessorAdjunto.nomeProfessor} ${novoProfessorAdjunto.sobrenomeProfessor} registrado com sucesso")
            } else {
                println("O professor adjunto ${novoProfessorAdjunto.nomeProfessor} ${novoProfessorAdjunto.sobrenomeProfessor} já está registrado")
            }
        }

        fun registrarProfessorTitular(
            nome: String,
            sobrenome: String,
            codigoProfessor: Integer,
            especialidade: String
        ) {
            val novoProfessorTitular = ProfessorTitular(
                especialidade, nomeProfessor = nome, sobrenomeProfessor = sobrenome,
                tempoDeCasa = 0,
                codigoProfessor = codigoProfessor
            )
            if (!listaProfessor.contains(novoProfessorTitular)) {
                listaProfessor.add(novoProfessorTitular)
                println("Professor titular ${novoProfessorTitular.nomeProfessor} ${novoProfessorTitular.sobrenomeProfessor} registrado com sucesso")
            } else {
                println("O professor titular ${novoProfessorTitular.nomeProfessor} ${novoProfessorTitular.sobrenomeProfessor} já está registrado")
            }
        }

        fun excluirProfessor(codigoProfessor: Integer) {
            val excluindoProfessor = listaProfessor.find { it.codigoProfessor == codigoProfessor }
            if (codigoProfessor == null) {
                println("Professor não está cadastrado")

            } else {
                listaProfessor.remove(codigoProfessor)
            }

        }

        fun matricularAluno(
            nomeAluno: String,
            sobrenomeAluno: String,
            codigoDeAluno: Int,
            listaAlunos: MutableList<Alunos>,
            nome: String

        ) {

            val novoAlunoMatriculado = Alunos(nomeAluno = nomeAluno, sobrenomeAluno = sobrenomeAluno, codigoDeAluno = codigoDeCurso)
            if (!listaAlunos.contains(novoAlunoMatriculado)) {
                listaAlunos.add(novoAlunoMatriculado)
                println("Aluon ${novoAlunoMatriculado.nomeAluno} ${novoAlunoMatriculado.sobrenomeAluno} matricula com sucesso")
            } else {
                println("O Aluno ${novoAlunoMatriculado.nomeAluno} ${novoAlunoMatriculado.sobrenomeAluno} já está Matriculado no Curso")
            }
        }


        private fun Any.add(curso: Any) {

        }

        private fun Any.contains(curso: Any): Any {
            return 1
        }

        private fun <E> List<E>.add(curso: String) {
            TODO("Not yet implemented")
        }

        private fun <E> List<E>.remove(codigoCurso: Integer): Int {
            return 1
        }
    }

    private fun Any.add(novoAlunoMatriculado: Any) {

    }

    private fun Any.contains(novoAlunoMatriculado: Any): Any {
return 1
    }

    private fun <E> MutableList<E>.add(element: String) {

    }
}



