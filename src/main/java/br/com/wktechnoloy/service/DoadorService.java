package br.com.wktechnoloy.service;

import java.util.List;
import java.util.Optional;

import br.com.wktechnoloy.entity.Doador;

public interface DoadorService {

	List<Doador> findAll();

	Optional<Doador> findByUf(String estado);

	void insert(Doador doador);

	Long doadorByUf(String estado);

	Long imcByIdade(long idade, double imc);

	Long obsidadeBySexo(double imc, String sexo);

	Long idadeByTSanguineo(long idade, String tipo_sanguineo);

	Long doadorByTSanguineo(String tipo_sanguineo);
}
