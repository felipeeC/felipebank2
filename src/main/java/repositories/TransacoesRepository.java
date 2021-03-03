package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Transacoes;

public interface TransacoesRepository extends JpaRepository<Transacoes, Long>{

}
