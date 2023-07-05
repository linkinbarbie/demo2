package repos;

import Models.TeamNamesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Out interface extends CrudRepository, which is provided by
// org.springframework.data.repository.CrudRepository package. This gives
// us all the methods and final properties that CrudRepository has
// TeamNamesEntity is the entity, and Integer is our ID type.

@Repository
public interface TeamsRepo extends JpaRepository<TeamNamesEntity, Integer> {

}
