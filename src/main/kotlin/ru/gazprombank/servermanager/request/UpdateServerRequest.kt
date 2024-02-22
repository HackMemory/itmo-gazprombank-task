package ru.gazprombank.servermanager.request

data class UpdateServerRequest(
    val serverId: Long,
    val name: String,
    val manufacturer: String,
    val ipv4Address: String,
    val ram: Double,
    val storage: Double,
    val responsibleEmployeeId: Long
)