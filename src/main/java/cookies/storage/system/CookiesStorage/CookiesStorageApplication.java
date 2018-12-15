package cookies.storage.system.CookiesStorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CookiesStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookiesStorageApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hi";
	}

}

