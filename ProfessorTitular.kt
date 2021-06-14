package DesafioKotlin

abstract class ProfessorTitular(

    especialidade: String = "N/A",

    nomeProfessor: String,

    sobrenomeProfessor: String,

    tempoDeCasa: Integer,

    codigoProfessor: Integer

) : Professor(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor) {

}
