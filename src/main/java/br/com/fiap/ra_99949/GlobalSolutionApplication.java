package br.com.fiap.ra_99949;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlobalSolutionApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalSolutionApplication.class, args);
        System.out.println("🚀 Global Solution - Sistema de Atendimento a Refugiados rodando em http://localhost:8080/");
        System.out.println("📄 Documentação Swagger: http://localhost:8080/swagger-ui.html");
        System.out.println("🗄️ Console H2: http://localhost:8080/h2-console");
    }
}
