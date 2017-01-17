package evolution;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class AnyTest {
	@Autowired
	AnyService anyService;// You don't even need to write the configuration class because the spring boot parent has already taken care of it. But don't forget to put the @Service above AnyService.  
	
	@Test
	public void test() {
		anyService.anyMethod();
	}
}