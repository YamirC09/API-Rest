package api.example.demo.repositories;

import api.example.demo.modelos.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InAuto extends JpaRepository<Auto, Long> {
    List<Auto> findAutoByAnio(Long anio);
    List<Auto> findAutoByMarca(String marca);
    List<Auto> findAutoByModelo(String modelo);
    List<Auto> findAutoByColor(String color);

}