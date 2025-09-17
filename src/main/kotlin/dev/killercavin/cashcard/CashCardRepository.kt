package dev.killercavin.cashcard

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface CashCardRepository: CrudRepository<CashCard, UUID> {
}