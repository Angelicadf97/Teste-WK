package br.com.wktechnoloy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wktechnoloy.entity.Doador;
import br.com.wktechnoloy.respository.DoadorRepository;

@Service
public class DoadorServiceImpl implements DoadorService {

	@Autowired
	private DoadorRepository repository;

	@Override
	public List<Doador> findAll() {
		List<Doador> doadores = repository.findAll();
		return doadores;
	}

	@Override
	public void insert(Doador doador) {
		repository.save(doador);
	}

	@Override
	public Optional<Doador> findByUf(String estado) {

		return repository.findById(estado);
	}

	@Override
	public Long doadorByUf(String estado) {
		return null;
	}

	@Override
	public Long imcByIdade(long idade, double imc) {
		return idade;
	}

	@Override
	public Long obsidadeBySexo(double imc, String sexo) {
		return null;
	}

	@Override
	public Long idadeByTSanguineo(long idade, String tipo_sanguineo) {
		return idade;
		// TODO Auto-generated method stub

	}

	@Override
	public Long doadorByTSanguineo(String tipo_sanguineo) {
		return null;
	}

}
