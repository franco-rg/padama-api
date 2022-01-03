package pe.franco.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.franco.model.Servicios;
import pe.franco.service.ServicioService;

@RestController
@RequestMapping(path = "/servicio-api")
public class ServiciosController {
	
	@Autowired
	ServicioService servicioService;
	
	/* list services */
	@GetMapping("/list")
	public List<Servicios> list(){
		return servicioService.listAll();
	}
	
	/* findById services */
	@GetMapping("/findById/{idservicios}")
	public ResponseEntity<Servicios> get(@PathVariable Integer idservicios){
		try {
			Servicios servicios = servicioService.findById(idservicios);
			return new ResponseEntity<Servicios>(servicios, HttpStatus.OK);			
		} catch (Exception e) {
			return new ResponseEntity<Servicios>(HttpStatus.NOT_FOUND);
		}
	}

	/* add service */
	@PostMapping("/add")
	public void add(@RequestBody Servicios servicios) {
		servicioService.add(servicios);
	}
	
	/* update service */
	@PutMapping("/update/{idservicios}")
	public ResponseEntity<?> update(@RequestBody Servicios servicios, @PathVariable Integer idservicios){
		try {
			Servicios existServicio = servicioService.findById(idservicios);
			servicios.setIdservicios(idservicios);
			servicioService.add(servicios);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	/* delete service */
	@DeleteMapping("/delete/{idservicios}")
	public void delete(@PathVariable Integer idservicios) {
		servicioService.delete(idservicios);
	}
}