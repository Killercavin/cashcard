package dev.killercavin.cashcard

import jakarta.persistence.*
import jakarta.validation.constraints.Positive
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.math.BigDecimal
import java.time.Instant
import java.util.UUID


@Entity
data class CashCard(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,

    @field:Positive(message = "Amount must be greater than 0")
    var amount: BigDecimal,

    @CreationTimestamp
    val createdAt: Instant? = null,

    @UpdateTimestamp
    var updatedAt: Instant? = null
)


data class CreateCashCardRequest(
    @field:Positive(message = "Amount must be greater than 0")
    val amount: BigDecimal
)

data class CashCardResponse(
    val id: UUID?,
    val amount: BigDecimal,
    val createdAt: Instant?,
    val updatedAt: Instant?
)

fun CashCard.toResponseDTO(): CashCardResponse =
    CashCardResponse(
        id = this.id,
        amount = this.amount,
        createdAt = this.createdAt,
        updatedAt = this.updatedAt
    )

fun CreateCashCardRequest.toEntity(): CashCard =
    CashCard(
        id = null,
        amount = this.amount
    )



