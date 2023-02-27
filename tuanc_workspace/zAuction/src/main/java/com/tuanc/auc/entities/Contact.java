package com.tuanc.auc.entities;
// Generated Feb 28, 2023, 1:38:45 AM by Hibernate Tools 6.1.5.Final

/**
 * Contact generated by hbm2java
 */
public class Contact implements java.io.Serializable {

	private Integer id;
	private String email;
	private String content;
	private String status;

	public Contact() {
	}

	public Contact(String email, String content, String status) {
		this.email = email;
		this.content = content;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}