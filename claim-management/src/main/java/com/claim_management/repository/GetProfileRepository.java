package com.claim_management.repository;

import com.claim_management.dto.GetProfileDTO;
import com.claim_management.model.Employee;
import com.claim_management.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GetProfileRepository extends JpaRepository<Profile, Long> {

    @Query(value = """
            SELECT id, name, email, phoneNumber, hireDate, role, departmentId
            FROM employee WHERE name = :username
        """, nativeQuery = true)
    Optional<GetProfileDTO> getProfileByUser(@Param("username") String username);
}