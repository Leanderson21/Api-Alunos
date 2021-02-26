package apiAlunos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiAlunos.Model.Aluno;
import apiAlunos.Repository.AlunoRepository;


@RequestMapping("/alunos")
@RestController
public class AlunosController {
	
	@Autowired
	private AlunoRepository alunoQuery;

	@GetMapping
	public List<Aluno> exibirTodos(){
		return alunoQuery.findAll();
	}
	
	@PostMapping
	public Aluno salvar(@RequestBody Aluno aluno) {
		return alunoQuery.save(aluno);
	}
	
	@GetMapping("/aprovados")
	public List<Aluno> exibirAprovados(){
		return alunoQuery.aprovados();
	}
	

}
