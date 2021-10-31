package miw.politecnica.app;

import miw.politecnica.app.patrones.Singleton;
import miw.politecnica.app.patrones.builder.article.solucionMia.ArticleBuilder;
import miw.politecnica.app.patrones.builder.article.solucionMia.TypeDesciption;
import miw.politecnica.app.patrones.builder.bank.BankAccount;
import miw.politecnica.app.patrones.builder.bank.BankAccountBuilder;
import miw.politecnica.app.patrones.builder.user.solution.User;
import miw.politecnica.app.patrones.composite.Developer;
import miw.politecnica.app.patrones.composite.Employee;
import miw.politecnica.app.patrones.composite.Manager;
import org.apache.tomcat.jni.Error;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class AppApplication {

	private static final Logger logger = LoggerFactory.getLogger(AppApplication.class);

	public static void main(String[] args) throws Error {
		SpringApplication.run(AppApplication.class, args);

		//##################Probando el singleton con el cliente.##################

		outSingletonPatron();

		//##################Probando el composite con el cliente.#################################

		outCompositePatron();

		//##################Probando el builder con el cliente.#################################

		outBuilderPatronBank();
		outBuilderUser();
		outBuilderArticle();


	}

	private static void outCompositePatron(){


//		List<String> tag = new ArrayList<>();
//		tag.add("tag01");
//		tag.add("tag02");
//		tag.add("tag03");
//
//		User user = new User("1","Nick","Name","familyName",5,5646464,"Profesin",tag);

		List<String> tag = new ArrayList<>();
		tag.add("tag01");
		tag.add("tag02");
		tag.add("tag03");

		BankAccountBuilder builder = new BankAccountBuilder(12345l);

		BankAccount bankAccount = builder.withBalance(1000.20)
				.withOwner("Jorge")
				.withCity("Madrid")
				.withRate(10.15)
				.withTag(tag)
				.build();

		System.out.println(bankAccount);
	}

	private static void outBuilderPatronBank(){

		Employee m1 = new Manager("Marc");

		Employee d1 = new Developer("Maria");
		Employee d2 = new Developer("Ema");
		Employee d3 = new Developer("Brian");

		m1.add(d1);
		m1.add(d2);
		m1.add(d3);

		Employee m2 = new Manager("Susan");

		Employee d4 = new Developer("James");
		Employee d5 = new Developer("Michael");

		m2.add(d4);
		m2.add(d5);
	}

	private static void outSingletonPatron(){

		Singleton c = Singleton.getConfigurador("miurl", "mibaseDatos");
		Singleton b2 = Singleton.getConfigurador("miurl2", "mibaseDato2s");
		System.out.println(c);
		System.out.println(b2);

	}


	private static void outBuilderUser() throws Error {

		var s = User.builder("1","","")
			.age(12)
			.phone(65654);
		System.out.println(s);


	}

	private static void outBuilderArticle(){

		ArticleBuilder articleBuilder = new ArticleBuilder(5454);
		TypeDesciption typeDesciption = new TypeDesciption(1);

		typeDesciption.setNameDescription("TypeDescription");
		typeDesciption.setNumberOfDescription(2);

		List<String> tag = new ArrayList<>();
		tag.add("tag01");
		tag.add("tag_02");

		articleBuilder.withDescription("Descripcion")
				.withReference("Referencia")
				.withTypeDesciption(typeDesciption)
				.withTags(tag)
				.build();
		System.out.println(articleBuilder);



	}
}
