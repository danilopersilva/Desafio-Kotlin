package DesafioKotlin

class ProfessorTitular(

    especialidade: String = "N/A",

    nomeProfessor: String,

    sobrenomeProfessor: String,

    tempoDeCasa: Int,

    codigoProfessor: Int

) : Professor(nomeProfessor, sobrenomeProfessor, tempoDeCasa, codigoProfessor) {


    override fun equals(other: Any?): Boolean {
        val outroProfessorTitular = other as? ProfessorTitular
        return when (other) {
            is ProfessorAdjunto -> {
                this.nomeProfessor == outroProfessorTitular?.nomeProfessor
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




