package com.mercadolivro.service

import com.mercadolivro.enums.CustomerStatus
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository,
    val booksService: BookService
) {
    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?) : List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(name)
        }
        return customerRepository.findAll().toList()
    }

    fun findById(id: Int) : CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }


    fun createCustomer(customer: CustomerModel) {
       customerRepository.save((customer))
    }

    fun update(customer: CustomerModel) {
        if (customerRepository.existsById(customer.id!!)) {
            throw Exception()
        }
        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        val customer = findById(id)
        booksService.deleteByCustomer(customer)
        customer.status = CustomerStatus.INATIVO
        customerRepository.save(customer)
    }
}