package DesafioKotlin

class ProfessorAdjunto(

    qtdDeHrMonitoria: Int,

    nomeProfessor: String,

    sobrenomeProfessor: String,

    tempoDeCasa: Int,

    codigoProfessor: Int


) : Professor(nomeProfessor,sobrenomeProfessor,tempoDeCasa,codigoProfessor) {

    override fun equals(other: Any?): Boolean {
        val outroProfessorAdjunto = other as? ProfessorAdjunto
        return when (other) {
            is ProfessorAdjunto -> {
                this.nomeProfessor == outroProfessorAdjunto?.nomeProfessor
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

