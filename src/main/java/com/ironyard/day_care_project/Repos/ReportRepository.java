package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.Report;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Integer> {


//    Report update(Integer id, Report report);
}
