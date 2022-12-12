package br.com.wktechnoloy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.wktechnoloy.entity.Doador;
import br.com.wktechnoloy.service.DoadorService;

@RestController
public class DoadorController {

	@Autowired
	private DoadorService service;

	@GetMapping("doador")
	public ResponseEntity<List<Doador>> findAll() {
		List<Doador> doadores = service.findAll();
		return ResponseEntity.ok(doadores);
	}

	@PostMapping("doador")
	public ResponseEntity<Doador> insert(@RequestBody Doador doador) {
		service.insert(doador);
		return ResponseEntity.ok(doador);
	}

	@GetMapping("doador/uf/{estado}")
	public ResponseEntity<Optional<Doador>> findByUf(@PathVariable String estado) {
		Optional<Doador> doadores = service.findByUf(estado);
		return ResponseEntity.ok(doadores);
	}
}
