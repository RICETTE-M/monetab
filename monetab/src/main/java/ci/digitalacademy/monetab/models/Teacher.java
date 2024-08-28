package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value = "teacher")
public class Teacher extends Person {


    @Column(name = "matiere", nullable = false)
    private String matiere;



@OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher")
    private Set<FicheNote> ficheNotes;

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "id=" + id +
//                ", matiere='" + matiere + '\'' +
//                ", vacant=" + vacant +
//                '}';
    }

