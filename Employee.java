package com.cdgi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="employee")
public class Employee {

	@Id
	@Column (name="empid")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int empid;
     String empname;
     double salary;
	 public int getEmpid() {
		 return empid;
	 }
	 public void setEmpid(int empid) {
		 this.empid = empid;
	 }
	 public String getEmpname() {
		 return empname;
	 }
	 public void setEmpname(String empname) {
		 this.empname = empname;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public void setSalary(double salary) {
		 this.salary = salary;
	 }
	 @Override
	 public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	 }
	 public Employee(int empid, String empname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	 }
	 public Employee() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public Employee(String empname, double salary) {
		super();
		this.empname = empname;
		this.salary = salary;
	 }
	 public Employee(int empid) {
		super();
		this.empid = empid;
	 }
     
     
	 
}
