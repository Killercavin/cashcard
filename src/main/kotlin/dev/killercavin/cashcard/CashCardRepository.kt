package dev.killercavin.cashcard

import org.springframework.data.repository.CrudRepository

interface CashCardRepository: CrudRepository<CashCard, Long> {
}