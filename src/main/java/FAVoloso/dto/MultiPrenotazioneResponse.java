package FAVoloso.dto;

import FAVoloso.model.Prenotazione;

import java.util.List;

public class MultiPrenotazioneResponse {
    List<Prenotazione> prenotazioni;
    Double prezzoTotale;

    public MultiPrenotazioneResponse(List<Prenotazione> prenotazioni, Double prezzoTotale) {
        this.prenotazioni = prenotazioni;
        this.prezzoTotale = prezzoTotale;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public Double getPrezzoTotale() {
        return prezzoTotale;
    }
}
