package com.example.cadastro

import android.provider.ContactsContract

class Formulario (
    var nome: String,
    var telefone: ContactsContract.CommonDataKinds.Phone,
    var email: ContactsContract.CommonDataKinds.Email,
    var comunicacoes: Boolean,
    var sexo: String,
    var cidade: String,
    var uf: String
){
    override fun toString(): String {
        return "Formulario(nome='$nome', telefone=$telefone, email=$email, comunicacoes=$comunicacoes, sexo='$sexo', cidade='$cidade', uf='$uf')"
    }
}