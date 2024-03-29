package ru.gazprombank.servermanager.converter

import ru.gazprombank.servermanager.dto.CompanyDTO
import ru.gazprombank.servermanager.request.CreateCompanyRequest
import ru.gazprombank.servermanager.model.Company

fun CreateCompanyRequest.toCompany(): Company {
    return Company(
        name = this.name
    )
}

fun Company.toDTO(): CompanyDTO {
    return CompanyDTO(
        companyId = this.companyId,
        name = this.name
    )
}