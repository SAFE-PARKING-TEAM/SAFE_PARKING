package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;

public interface IHorarioEstacionamientoRepository extends JpaRepository<HorarioEstacionamiento,Integer> {
}
