package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.Daycare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaycareRepository extends JpaRepository<Daycare, Integer>  {

    Daycare findByEmail(String name);
}
