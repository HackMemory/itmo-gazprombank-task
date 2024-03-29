package ru.gazprombank.servermanager.converter

import ru.gazprombank.servermanager.dto.DepartmentDTO
import ru.gazprombank.servermanager.model.Company
import ru.gazprombank.servermanager.request.CreateDepartmentRequest
import ru.gazprombank.servermanager.model.Department

fun CreateDepartmentRequest.toDepartment(company: Company): Department {
    return Department(
        name = this.name,
        company = company
    )
}

fun Department.toDTO(): DepartmentDTO {
    return DepartmentDTO(
        departmentId = this.departmentId,
        name = this.name,
        companyId = this.company?.companyId
    )
}