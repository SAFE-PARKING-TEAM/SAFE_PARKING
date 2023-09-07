package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.safeparking.entities.Horario;

public interface IHorarioRepository extends JpaRepository<Horario,Integer> {

}
