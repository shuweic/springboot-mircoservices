package net.UnitSC.empolyeeservice.repository;

import net.UnitSC.empolyeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
