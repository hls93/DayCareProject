package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer>  {

}
