package pe.franco.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.franco.model.Servicios;
import pe.franco.repository.ServicioRepository;

@Service
@Transactional
public class ServicioService {
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	/* operations */
	/* list */
	public List<Servicios> listAll(){
		return servicioRepository.findAll();
	}
	
	/* save */
	public void add(Servicios servicios) {
		servicioRepository.save(servicios);
	}
	
	/* findById */
	public Servicios findById(Integer idservicios) {
		return servicioRepository.findById(idservicios).get();
	}
	
	/* delete */
	public void delete(Integer idservicios) {
		servicioRepository.deleteById(idservicios);
	}
}
