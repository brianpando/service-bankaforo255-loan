package com.app.aforo255.loan.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "cronogra_prestamos" )
public class CronogramaPrestamo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nroprestamo")
	private int nroprestamo;
	@Column(name = "couta")
	private int couta;
	@Column(name = "fecha_vencimiento")
	private String fecha_vencimiento;
	@Column(name = "dias")
	private int dias;
	@Column(name = "capital")
	private double capital;
	@Column(name = "interes")
	private double interes;
	@Column(name = "importe_couta")
	private double importe_couta;
	@Column(name = "pagado")
	private boolean pagado;
	@Column(name = "customer_id")
	private int customer_id;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNroprestamo() {
		return nroprestamo;
	}
	public void setNroprestamo(int nroprestamo) {
		this.nroprestamo = nroprestamo;
	}
	public int getCouta() {
		return couta;
	}
	public void setCouta(int couta) {
		this.couta = couta;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getImporte_couta() {
		return importe_couta;
	}
	public void setImporte_couta(double importe_couta) {
		this.importe_couta = importe_couta;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	
	
}
