package ovillenator;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="edit", types=Person.class)
public interface PersonProjection {
	public String getId();

	public String getFirstName();

	public String getLastName();

	public Details getDetails();
	
	
}
