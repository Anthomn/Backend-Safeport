package pe.edu.upc.tfsafeport.repositories;

import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Vehiculo;
import pe.edu.upc.tfsafeport.entities.Viaje;

import java.util.Date;
import java.util.List;

@Repository
public interface IViajeRepository extends JpaRepository<Viaje, Integer> {

    @Query("from Viaje v where v.vehiculo.placa like %:placa%")
    List<Viaje> buscarVehiculo(@Param("placa") String placa);

    @Query("from Viaje p where p.horainicio like %:horainicio")
    List<Viaje> search(@Param("horainicio")String horainicio);

    List<Viaje> findByVehiculoPlaca(String valor);


    @Query(value ="SELECT * FROM viaje v WHERE v.fecha >= '2022-01-01'", nativeQuery = true)
    List<Viaje>buscarFechaMayor();

    @Query(value = "SELECT v.placa, count (v.placa)as cantidadviajes FROM vehiculo v INNER join viaje ON viaje.id_vehiculo = v.id group by v.placa ",nativeQuery = true)
    List<String[]>cantidadViajes();

    @Query(value = "select fecha,count(viaje.id_viaje) as cantidad from viaje group by fecha order by  cantidad desc",nativeQuery = true)
    List<String[]> searchCantidad();

}
