package Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // Added entity so Spring Data knows what it is
@Table(name = "TeamNames") // Name the table in our database
public class TeamNamesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Integer id;

    @Column
    private String key1;

    @Column
    private String key2;


}
