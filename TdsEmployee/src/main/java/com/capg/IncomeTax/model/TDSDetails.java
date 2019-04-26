package com.capg.IncomeTax.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tds_master")
public class TDSDetails {
	@Id
	private int id;
	@Column(name="deductor_name",nullable=false)
	private String deductorName;
	@Column(name="deductor_pan",nullable=false)
	private String deductorPan;
	@Column(name="tds_deposited",nullable=false)
	private int tdsDeposited;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductorName() {
		return deductorName;
	}
	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}
	public String getDeductorPan() {
		return deductorPan;
	}
	public void setDeductorPan(String deductorPan) {
		this.deductorPan = deductorPan;
	}
	public int getTdsDeposited() {
		return tdsDeposited;
	}
	public void setTdsDeposited(int tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}

	
}
