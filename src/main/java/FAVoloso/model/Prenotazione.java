package FAVoloso.model;


import jakarta.persistence.ManyToOne;

public class Prenotazione {

    //SUGGERIMENTO: questa annotazione crea una relazione nel db tra la tabella Prenotazione e CampoSportivo
    @ManyToOne
    private CampoSportivo campo;



}