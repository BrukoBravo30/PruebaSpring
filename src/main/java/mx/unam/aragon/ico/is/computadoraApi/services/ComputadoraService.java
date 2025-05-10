package mx.unam.aragon.ico.is.computadoraApi.services;

import mx.unam.aragon.ico.is.computadoraApi.entities.Computadora;

import java.util.Optional;

public interface ComputadoraService {
    public abstract Computadora crear(Computadora computadora);
    public abstract Iterable<Computadora> listarTodas();
    public  abstract Optional<Computadora> buscarPorID(Long id);
    public abstract Computadora actualizar(Long clave, Computadora computadora);
    public abstract Computadora eliminar(Long clave);
}
