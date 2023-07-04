package Controllers;

import Models.TeamNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class apiController {

    private final CovidRestClient covidRestClient;

    @Autowired
    public apiController(CovidRestClient covidRestClient) {
        this.covidRestClient = covidRestClient;
    }

    @GetMapping("/names")
    public TeamNames getNames() {
            TeamNames names = covidRestClient.getNames();
            System.out.println(names); // Print the names to the console
            return names;
    }
}
