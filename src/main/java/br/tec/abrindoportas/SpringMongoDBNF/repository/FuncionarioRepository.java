package br.tec.abrindoportas.SpringMongoDBNF.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.tec.abrindoportas.SpringMongoDBNF.entity.FuncionarioEntity;

@Repository
public interface FuncionarioRepository extends MongoRepository<FuncionarioEntity, String>{ //ObjectId ?

}
