package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Professor;

@Repository
public interface RepositorioProfessor extends JpaRepository<Professor, Long> {

}
