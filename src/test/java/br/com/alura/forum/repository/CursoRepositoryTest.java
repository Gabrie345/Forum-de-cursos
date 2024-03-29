package br.com.alura.forum.repository;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.alura.forum.modelo.Curso;

@RunWith(SpringRunner.class)
@DataJpaTest
class CursoRepositoryTest {
	
	@Autowired
	private  CursoRepository repository;

	@org.junit.Test
	private void testFindByNome() {
		String nomeCurso = "HTML 5";
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNotNull(curso);
		Assert.assertEquals(nomeCurso, curso.getNome());	
		
	}

}
