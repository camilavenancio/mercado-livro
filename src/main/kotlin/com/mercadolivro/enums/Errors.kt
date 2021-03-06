package com.mercadolivro.enums

import org.springframework.data.jpa.domain.AbstractPersistable_.id

enum class Errors(val code: String, val message: String) {
    ML001("ML-001", "Invalid Request"),
    ML101("ML-101", "Book [%s] not exists"),
    ML102("ML-102", "Can not update book with status [%s]"),
    ML201("ML-202", "Customer [%s] not exists")
}