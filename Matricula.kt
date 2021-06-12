package DesafioKotlin

import java.util.*

abstract class Matricula(matriculaAlunos: Alunos, matriculaCurso: Curso, var data: Date)

{

    fun criarMatricula(matriculaAlunos: Alunos, matriculaCurso: Curso, data: Date){


        val datacadastro = Calendar.getInstance().time

        if (data == Calendar.getInstance().time){
            println("Matricula inserida com sucesso")
        }
    }
}


