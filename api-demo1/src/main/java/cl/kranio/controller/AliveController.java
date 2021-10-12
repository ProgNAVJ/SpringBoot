package cl.kranio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cl.kranio.model.Alive;

@RestController 
public class AliveController {
	
	@RequestMapping(value = "/alive", method = RequestMethod.GET)
	public ResponseEntity<Alive> alive() {
		
		Alive born = new Alive();
		
		born.setCode("Prueba de Microservicio");
		born.setId(666);
		born.setMessage("I'm aliveeeeeee... SoooooooOooOo Alive !");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(born);
		
	}
	

}
