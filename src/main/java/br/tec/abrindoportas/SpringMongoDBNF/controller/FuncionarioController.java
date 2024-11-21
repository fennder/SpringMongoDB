package br.tec.abrindoportas.SpringMongoDBNF.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.tec.abrindoportas.SpringMongoDBNF.entity.FuncionarioEntity;
import br.tec.abrindoportas.SpringMongoDBNF.service.FuncionarioServiceInterface;

@RestController
public class FuncionarioController {
	
	@Autowired
	private FuncionarioServiceInterface funcionarioServiceInterface;
	
	@GetMapping("/")
	public ResponseEntity<String> inicio()
	{
		String response = """
				<html>
					<body>
						<a href="/listarFuncionarios">Listar Funcionários</a>
					</body>
				</html>
				""";
		
		return new ResponseEntity<String>(response,HttpStatus.OK);	
	}
	
	@GetMapping("/listarFuncionarios")
	public ResponseEntity<List<FuncionarioEntity>> listarFuncionarios(){
		
		List<FuncionarioEntity> funcionarioModels = funcionarioServiceInterface.listAll();
		return new ResponseEntity<List<FuncionarioEntity>>(funcionarioModels,HttpStatus.OK);
		
	}

}
