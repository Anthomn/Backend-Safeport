package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Conductor;

import java.util.List;

@Repository
public interface IConductorRepository extends JpaRepository<Conductor, Integer> {

    @Query("from Conductor p where p.nombre like %:nombre")
    List<Conductor> search(@Param("nombre")String nombre);

    List<Conductor> findByNombre(String valor);

    @Query (value = "select * from conductor c where c.verificado = 'S' order by c.nombre asc",nativeQuery = true)
    List<Conductor>buscarverificado();

    @Query(value = "select * from conductor c where c.tiempoconduccion >= 5 order by c.tiempoconduccion desc",nativeQuery = true)
    List<Conductor>buscartiempo();
}
