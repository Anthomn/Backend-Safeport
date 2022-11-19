package pe.edu.upc.tfsafeport.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.tfsafeport.entities.Respuesta;

import pe.edu.upc.tfsafeport.entities.CantidadViajesXFecha;

import pe.edu.upc.tfsafeport.entities.Viaje;
import pe.edu.upc.tfsafeport.repositories.IViajeRepository;
import pe.edu.upc.tfsafeport.servicesinterfaces.IViajeService;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ViajeServiceImpl implements IViajeService {

    @Autowired
    private IViajeRepository vj;

    @Override
    @Transactional
    public boolean Insert(Viaje vehiculo) {
        Viaje objVehiculo = vj.save(vehiculo);
        if (objVehiculo == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Viaje> list() {
        return vj.findAll();
    }

    @Override
    @Transactional
    public void delete(int idViaje) {

        vj.deleteById(idViaje);

    }

    @Override
    public Optional<Viaje> listarId(int idViaje) {

        return vj.findById(idViaje);
    }
    //prueba de merge
    @Override
    public List<Viaje> buscarVehiculo(String placa) {
        return vj.buscarVehiculo(placa);
    }
    @Override
    public List<Viaje> search(String horainicio) {
        return vj.search(horainicio);
    }

    @Override
    public List<Viaje> buscarfecha(String fecha) {
        return vj.findByVehiculoPlaca(fecha);
    }

    @Override
    public List<Viaje> buscarFechaMayor() {
        return vj.buscarFechaMayor();
    }

    @Override
    public List<Respuesta> buscarCantidadViajes() {
        List< Respuesta> lista = new ArrayList<>();
        vj.cantidadViajes().forEach(y -> {
            Respuesta r=new Respuesta();
            r.setVehiculo(y[0]);
            r.setCantidadviajes(y[1]);
            lista.add(r);
        });
        return lista;
    }



    @Override
    public List<CantidadViajesXFecha> searchCantidad()
    {
        List<CantidadViajesXFecha>lista=new ArrayList<>();
        vj.searchCantidad().forEach(

                y->{CantidadViajesXFecha r = new CantidadViajesXFecha();
                    r.setFecha(y[0]);
                    r.setCantidad(y[1]);
                    lista.add(r);

                });
        return lista;
    }
}
