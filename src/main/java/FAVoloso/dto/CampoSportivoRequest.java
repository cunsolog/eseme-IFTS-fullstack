package FAVoloso.dto;

public class CampoSportivoRequest{
        String tipo_campo;
        double prezzoBaseOra;
        boolean doppio;

        public String getTipo_campo() {
                return tipo_campo;
        }

        public double getPrezzoBaseOra() {
                return prezzoBaseOra;
        }

        public boolean isDoppio() {
                return doppio;
        }
}