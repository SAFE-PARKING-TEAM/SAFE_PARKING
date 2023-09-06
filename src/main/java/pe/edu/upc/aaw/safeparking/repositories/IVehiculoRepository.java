package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.safeparking.entities.Vehiculo;

public interface IVehiculoRepository extends JpaRepository <Vehiculo,Integer> {
}
