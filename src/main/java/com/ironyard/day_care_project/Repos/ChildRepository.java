package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Daycare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChildRepository extends JpaRepository<Child, Integer>{

    List<Child> findAllByOwnerId(Integer id);
}
