package com.ocp.pgdemo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String ocpgroup;
	/**
	 * @return the code
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Long id) {
		this.id = id;
	}
	/**
	 * @return the msg
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the data
	 */
	public Object getOcpgroup() {
		return ocpgroup;
	}
	/**
	 * @param data the data to set
	 */
	public void setOcpgroup(String ocpgroup) {
		this.ocpgroup = ocpgroup;
	}
	

}
