package org.test.ch1_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.test.ch1_6.services.TestClient;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        TestClient client = context.getBean(TestClient.class);
        client.test();

        System.out.println("It run twice due to DemoRunner class implementing CommandLineRunner");
    }


}
