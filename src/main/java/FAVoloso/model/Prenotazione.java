package FAVoloso.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Prenotazione {
    @Id
    private long id;

    //SUGGERIMENTO: questa annotazione crea una relazione nel db tra la tabella Prenotazione e CampoSportivo
    @ManyToOne
    private CampoSportivo campo;



}