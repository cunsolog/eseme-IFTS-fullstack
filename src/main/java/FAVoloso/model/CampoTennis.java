package FAVoloso.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Tennis")
public class CampoTennis extends CampoSportivo {
    @Override
    public String getTipo() {
        return "Tennis";
    }
}
