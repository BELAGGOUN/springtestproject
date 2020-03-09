package ca.gc.esdc.springtestproject.dao.Repository;

import ca.gc.esdc.springtestproject.dao.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long>  {

}
