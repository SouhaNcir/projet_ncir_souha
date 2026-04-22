package com.souhancir_voitures.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.souhancir_voitures.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
