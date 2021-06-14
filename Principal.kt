package DesafioKotlin

fun main() {
    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("MESINA", "Professor2", 55, "Mobile")
    digitalHouseManager.registrarProfessorAdjunto("deefef", "Adjunto", 555, 40)


    digitalHouseManager.alocarProfessores(20001, 5, 55)
    digitalHouseManager.alocarProfessores(20002, 555, 5555)
}






