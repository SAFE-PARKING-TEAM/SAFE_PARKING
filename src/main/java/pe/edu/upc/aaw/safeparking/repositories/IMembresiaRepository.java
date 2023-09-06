package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.safeparking.entities.Membresia;

@Repository
public interface IMembresiaRepository extends JpaRepository<Membresia,Integer> {

}
