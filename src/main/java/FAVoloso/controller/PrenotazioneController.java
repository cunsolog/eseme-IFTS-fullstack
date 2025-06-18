package FAVoloso.controller;


public class PrenotazioneController {
    private final PrenotazioneRepository prenotazioneRepository;
    private final CampoSportivoRepository campoSportivoRepository;

    public PrenotazioneController(PrenotazioneRepository prenotazioneRepository, CampoSportivoRepository campoSportivoRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
        this.campoSportivoRepository = campoSportivoRepository;
    }



    public ResponseEntity<MultiPrenotazioneResponse> setPrenotazioni(@RequestBody List<PrenotazioneRequest> inputJSONmodel) {
        /* #######################################################################
         * Spring creerà l'oggetto inputJSONmodel facendo il parsing delle chiavi JSON ricevte dal client che dovranno coincidere
         * con la classe PrenotazioneRequest.
         * ########################################################################*/

    }

}