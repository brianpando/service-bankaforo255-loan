package com.app.aforo255.loan.model.entity;

import java.io.Serializable;

public class Transaction implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int nroprestamos;
	private double importe_couta;
	private int couta;
	private int prestamoid;
	private String type;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNroprestamos() {
		return nroprestamos;
	}
	public void setNroprestamos(int nroprestamos) {
		this.nroprestamos = nroprestamos;
	}
	public double getImporte_couta() {
		return importe_couta;
	}
	public void setImporte_couta(double importe_couta) {
		this.importe_couta = importe_couta;
	}
	public int getCouta() {
		return couta;
	}
	public void setCouta(int couta) {
		this.couta = couta;
	}
	public int getPrestamoid() {
		return prestamoid;
	}
	public void setPrestamoid(int prestamoid) {
		this.prestamoid = prestamoid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
