package Controllers;


import Models.Station;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController //Annotations to give you all the defaults you need from Spring

public class StationController {
    //endpoint

    @GetMapping("/hello")
    public String HelloWorld(){

        return "Hello World";

    }



    @GetMapping("/station")
    public Station getStation() {
        Station station = new Station();
        station.setName("Paddington");
        station.setPlatform(16);
        station.setDateOpened(LocalDate.of(1985,12,05));
        return station;

    }






}
