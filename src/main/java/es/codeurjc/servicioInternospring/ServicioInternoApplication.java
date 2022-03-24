package es.codeurjc.servicioInternospring;

import java.util.HashMap;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicioInternoApplication{

	public static void main(String[] args) {
		SpringApplication.run(ServicioInternoApplication.class, args);
	}
}
