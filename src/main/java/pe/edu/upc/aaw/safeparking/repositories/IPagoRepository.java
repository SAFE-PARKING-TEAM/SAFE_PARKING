package pe.edu.upc.aaw.safeparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.safeparking.entities.Pago;
import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago,Integer> {
@Query(value ="SELECT sum(precio_total), \n" +
        "CASE \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 1 THEN 'Enero' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 2 THEN 'Febrero' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 3 THEN 'Marzo' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 4 THEN 'Abril' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 5 THEN 'Mayo' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 6 THEN 'Junio' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 7 THEN 'Julio' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 8 THEN 'Agosto' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 9 THEN 'Septiembre' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 10 THEN 'Octubre' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 11 THEN 'Noviembre' \n" +
        "   WHEN EXTRACT(MONTH FROM fecha_emision) = 12 THEN 'Diciembre' \n" +
        "       END AS nombre_mes \n" +
        "       FROM pago \n" +
        "       GROUP BY \n" +
        "       EXTRACT(MONTH FROM fecha_emision)", nativeQuery = true)
    public List<String[]> PrecioTotalReservasporMesD();
}
