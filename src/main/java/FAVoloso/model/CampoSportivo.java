package FAVoloso.model;


public abstract class CampoSportivo {

    //SUGGERIMENTO: Questa metodo permette di mostrare il
    // campo "tipo" (Discriminator) creato nel DB da JPA per gestire il polimorfismo.
    public abstract String getTipo();
}