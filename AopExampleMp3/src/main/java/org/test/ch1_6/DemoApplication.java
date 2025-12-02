package org.test.ch1_6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.test.ch1_6.services.TestClient;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("Before spring.");
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println("After spring");

        TestClient client = context.getBean(TestClient.class);
        client.test();

        System.out.println("\nIt run twice due to DemoRunner class implementing CommandLineRunner");
    }


}
