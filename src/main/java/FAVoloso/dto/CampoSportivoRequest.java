package FAVoloso.dto;

public class CampoSportivoRequest{
        String tipo_campo;
        String superficie;
        boolean illuminazioneDisponibile;
        double prezzoBaseOra;
        int numeroMassimoGiocatori;
        boolean doppio;

        public String getTipo_campo() {
                return tipo_campo;
        }

        public String getSuperficie() {
                return superficie;
        }

        public boolean isIlluminazioneDisponibile() {
                return illuminazioneDisponibile;
        }

        public double getPrezzoBaseOra() {
                return prezzoBaseOra;
        }

        public int getNumeroMassimoGiocatori() {
                return numeroMassimoGiocatori;
        }

        public boolean isDoppio() {
                return doppio;
        }
}