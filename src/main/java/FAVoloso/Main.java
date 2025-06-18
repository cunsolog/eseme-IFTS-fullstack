package FAVoloso;



public class Main {
    public static void main(String[] args) {

    }


    public CommandLineRunner init_esame_IFTS_fullstack(CampoSportivoRepository repo) {
        return args -> {
            if (repo.count() == 0) {

            }
        };
    }
}