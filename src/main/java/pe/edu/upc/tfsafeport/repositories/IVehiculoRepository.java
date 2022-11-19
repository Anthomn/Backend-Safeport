package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Conductor;
import pe.edu.upc.tfsafeport.entities.Vehiculo;

import java.util.List;

@Repository
public interface IVehiculoRepository extends JpaRepository<Vehiculo,Integer> {
    @Query("from Vehiculo p where p.placa like %:placa")
    List<Vehiculo> search(@Param("placa")String placa);

    @Query("from Vehiculo p where p.conductor.nombre like %:nombre%")
    List<Vehiculo> searchConductor(@Param("nombre") String nombre);

    @Query("from Vehiculo p where p.marca.nombremarca like %:nombremarca%")
    List<Vehiculo> searchMarca(@Param("nombremarca") String nombremarca);

    List<Vehiculo> findByPlaca(String valor);


    @Query(value ="select * from vehiculo where estado like 'nuevo'",nativeQuery = true)
    List<Vehiculo> searchEstado();
    @Query(value = "select m.nombremarca ,count(v.id) as cantidad from vehiculo v inner join marca m on v.id_marca = m.id_marca group by m.nombremarca",nativeQuery = true)
    List<String[]> searchCantidad();
}
