package pe.edu.upc.tfsafeport.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Marca;

import java.util.List;

@Repository
public interface IMarcaRespository extends JpaRepository<Marca, Integer> {

    @Query("from Marca m where m.nombremarca like %:nombremarca")
    List<Marca> search(@Param("nombremarca")String nombremarca);
}
