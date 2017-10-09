package com.ironyard.day_care_project.Repos;


import com.ironyard.day_care_project.Entity.Daycare;
import com.ironyard.day_care_project.Entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupRepository extends JpaRepository <Group, Integer> {

//    @Query(value = "SELECT * FROM daycare WHERE email = ?1", nativeQuery = true)
//
//    Daycare findByEmail(String name);

    List<Group> findAllByOwnerEmail(String email);


}
