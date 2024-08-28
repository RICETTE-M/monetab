package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pseudo",unique=true, nullable=false)
    private String pseudo;

    @Column(name= "password", nullable=false)
    private String password;

    @Column(name="creation_date",nullable=false)
    private Instant creationDate;

    @OneToOne
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
                ", adress=" + address.getCountry() +
                '}';
    }
}

