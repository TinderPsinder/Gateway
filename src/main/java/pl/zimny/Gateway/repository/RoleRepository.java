package pl.zimny.Gateway.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import pl.zimny.Gateway.models.ERole;
import pl.zimny.Gateway.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
