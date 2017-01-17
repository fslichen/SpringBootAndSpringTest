package evolution;

import org.springframework.stereotype.Repository;

@Repository// @Service, @Component, and @Repository have the same functionality. They are just under different names so that users can easily distinguish them. 
public class AnyRepository {
	public void anyMethod() {
		System.out.println("Hello World");
	}
}
