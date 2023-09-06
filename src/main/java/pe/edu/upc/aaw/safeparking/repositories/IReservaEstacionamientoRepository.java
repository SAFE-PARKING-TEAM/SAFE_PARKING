package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;

public interface IReservaEstacionamientoRepository extends JpaRepository<ReservaEstacionamiento,Integer> {
}
