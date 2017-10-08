package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Daycare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChildRepository extends JpaRepository<Child, Integer>{

    @Query(value = "SELECT * FROM daycare WHERE email = ?1", nativeQuery = true)
    Daycare findByEmail(String emailAddress);

}
