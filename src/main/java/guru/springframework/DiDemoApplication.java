package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.MyController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		
		System.out.println("----- Data source properties -----");
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println("user: "+fakeDataSource.getUser());
		System.out.println("Password: "+fakeDataSource.getPassword());
		System.out.println("url: "+fakeDataSource.getUrl());
		
		System.out.println("----- JMS source properties -----");
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
		System.out.println("user: "+fakeJmsBroker.getUsername());
		System.out.println("Password: "+fakeJmsBroker.getPassword());
		System.out.println("url: "+fakeJmsBroker.getUrl());
		
	}
}
