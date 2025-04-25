package com.claim_management.repository;

import com.claim_management.dto.GetEmployeeResDTO;
import com.claim_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ClaimRepository extends JpaRepository<Employee, Integer>{


        @Query(value = """
            Select employee.id AS employeeId, employee.name AS employeeName, employee.email AS email, employee.phone_number AS phoneNumber,
            department.id AS departmentId, department.name AS departmentName FROM employee
             JOIN department on department.id = employee.department_id
             where employee.id =:employeeId;
        """, nativeQuery = true)
        Optional<GetEmployeeResDTO> getEmployee(@Param("employeeId") int employeeId);

}
