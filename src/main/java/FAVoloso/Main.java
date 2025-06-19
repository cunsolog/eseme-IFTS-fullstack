package FAVoloso;



public class Main {
    public static void main(String[] args) {

    }


    public CommandLineRunner init_esame_IFTS_fullstack(CampoSportivoRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                /*Dopo aver implementato le classi del model popolare il database implementando qui il relativo codice*/
            }
        };
    }
}