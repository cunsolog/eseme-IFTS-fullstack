package FAVoloso.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class CampoSportivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /* #######################################################################
        SUGGERIMENTO: Questa metodo permette di mostrare il
        campo "tipo" (Discriminator column) creato nel DB da JPA per gestire il polimorfismo.
       Tuttavia il nome di questo campo non deve coincidere con nessun attributo della superclasse e delle sottoclassi
        ma va invece implementato il suo metodo get (getTipo()) per far gestire correttamente il polimorfismo da JPA
       #######################################################################*/
    public abstract String getTipo();
}