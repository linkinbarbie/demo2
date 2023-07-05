package Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Station {
    private String name;
    private Integer platform;
    private LocalDate dateOpened;

}