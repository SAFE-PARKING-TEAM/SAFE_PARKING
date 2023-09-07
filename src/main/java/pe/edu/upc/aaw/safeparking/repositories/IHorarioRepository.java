package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.safeparking.entities.Horario;
@Repository
public interface IHorarioRepository extends JpaRepository<Horario,Integer> {

}
