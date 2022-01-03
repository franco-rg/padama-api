package pe.franco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.franco.model.Servicios;

public interface ServicioRepository extends JpaRepository<Servicios, Integer> {
}