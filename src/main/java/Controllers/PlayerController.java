package Controllers;

import Models.PlayerResponse;
import Models.Station;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;

@RestController


public class PlayerController {



    @GetMapping("/players")
    //Save down new players

    public PlayerResponse getPlayerResponse() {
//    public PlayerResponse getPlayerResponse(@RequestParam("id") int id) {
        // Perform logic to retrieve the player response
//        System.out.println(id);

        PlayerResponse playerResponse = new PlayerResponse();

        // Create a player object - testing out creating a response in players baseurl
        PlayerResponse.Player player = new PlayerResponse.Player();
        player.setId(1);
        player.setFirstname("Alex");
        player.setLastname("Abrines");

        // Create a birth object
        PlayerResponse.Birth birth = new PlayerResponse.Birth();
        birth.setDate("1993-08-01");
        birth.setCountry("Spain");

        player.setBirth(birth);

        // Set the player object in the response
        playerResponse.setPlayers(List.of(player));

        return playerResponse;
    }



}


