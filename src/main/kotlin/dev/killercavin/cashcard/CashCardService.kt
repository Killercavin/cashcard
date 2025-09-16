package dev.killercavin.cashcard

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class CashCardService(private val repository: CashCardRepository) {
    fun findById(requestId: Long): CashCardResponse {
        val cashCard = repository.findById(requestId)
            .orElseThrow {
                ResponseStatusException(HttpStatus.NOT_FOUND, "CashCard with id $requestId not found")
            }

        return cashCard.toResponseDTO()
    }

    fun createCashCard(request: CreateCashCardRequest): CashCardResponse {
        val newCashCard = repository.save(request.toEntity())

        return newCashCard.toResponseDTO()
    }
}