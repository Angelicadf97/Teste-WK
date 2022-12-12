package br.com.wktechnoloy.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

import br.com.wktechnoloy.entity.Doador;

public class DoadorDTO {

	private String cpf;
	private long idade;;
	private String sexo;
	private String estado;
	private double altura;
	private double peso;
	private String tipo_sanguineo;
	private double imc;

	public DoadorDTO() {
	}

	public DoadorDTO(Doador doador) {
		this.cpf = doador.getCpf();
		this.idade = ChronoUnit.YEARS.between(LocalDateTime.now(), doador.getData_nasc());
		this.sexo = doador.getSexo();
		this.estado = doador.getEstado();
		this.altura = doador.getAltura();
		this.peso = doador.getPeso();
		this.tipo_sanguineo = doador.getTipo_sanguineo();
		this.imc = this.peso * (Math.pow(this.altura, 2));
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getIdade() {
		return idade;
	}

	public void setIdade(long idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipo_sanguineo() {
		return tipo_sanguineo;
	}

	public void setTipo_sanguineo(String tipo_sanguineo) {
		this.tipo_sanguineo = tipo_sanguineo;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public static List<DoadorDTO> converter(List<Doador> doador) {
		return doador.stream().map(DoadorDTO::new).collect(Collectors.toList());
	}

}
