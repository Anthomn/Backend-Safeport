package pe.edu.upc.tfsafeport.servicesinterfaces;

import pe.edu.upc.tfsafeport.entities.Padredefamilia;

import java.util.List;

public interface IPadredefamiliaService {
    public void insert(Padredefamilia padredefamilia);
    List<Padredefamilia>list();
}
