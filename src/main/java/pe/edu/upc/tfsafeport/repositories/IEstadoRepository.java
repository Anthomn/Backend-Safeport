package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Estado;

import java.util.List;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado,Integer> {
    @Query("from Estado e where e.direccionPartida like %:direccionPartida")
    List<Estado>search(@Param("direccionPartida")String direccionPartida);

    @Query("from Estado e where e.viaje.horainicio like %:horainicio")
    List<Estado>buscarViajes(@Param("horainicio")String horainicio);

    @Query("from Estado e where e.solicitud.descripcion like %:descripcion")
    List<Estado>buscarSolicitud(@Param("descripcion")String descripcion);

    @Query("from Estado e where e.ubicacion.distrito like %:distrito")
    List<Estado>buscarUbicacion(@Param("distrito")String distrito);

}
