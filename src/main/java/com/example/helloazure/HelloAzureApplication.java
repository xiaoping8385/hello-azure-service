package main.java.com.example.helloazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloAzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloAzureApplication.class, args);
    }

    @RestController
    class HelloAzureController {

        @GetMapping("/")
        public String helloAzure() {
            return "Hello Azure";
        }
    }
}
