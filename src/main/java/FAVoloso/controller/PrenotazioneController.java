package FAVoloso.controller;


import FAVoloso.dto.PrenotazioneRequest;
import FAVoloso.model.Prenotazione;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PrenotazioneController {
    /*
    * TO DO: implementare qui i  3.b e 3.c della parte 2.
    * */

    @PostMapping("/creaPrenotazione")
    public ResponseEntity<Prenotazione> creaPrenotazione(@RequestBody PrenotazioneRequest inputJSONmodel) {
        /* #######################################################################
         * Spring creerà l'oggetto inputJSONmodel facendo il parsing delle chiavi JSON ricevute dal client che dovranno coincidere
         * con la classe PrenotazioneRequest, accessibili con inputJSONmodel.get..().
         * ########################################################################*/

        Prenotazione new_prenotazione = new Prenotazione();
        return ResponseEntity.ok(new_prenotazione);
    }
}