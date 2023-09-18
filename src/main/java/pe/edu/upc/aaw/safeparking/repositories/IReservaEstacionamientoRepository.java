package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;

import java.util.List;

@Repository
public interface IReservaEstacionamientoRepository extends JpaRepository<ReservaEstacionamiento,Integer> {

    @Query(value =" SELECT u.nombre AS nombre_usuario, r.nombre_rol, COUNT(re.id_usuario) AS cantidad_reservas\n " +
            " FROM usuario u\n" +
            " LEFT JOIN reserva_estacionamiento re ON u.id_usuario = re.id_usuario\n " +
            " INNER JOIN rol r ON u.id_usuario = r.id_usuario\n " +
            " WHERE r.nombre_rol = 'conductor'\n " +
            " GROUP BY u.nombre, r.nombre_rol; ",nativeQuery = true)
    public List<String[]> quantityreservationByUser();

    @Query(value = "SELECT fecha, COUNT(*) AS total_reservas\n" +
            "FROM reserva_estacionamiento\n" +
            "GROUP BY fecha",nativeQuery = true)
    public List<String[]>quantityreservationbyDate();


    @Query(value = " SELECT p.tipo_pago,COUNT(re.id_reserva_estacionamiento) AS total_reservas\n" +
            " FROM reserva_estacionamiento re\n" +
            " INNER JOIN pago p ON re.id_reserva_estacionamiento = p.id_reserva_estacionamiento\n" +
            " GROUP BY p.tipo_pago",nativeQuery = true)
    public List<String[]>quantityreservationbyPay();
}
