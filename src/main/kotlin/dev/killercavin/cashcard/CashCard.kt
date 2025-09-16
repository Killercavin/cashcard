package dev.killercavin.cashcard

import jakarta.persistence.*
import jakarta.validation.constraints.Positive


@Entity
@Table(name = "CASHCARD")
data class CashCard(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @field:Positive(message = "Amount must be greater than 0")
    val amount: Double
)

data class CreateCashCardRequest(
    val amount: Double
)

data class CashCardResponse(
    val id: Long?,
    val amount: Double
)

fun CashCard.toResponseDTO(): CashCardResponse =
    CashCardResponse(
        id = this.id,
        amount = this.amount
    )

fun CreateCashCardRequest.toEntity(): CashCard =
    CashCard(
        id = null,
        amount = this.amount
    )


