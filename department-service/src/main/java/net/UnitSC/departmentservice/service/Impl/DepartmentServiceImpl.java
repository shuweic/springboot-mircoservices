package net.UnitSC.departmentservice.service.Impl;

import lombok.AllArgsConstructor;
import net.UnitSC.departmentservice.dto.DepartmentDto;
import net.UnitSC.departmentservice.entity.Department;
import net.UnitSC.departmentservice.repository.DepartmentRepository;
import net.UnitSC.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    // inject the dependency
    private DepartmentRepository departmentRepository;


    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getDepartmentName(),
                savedDepartment.getDepartmentDescription(),
                savedDepartment.getDepartmentCode()
        );

        return savedDepartmentDto;
    }
}
