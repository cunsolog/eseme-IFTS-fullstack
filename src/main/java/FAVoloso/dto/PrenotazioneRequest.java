package FAVoloso.dto;

import java.time.LocalDateTime;

public class PrenotazioneRequest{
        Long campoId;
        LocalDateTime inizio;
        LocalDateTime fine;
        boolean illuminazioneRichiesta;
        Boolean doppio;

        public Long getCampoId() {
                return campoId;
        }

        public LocalDateTime getInizio() {
                return inizio;
        }

        public LocalDateTime getFine() {
                return fine;
        }

        public boolean isIlluminazioneRichiesta() {
                return illuminazioneRichiesta;
        }

        public Boolean getDoppio() {
                return doppio;
        }
}