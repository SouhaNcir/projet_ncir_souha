package com.souhancir_voitures.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.souhancir_voitures.entities.Role; 

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRole(String role);

}
