package pe.edu.upc.tfsafeport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tfsafeport.entities.Padredefamilia;

@Repository
public interface IPadredefamiliaRepository extends JpaRepository<Padredefamilia, Integer> {

}
