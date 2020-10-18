package del.ac.id.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import del.ac.id.demo.model.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	
	Role findByRole(String role);
}
