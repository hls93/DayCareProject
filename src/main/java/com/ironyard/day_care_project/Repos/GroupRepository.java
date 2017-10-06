package com.ironyard.day_care_project.Repos;


import com.ironyard.day_care_project.Entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository <Group, Integer> {

}
