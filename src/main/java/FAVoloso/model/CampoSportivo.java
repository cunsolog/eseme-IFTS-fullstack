package FAVoloso.model;


public abstract class CampoSportivo {

    /* #######################################################################
        SUGGERIMENTO: Questa metodo permette di mostrare il
        campo "tipo" (Discriminator column) creato nel DB da JPA per gestire il polimorfismo.
       Tuttavia il nome di questo campo non deve coincidere con nessun attributo della superclasse e delle sottoclassi
        ma va invece implementato il suo metodo get (getTipo()) per far gestire correttamente il polimorfismo da JPA
       #######################################################################*/
    public abstract String getTipo();
}