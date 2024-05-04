package repositories;

import org.springframework.data.jpa.repository.*;

import entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
