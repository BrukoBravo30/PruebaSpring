package mx.unam.aragon.ico.is.computadoraApi.repositories;

import mx.unam.aragon.ico.is.computadoraApi.entities.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {
    public Computadora findComputadoraByClave(Long clave);
    public Computadora deleteByClave(Long clave);
}
