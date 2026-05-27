package br.com.cristianofeitosa.gestao_vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Gestão de Vagas API", version = "1.0", description = "API para gestão de vagas de emprego, permitindo que empresas criem e gerenciem suas vagas, e candidatos se inscrevam nas oportunidades disponíveis."))
public class GestaoVagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoVagasApplication.class, args);
	}

}
