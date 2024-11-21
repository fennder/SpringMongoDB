package br.tec.abrindoportas.SpringMongoDBNF.service;

import java.util.List;

import br.tec.abrindoportas.SpringMongoDBNF.entity.FuncionarioEntity;

public interface FuncionarioServiceInterface {
	
	List<FuncionarioEntity> listAll();

}
