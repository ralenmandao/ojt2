package ovillenator;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="light", types=Person.class)
public interface Proj2 {

	public String getFirstName();

	public String getLastName();
	
	
}
