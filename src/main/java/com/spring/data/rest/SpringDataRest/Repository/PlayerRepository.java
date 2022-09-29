package com.spring.data.rest.SpringDataRest.Repository;

import com.spring.data.rest.SpringDataRest.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
    //public List<Player> findByNationality(String Nationality);

    /*@Modifying
    @Query("UPDATE Player p SET p.Nationality =:Nationality WHERE p.Id=:Id")
    public void updateNationality(@Param("Id") int Id,@Param("Nationality") String Nationality);
*/

}
