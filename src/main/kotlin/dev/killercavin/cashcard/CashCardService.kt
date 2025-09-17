package dev.killercavin.cashcard

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.UUID

@Service
class CashCardService(private val repository: CashCardRepository) {
    fun findById(requestId: UUID): CashCardResponse {
        return repository.findById(requestId).map { it.toResponseDTO() }
            .orElseThrow {
                ResponseStatusException(HttpStatus.NOT_FOUND, "CashCard with id $requestId not found")
            }
    }

    fun createCashCard(request: CreateCashCardRequest): CashCardResponse {
        val newCashCard = repository.save(request.toEntity())

        return newCashCard.toResponseDTO()
    }

    fun fetchCashCards(): List<CashCardResponse> {
        return repository.findAll().map { it.toResponseDTO() }
    }
}