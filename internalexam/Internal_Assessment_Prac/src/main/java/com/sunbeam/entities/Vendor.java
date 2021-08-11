package com.sunbeam.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendors")
public class Vendor {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private String city;
	private String cell_no;
	private double reg_amount;
	private Date reg_date;
	private String role;
	public Vendor() {
	}
	public Vendor(int id, String name, String email, String password, String city, String cell_no, double reg_amount,
			Date reg_date, String role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.cell_no = cell_no;
		this.reg_amount = reg_amount;
		this.reg_date = reg_date;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCell_no() {
		return cell_no;
	}
	public void setCell_no(String cell_no) {
		this.cell_no = cell_no;
	}
	public double getReg_amount() {
		return reg_amount;
	}
	public void setReg_amount(double reg_amount) {
		this.reg_amount = reg_amount;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Vendors [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", city=" + city
				+ ", cell_no=" + cell_no + ", reg_amount=" + reg_amount + ", reg_date=" + reg_date + ", role=" + role
				+ "]";
	}
	
}
