package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer>  {

}
