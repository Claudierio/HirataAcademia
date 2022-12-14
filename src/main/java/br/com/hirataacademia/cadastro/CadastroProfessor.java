package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.cadastro.exception.ProfessorNaoEncontradoException;
import br.com.hirataacademia.repositorios.RepositorioProfessor;

@Service
public class CadastroProfessor {
	@Autowired
	private RepositorioProfessor repositorioProfessor;

	public Professor save(Professor entity) {

		return repositorioProfessor.save(entity);
	}

	public List<Professor> findAll() {

		return repositorioProfessor.findAll();
	}

	public void deleteById(Long id) {
		repositorioProfessor.deleteById(id);
	}

	public void delete(Professor entity) {
		repositorioProfessor.delete(entity);
	}

	public Professor findProfessorById(long id) throws ProfessorNaoEncontradoException {

		return repositorioProfessor.findById(id).orElseThrow(() -> new ProfessorNaoEncontradoException());
	}

}
