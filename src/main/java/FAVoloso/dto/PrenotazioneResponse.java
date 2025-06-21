package FAVoloso.dto;

import FAVoloso.model.Prenotazione;

import java.util.List;

public class PrenotazioneResponse {
    Prenotazione prenotazione;


    public PrenotazioneResponse(Prenotazione prenotazione) {
        this.prenotazione = prenotazione;

    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }


}
