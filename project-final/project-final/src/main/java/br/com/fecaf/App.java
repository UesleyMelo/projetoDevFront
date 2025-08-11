package br.com.fecaf;


import br.com.fecaf.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    @Autowired
    private ContatoService contatoService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    CommandLineRunner initialization() {
        return args -> {
            System.out.println("Servidor no ar na porta 8080 ...");
            contatoService.listarContatos();
        };
    }


}
