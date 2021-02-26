package apiAlunos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import apiAlunos.Model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	@Query(value="SELECT * FROM aluno WHERE aluno.nota > 7" ,nativeQuery=true)
	List<Aluno> aprovados();
	
}
