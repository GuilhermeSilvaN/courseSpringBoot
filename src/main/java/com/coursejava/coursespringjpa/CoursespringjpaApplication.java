package com.coursejava.coursespringjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication //configuracao da porta de entrada da aplicacao
@Configuration // define que a classe pode ter metodos que definem bins
@EnableAutoConfiguration // ativa a autoconfig do spring
@ComponentScan //permite que o spring escaneie todos os pacotes para fazer o gerenciamento do ciclo de vida dos componentes;
public class CoursespringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursespringjpaApplication.class, args);
	}

}
