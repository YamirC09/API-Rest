package api.example.demo.controllers;

import api.example.demo.modelos.Auto;
import api.example.demo.servicios.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autos/")
public class AutoController {
    AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    @PostMapping(value="crear", headers = "Accept=application/json")
    public void crearAutos(@RequestBody Auto auto){
        autoService.crearAuto(auto);
    }
    @GetMapping(value = "listar" , headers = "Accept=application/json")
    public List<Auto> listarAutos(){
        return autoService.listarAutos();
    }
    @GetMapping(value = "listar-por-id/{id}" , headers = "Accept=application/json")
    public Optional<Auto> buscarPorId(@PathVariable Long id){
        return autoService.buscarPorID(id);
    }
    @PutMapping(value = "actualizar", headers = "Accept=application/json")
    public void actualizarAuto(@RequestBody Auto autos){
        autoService.actualizarAuto(autos);
    }
    @DeleteMapping(value = "borrar/{id}", headers = "Accept=application/json")
    public void borrarAuto(@PathVariable Long id){
        autoService.eliminarAutosPorId(id);
    }

    @GetMapping(value = "Listar-por-marca/{marca}", headers = "Accept=application/json")
    public List<Auto> buscarPorMarca(@PathVariable String marca){
        return autoService.buscarPorMarca(marca);
    }
    @GetMapping(value = "listar-por-modelo/{modelo}", headers = "Accept=application/json")
    public List<Auto> buscarPorModelo(@PathVariable String modelo){
        return autoService.buscarPorModelo(modelo);
    }
    @GetMapping(value = "listar-por-color/{color}", headers = "Accept=application/json")
    public List<Auto> buscarPorColor(@PathVariable String color){
        return autoService.buscarPorColor(color);
    }
    @GetMapping(value = "listar-por-anio/{anio}", headers = "Accept=application/json")
    public List<Auto> buscarPorAnio(@PathVariable Long anio){
        return autoService.buscarPorAnio(anio);
    }
}
