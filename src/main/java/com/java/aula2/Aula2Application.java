package com.java.aula2;
//Aplicação de uma Lista de Empregos (simples) utilizando Spring Framework
//As principais depedências utilizadas estão disponíveis no caminho resources/application.properties
//Nesse arquivo também está presente os principios de uma app MVC (Model-View-Controller)

//BIBLIOTECAS
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula2Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula2Application.class, args);
	}
}
