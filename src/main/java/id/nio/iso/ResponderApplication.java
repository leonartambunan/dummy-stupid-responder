package id.nio.iso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("id.nio.iso.controller")
public class ResponderApplication {
	public static void main(String[] args) {
        SpringApplication.run(ResponderApplication.class, args);
	}
}
