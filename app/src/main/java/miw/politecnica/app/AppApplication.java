package miw.politecnica.app;

import miw.politecnica.app.patrones.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AppApplication {

	private static final Logger logger = LoggerFactory.getLogger(AppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);

//		Singleton c = Singleton.getConfigurador("miurl", "mibaseDatos");
//		Singleton b2 = Singleton.getConfigurador("miurl2", "mibaseDato2s");
//		System.out.println(c);
//		System.out.println(b2);
	}
}
