package ru.gazprombank.servermanager.model

import jakarta.persistence.*

@Entity
data class Company(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val companyId: Long = 0,
    val name: String
)