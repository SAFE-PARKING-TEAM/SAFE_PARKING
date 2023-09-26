package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.safeparking.entities.Incidente;

import java.util.List;


@Repository
public interface IIncidenteRepository extends JpaRepository<Incidente,Integer> {

    @Query(value = "SELECT R.nombre_rol AS Rol, COUNT(I.id_incidente) AS TotalIncidentes\n" +
            "FROM rol R\n" +
            "LEFT JOIN Usuario U ON R.id_usuario = U.id_usuario\n" +
            "LEFT JOIN incidente I ON U.id_usuario = I.id_usuario\n" +
            "GROUP BY R.nombre_rol;", nativeQuery = true)
    public  List<String[]>cantIncidentesPorTipoRol();

}
