package net.UnitSC.departmentservice.service.Impl;

import lombok.AllArgsConstructor;
import net.UnitSC.departmentservice.dto.DepartmentDto;
import net.UnitSC.departmentservice.entity.Department;
import net.UnitSC.departmentservice.exception.DepartmentNotFoundException;
import net.UnitSC.departmentservice.mapper.AutoDepartmentMapper;
import net.UnitSC.departmentservice.repository.DepartmentRepository;
import net.UnitSC.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    // inject the dependency
    private DepartmentRepository departmentRepository;


    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = AutoDepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;


    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Optional<Department> optionaldepartment = departmentRepository.findByDepartmentCode(departmentCode);
        Department department = optionaldepartment.orElseThrow(() -> new DepartmentNotFoundException("department", "code", departmentCode));
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);
    }
}
