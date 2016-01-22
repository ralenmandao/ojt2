package ovillenator.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ovillenator.Details;
import ovillenator.Person;

@RepositoryRestResource(collectionResourceRel="details", path="details")
public interface DetailsRepository extends MongoRepository<Details, String>{

}
