package FAVoloso;


import FAVoloso.repository.CampoSportivoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner init_esame_IFTS_fullstack(CampoSportivoRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                /*
                * Dopo aver implementato le classi del model popolare il database implementando qui il relativo codice
                */
            }
        };
    }
}