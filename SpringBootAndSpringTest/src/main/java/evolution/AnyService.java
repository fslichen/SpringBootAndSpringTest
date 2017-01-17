package evolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnyService {
	@Autowired
	AnyRepository anyRepository;
	
	public void anyMethod() {
		anyRepository.anyMethod();
	}
}
