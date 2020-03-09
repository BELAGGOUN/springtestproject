package ca.gc.esdc.springtestproject.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
//@Table(name = "t_project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pId;
    private String title;
    private Double budget;

    // case E
    @ManyToMany
    @JoinTable(name = "prj_pers",
               joinColumns ={ @JoinColumn(name = "PRJ_FK") }
               ,inverseJoinColumns = {@JoinColumn(name = "PERSON_FK") }
               )
    private List<Person> developpers;

}
