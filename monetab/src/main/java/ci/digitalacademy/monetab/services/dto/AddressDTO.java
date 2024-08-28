package ci.digitalacademy.monetab.services.dto;

import ci.digitalacademy.monetab.models.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
public class AddressDTO {


        private Long id;


        private String street;

        private String city;

        private String country;


    }
