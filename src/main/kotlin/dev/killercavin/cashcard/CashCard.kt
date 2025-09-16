package dev.killercavin.cashcard

import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotBlank


@Table(name = "CASHCARD")
data class CashCard(
    @Id var id: Long?,
   @field:NotBlank(message = "Amount cannot be blank") var amount: Double
)
