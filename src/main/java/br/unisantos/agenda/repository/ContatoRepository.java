package br.unisantos.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisantos.agenda.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
	
}
