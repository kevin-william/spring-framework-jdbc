package autonomous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication app = new SpringApplication(Main.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
    }
}