package services;

import Models.TeamNamesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import repos.TeamsRepo;

import java.util.Optional;

@Service
public class TeamsService {

    @Autowired
    private TeamsRepo teamsRepo;


//    public Iterable<TeamNamesEntity> findAllTeams(){
//        return teamsRepo.findAll();
//    }

    public TeamNamesEntity createName(TeamNamesEntity teamNamesEntity){
        return teamsRepo.save(teamNamesEntity);
    }


    public TeamNamesEntity findTeamByID(Integer teamID) {
        Optional<TeamNamesEntity> optTeamName = teamsRepo.findById(teamID);
        if (optTeamName.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No team member found");
        }
        return optTeamName.get();
    }

    public void setTeamsRepo(TeamsRepo teamsRepo) {
        this.teamsRepo = teamsRepo;
    }
}
