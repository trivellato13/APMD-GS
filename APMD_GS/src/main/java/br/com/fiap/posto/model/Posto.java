package br.com.fiap.posto.model;

import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity @Table(name = "postos")
public class Posto {
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posto")
	@SequenceGenerator(sequenceName = "posto", allocationSize = 1, name = "posto")
	private Long id;
	
	private String nome;
	private String endereco;
	private String estado;
	private String avaliacao;
	private String plug;
	private String kwh;
	
	public Posto() {}
	
	public Posto(Long id, String nome, String endereco, String estado, String avaliacao, String plug, String kwh) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.estado = estado;
		this.avaliacao = avaliacao;
		this.plug = plug;
		this.kwh = kwh;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEstado() {
		return endereco;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getplug() {
		return plug;
	}

	public void setplug(String plug) {
		this.plug = plug;
	}

	public String getkwh() {
		return kwh;
	}

	public void setkwh(String kwh) {
		this.kwh = kwh;
	}
	
	public Vector<String> getData() {
		Vector<String> data = new Vector<String>();
		data.add(id.toString());
		data.add(nome);
		data.add(endereco);
		data.add(estado);
		data.add(avaliacao);
		data.add(plug);
		data.add(kwh);

		return data;
		
	}

}
