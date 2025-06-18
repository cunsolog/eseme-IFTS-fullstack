package FAVoloso.repository;

import FAVoloso.model.CampoSportivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampoSportivoRepository extends JpaRepository<CampoSportivo, Long> { }

