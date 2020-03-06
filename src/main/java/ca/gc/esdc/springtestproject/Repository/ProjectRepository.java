package ca.gc.esdc.springtestproject.Repository;

import ca.gc.esdc.springtestproject.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer>  {

}
