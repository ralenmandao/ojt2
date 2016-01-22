package ovillenator.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ovillenator.Person;

@RepositoryRestResource(collectionResourceRel="persons", path="persons")
public interface PersonRepository extends MongoRepository<Person, String>{
	public List<Person> findByFirstNameAndLastName(@Param("firstName")String firstName, @Param("lastName") String lastName);
}
