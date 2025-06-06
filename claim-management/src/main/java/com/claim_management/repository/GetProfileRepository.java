package com.claim_management.repository;

import com.claim_management.dto.GetProfileResDTO;
import com.claim_management.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GetProfileRepository extends JpaRepository<Profile, Integer> {

    @Query(value = """
            SELECT id, name, email, phone_number As phoneNumber , hire_date AS hireDate, role, department_id AS departmentId
            FROM employee WHERE name = :username
        """, nativeQuery = true)
    Optional<GetProfileResDTO> getProfileByUser(@Param("username") String username);
}