package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Plano;

@Repository
public interface RepositorioPlano extends JpaRepository<Plano, Long> {

}
