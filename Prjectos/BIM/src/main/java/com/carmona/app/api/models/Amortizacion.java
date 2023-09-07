package com.carmona.app.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="amort")
@Entity
public class Amortizacion {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq2", allocationSize = 1, name = "CUST_SEQ2")
	private Long id;
	
	@Column(name="npago")
	private Long npago;
	
	@Column(name="pagomes")
	private Float pagomes;
	
	@Column(name="capital_periodo")
	private Long capitalPeriodo;
	
	@Column(name="interes_periodo")
	private Float interesPeriodo;
	
	@Column(name="saldo_insuluto")
	private Float saldoInsoluto;
	
	
	@JoinColumn(name="credito_id")
	@ManyToOne
	private Credito ncredito;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getNpago() {
		return npago;
	}


	public void setNpago(Long npago) {
		this.npago = npago;
	}


	public Float getPagomes() {
		return pagomes;
	}


	public void setPagomes(Float pagomes) {
		this.pagomes = pagomes;
	}


	public Long getCapitalPeriodo() {
		return capitalPeriodo;
	}


	public void setCapitalPeriodo(Long capitalPeriodo) {
		this.capitalPeriodo = capitalPeriodo;
	}


	public Float getInteresPeriodo() {
		return interesPeriodo;
	}


	public void setInteresPeriodo(Float interesPeriodo) {
		this.interesPeriodo = interesPeriodo;
	}


	public Float getSaldoInsoluto() {
		return saldoInsoluto;
	}


	public void setSaldoInsoluto(Float saldoInsoluto) {
		this.saldoInsoluto = saldoInsoluto;
	}


	public Credito getNcredito() {
		return ncredito;
	}


	public void setNcredito(Credito ncredito) {
		this.ncredito = ncredito;
	}

}
