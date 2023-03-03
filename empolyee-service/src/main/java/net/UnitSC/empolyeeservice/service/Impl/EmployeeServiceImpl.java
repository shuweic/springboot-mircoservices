package net.UnitSC.empolyeeservice.service.Impl;

import lombok.AllArgsConstructor;
import net.UnitSC.empolyeeservice.dto.EmployeeDto;
import net.UnitSC.empolyeeservice.entity.Employee;
import net.UnitSC.empolyeeservice.mapper.AutoEmployeeMapper;
import net.UnitSC.empolyeeservice.repository.EmployeeRepository;
import net.UnitSC.empolyeeservice.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = AutoEmployeeMapper.MAPPER.mapToEmployee(employeeDto);

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = AutoEmployeeMapper.MAPPER.mapToEmployeeDto(savedEmployee);

        return savedEmployeeDto;

    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId).get();

        return AutoEmployeeMapper.MAPPER.mapToEmployeeDto(employee);
    }
}
