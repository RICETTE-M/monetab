package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value = "student")
public class Student extends Person {


    @Column(name = "matricule",unique=true, nullable=false)
    private String matricule;

    @Transient
    @Column(name = "date_naissance", nullable = false)
    private Instant date_naissance;

    @Column(name = "classe",nullable = false)
    private String classe;


}
