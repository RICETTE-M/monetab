package ci.digitalacademy.monetab.models;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.Instant;

@Getter
@Setter
public abstract class AbstractAuditing {

    private Instant creationDate;
    private Instant createdBy;
}
