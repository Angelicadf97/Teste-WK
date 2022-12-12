package br.com.wktechnoloy.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wktechnoloy.entity.Doador;

public interface DoadorRepository extends JpaRepository<Doador, String>{


}
