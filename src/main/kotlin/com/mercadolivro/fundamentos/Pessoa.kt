package com.mercadolivro.fundamentos

import org.springframework.data.jpa.domain.AbstractPersistable_.id

class Pessoa {

    fun test() {
        var floatt = 1.3f //float
        var doublee = 1.2 //declara como double

        var nome : String? = "Camila"
        nome.let {  } //se nao for nulo executa o let
       // val toShort : Short = nome?.length?.toShort() vai dar erro
        // o !! é usado para afirmar que o valor nao sera nulo, tenho certeza que nao vai ser nulo !! entao nao sera
        //feito vailidacao
        // ai nao precisa dos ??
        val toShort : Short = nome!!.length.toShort()

        val tamanho : Int = nome?.length ?: 0 //elvis operator, se nome == null tamanho recebe
        var lista :List<Int?>?; //a lista pode conter valores inmteiros e nulos e a propria lista pode ser nula


        //tipo list é imutavel, ou seja nmao consigo fazer isso:
        var listaImutavel = listOf(1,2,3,4)
        //listaImutavel.add(3) isso nao funciona por que a lista e imutavel

        var listaMutavel = mutableListOf(1,2,3,4)
        listaMutavel.add(5)

        //orElseThrow se nao achar o valor retorna uma exceccao

        //return customerRepository.findById(id).orElseThrow()
    }

}