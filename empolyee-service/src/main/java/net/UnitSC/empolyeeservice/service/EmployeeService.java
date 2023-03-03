package net.UnitSC.empolyeeservice.service;

import net.UnitSC.empolyeeservice.dto.APIResponseDto;
import net.UnitSC.empolyeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
