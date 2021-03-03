package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long>{

}
