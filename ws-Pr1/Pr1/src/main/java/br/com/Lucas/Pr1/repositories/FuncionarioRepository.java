package br.com.Lucas.Pr1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Lucas.Pr1.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
