package FAVoloso.dto;

import java.time.LocalDateTime;

public class PrenotazioneRequest{
        Long campoId;
        Integer ore;
        Boolean illuminazioneRichiesta;
        Boolean doppio;

        public Long getCampoId() {
                return campoId;
        }

        public Integer getOre() {
                return ore;
        }

         public boolean isIlluminazioneRichiesta() {
                return illuminazioneRichiesta;
        }

        public Boolean getDoppio() {
                return doppio;
        }
}