package FAVoloso.controller;


public class CampoSportivoController {

    private final CampoSportivoRepository campoSportivoRepository;

    public CampoSportivoController(CampoSportivoRepository campoSportivoRepository) {
        this.campoSportivoRepository = campoSportivoRepository;
    }



    public ResponseEntity<?> aggiungiCampo(@RequestBody CampoSportivoRequest inputJSONmodel) {
        /* #######################################################################
        * Spring creerà l'oggetto inputJSONmodel facendo il parsing delle chiavi JSON ricevte dal client che dovranno coincidere
        * con la classe CampoSportivoRequest.
        * ########################################################################*/


    }
}