package repos;

import Models.TeamNames;
import org.springframework.data.repository.CrudRepository;

// Out interface extends CrudRepository, which is provided by
// org.springframework.data.repository.CrudRepository package. This gives
// us all the methods and final properties that CrudRepository has
// TeamNames is the entity, and Integer is our ID type.


public interface TeamsRepo extends CrudRepository<TeamNames, Integer> {

}
