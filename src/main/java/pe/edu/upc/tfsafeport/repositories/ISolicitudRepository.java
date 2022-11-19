package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Solicitud;

import java.util.List;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud, Integer> {
    @Query("from Solicitud s where s.nombrehijo like %:nombrehijo")
    List<Solicitud> search(@Param("nombrehijo")String nombrehijo);

    List<Solicitud> findByNombrehijo(String valor);

    //Contratos con mayor ingresos mensuales mayores  200
    @Query(value = "select c.nombre As Conductor, p.nombre As Padre , s.nombrehijo, s.Precio  from solicitud s inner join conductor c on c.id_conductor = s.id_conductor inner join padredefamilia p ON p.id = s.id_padrefamilia where precio > 200;",nativeQuery = true)
    List<String[]> buscarSolicitudIngreso();

    //Ingresos Mensuales por Conductor
    @Query(value = "select s.id_conductor, c.nombre, Count(1) As cnt, Sum(s.precio) As IngresoMes from solicitud s inner join conductor c ON s.id_conductor = c.id_conductor group by s.id_conductor, c.nombre",nativeQuery = true)
    List<String[]> buscarSolicitudConductor();

}
