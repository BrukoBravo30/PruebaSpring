package mx.unam.aragon.ico.is.computadoraApi.controllers;

import mx.unam.aragon.ico.is.computadoraApi.entities.Computadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import mx.unam.aragon.ico.is.computadoraApi.services.ComputadoraService;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/v1/computadoras")
public class ComputadoraController {
    @Autowired
    private ComputadoraService computadoraService;
    @GetMapping
    public ResponseEntity<Iterable<Computadora>> getComputadoras(){
        //return computadoraService.listarTodas();
       // return new ResponseEntity<>(computadoraService.listarTodas(), HttpStatus.CREATED);
        return ResponseEntity.ok().body(computadoraService.listarTodas());
    }

    @GetMapping("{id}")
    public ResponseEntity<Computadora> getComputadora(@PathVariable Long id) throws URISyntaxException {
       // return computadoraService.buscarPorID(id).orElse(null);
          return ResponseEntity.ok(computadoraService.buscarPorID(id).orElse(null));
    }

    @PostMapping
    public Computadora createComputadora(@RequestBody Computadora computadora){
        return computadoraService.crear(computadora);
    }
}
