package com.t3.springbootjpa;

import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long>{
    
    Funcionario findById(long id);

    Long deleteById(long id);
    
    Long dleteByFirstName(String firstName);
}
