package mx.unam.aragon.ico.is.computadoraApi;

import mx.unam.aragon.ico.is.computadoraApi.entities.Computadora;
import mx.unam.aragon.ico.is.computadoraApi.repositories.ComputadoraRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComputadoraApiApplicationTests {
	@Autowired
	private ComputadoraRepository computadoraRepository;


	@Test
	void contextLoads() {
	}
	@Test
	void insertarComputadora(){
		Computadora computadora1 = new Computadora(0, "Hp", "jamon 270",null,3000);
		computadoraRepository.save(computadora1);
	}

	@Test
	void leerComputadora(){
		Long claveTmp=2L;
		Computadora prueba = computadoraRepository.findComputadoraByClave(claveTmp);
		System.out.println(prueba);
	}
	@Test
	public void eliminarComputadora(){
		Long claveTmp=2L;
		computadoraRepository.deleteById(claveTmp);
	}

	@Test
	public void actualizarPC(){
		Long claveTmp=3L;
		Computadora tmp = computadoraRepository.findComputadoraByClave(claveTmp);
		tmp.setModelo("mango2900");
		computadoraRepository.save(tmp);
	}

}
