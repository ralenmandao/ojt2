import com.ralen.ApplicationContext;
import com.ralen.ApplicationContextImp;

public class Main {
	public static void main(String[] args){
		ApplicationContext context = new ApplicationContextImp("");
		Person person = context.getBean("person");
		person.print();
		person.person.print();
	}
}
