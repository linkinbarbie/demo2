package Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Station {
    private String name;
    private Integer platform;
    private LocalDate dateOpened;


}
