package com.claim_management.repository;

import com.claim_management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByUsername(String username);
}