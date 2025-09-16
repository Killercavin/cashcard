package dev.killercavin.cashcard

import org.springframework.data.jpa.repository.JpaRepository

interface CashCardRepository: JpaRepository<CashCard, Long> {
}