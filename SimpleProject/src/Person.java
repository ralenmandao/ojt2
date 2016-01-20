import com.ralen.annotation.Bean;
import com.ralen.annotation.Inject;

@Bean
public class Person {
	
	@Inject
	public Person person;
	
	public void print(){
		System.out.println("aw");
	}
}
