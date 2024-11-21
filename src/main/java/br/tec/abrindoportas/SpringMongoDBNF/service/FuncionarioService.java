package br.tec.abrindoportas.SpringMongoDBNF.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.tec.abrindoportas.SpringMongoDBNF.entity.FuncionarioEntity;
import br.tec.abrindoportas.SpringMongoDBNF.repository.FuncionarioRepository;

@Service
public class FuncionarioService implements FuncionarioServiceInterface {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public List<FuncionarioEntity> listAll() {
		
		List<FuncionarioEntity> funcionarioEntity = new ArrayList<>();
		funcionarioRepository.findAll().forEach(funcionarioEntity::add);
		return funcionarioEntity;
	}

}
