package br.edu.ifsp.scl.ads.views

class Formulario{
    var nome:String = ""
    var sobrenome:String = ""
    var email:String = ""
    var estadoCivil:String = ""
    var sexo:String=""

    constructor(nome: String, sobrenome: String, email: String, estadoCivil: String, sexo: String) {
        this.nome = nome
        this.sobrenome = sobrenome
        this.email = email
        this.estadoCivil = estadoCivil
        this.sexo = sexo
    }


    override fun toString(): String {
        return "nome ='$nome', sobrenome ='$sobrenome', " +
                "email ='$email', estadoCivil ='$estadoCivil'," +
                " sexo='$sexo')"
    }


}