package dev.killercavin.cashcard

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cashcard")
class CashCardController {

    @GetMapping("/{requestId}") @ResponseStatus(HttpStatus.OK)
    fun findById(@PathVariable requestId: Long) {
    }
}