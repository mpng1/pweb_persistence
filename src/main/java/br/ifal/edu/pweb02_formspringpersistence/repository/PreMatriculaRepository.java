package br.ifal.edu.pweb02_formspringpersistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifal.edu.pweb02_formspringpersistence.model.PreMatricula;

@Repository
public interface PreMatriculaRepository extends JpaRepository<PreMatricula,Long>{

}
