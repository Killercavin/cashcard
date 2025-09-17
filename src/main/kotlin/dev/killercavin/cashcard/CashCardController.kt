package dev.killercavin.cashcard

import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("/api/cashcard")
class CashCardController(private val service: CashCardService) {

    @GetMapping("/{requestId}") @ResponseStatus(HttpStatus.OK)
    fun findById(@Validated @PathVariable requestId: UUID): CashCardResponse {
        return service.findById(requestId)
    }

    @PostMapping @ResponseStatus(HttpStatus.CREATED)
    fun addCashCard(@Validated @RequestBody requestBody: CreateCashCardRequest): CashCardResponse {
        return service.createCashCard(requestBody)
    }

    @GetMapping @ResponseStatus(HttpStatus.OK)
    fun getAllCashCards(): List<CashCardResponse> {
        return service.fetchCashCards()
    }
}