package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.Child;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ChildRepository extends JpaRepository<Child, Integer>{

    List<Child> findAllByOwnerId(Integer id);
}
