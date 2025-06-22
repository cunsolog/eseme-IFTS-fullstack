package FAVoloso.controller;


import FAVoloso.model.CampoSportivo;
import FAVoloso.repository.CampoSportivoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/campi")
public class CampoSportivoController {

    private final CampoSportivoRepository campoSportivoRepository;

    public CampoSportivoController(CampoSportivoRepository campoSportivoRepository) {
        this.campoSportivoRepository = campoSportivoRepository;
    }

    /*
    * TO DO: implementare qui un end point che restituisce tutti i campi da gioco presenti nel DB
    * */
    @PostMapping("/helloworld")
    public ResponseEntity<?> helloword(@RequestBody Object a) {
        /*
        *
        * */
        return ResponseEntity.ok("hello word IFTS esame.");
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getCampoSportivo(@PathVariable Long id) {
        Optional<CampoSportivo> c=campoSportivoRepository.findById(id);
        return ResponseEntity.ok(c);
    }
}