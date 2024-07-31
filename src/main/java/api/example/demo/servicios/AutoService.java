package api.example.demo.servicios;

import api.example.demo.modelos.Auto;
import api.example.demo.repositories.InAuto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class AutoService {
    private InAuto repoAuto;

    @Autowired
    public AutoService(InAuto repoAuto) {
        this.repoAuto = repoAuto;
    }

    //Metodo para crear autos
    public void crearAuto(Auto auto){
        repoAuto.save(auto);
    }

    //Metodos para listar todos los autos
    public List<Auto> listarAutos(){
        return repoAuto.findAll();
    }

    //Metodo para actualizar auto
    public void actualizarAuto(Auto auto){
        repoAuto.save(auto);
    }

    //Metodo para eliminar autos
    public void eliminarAutosPorId(Long id){
        repoAuto.deleteById(id);
    }

    //Metodos para listar autos segun su caracteristica

    //Metodo para listar autos por su ID especifica
    public Optional<Auto> buscarPorID(Long id){
        return repoAuto.findById(id);
    }
    public List<Auto> buscarPorMarca(String marca){
        return repoAuto.findAutoByMarca(marca);
    }
    public List<Auto> buscarPorColor(String color){
        return repoAuto.findAutoByColor(color);
    }

    public List<Auto> buscarPorAnio(Long anio){
        return repoAuto.findAutoByAnio(anio);
    }

    public List<Auto> buscarPorModelo(String modelo){
        return repoAuto.findAutoByModelo(modelo);
    }
}
