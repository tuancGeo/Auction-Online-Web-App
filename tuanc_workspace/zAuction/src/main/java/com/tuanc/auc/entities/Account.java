package com.tuanc.auc.entities;
// Generated Feb 28, 2023, 1:38:45 AM by Hibernate Tools 6.1.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private String photoAvatar;
	private double tcoint;
	private String securityCode;
	private byte warning;
	private boolean status;
	private String fullName;
	private String citizenIdentification;
	private String photoCitizenIdentification;
	private Set auctions = new HashSet(0);
	private Set sellerDetails = new HashSet(0);
	private Set comments = new HashSet(0);
	private Set roles = new HashSet(0);
	private Set bidLogs = new HashSet(0);
	private Set recipientInformations = new HashSet(0);
	private Set tickets = new HashSet(0);
	private Set products = new HashSet(0);
	private Set invoices = new HashSet(0);
	private Set auctions_1 = new HashSet(0);
	private Set transactionHistories = new HashSet(0);

	public Account() {
	}

	public Account(String username, String password, String email, String phoneNumber, String photoAvatar,
			double tcoint, byte warning, boolean status, String fullName, String citizenIdentification,
			String photoCitizenIdentification) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.photoAvatar = photoAvatar;
		this.tcoint = tcoint;
		this.warning = warning;
		this.status = status;
		this.fullName = fullName;
		this.citizenIdentification = citizenIdentification;
		this.photoCitizenIdentification = photoCitizenIdentification;
	}

	public Account(String username, String password, String email, String phoneNumber, String photoAvatar,
			double tcoint, String securityCode, byte warning, boolean status, String fullName,
			String citizenIdentification, String photoCitizenIdentification, Set auctions, Set sellerDetails,
			Set comments, Set roles, Set bidLogs, Set recipientInformations, Set tickets, Set products, Set invoices,
			Set auctions_1, Set transactionHistories) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.photoAvatar = photoAvatar;
		this.tcoint = tcoint;
		this.securityCode = securityCode;
		this.warning = warning;
		this.status = status;
		this.fullName = fullName;
		this.citizenIdentification = citizenIdentification;
		this.photoCitizenIdentification = photoCitizenIdentification;
		this.auctions = auctions;
		this.sellerDetails = sellerDetails;
		this.comments = comments;
		this.roles = roles;
		this.bidLogs = bidLogs;
		this.recipientInformations = recipientInformations;
		this.tickets = tickets;
		this.products = products;
		this.invoices = invoices;
		this.auctions_1 = auctions_1;
		this.transactionHistories = transactionHistories;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhotoAvatar() {
		return this.photoAvatar;
	}

	public void setPhotoAvatar(String photoAvatar) {
		this.photoAvatar = photoAvatar;
	}

	public double getTcoint() {
		return this.tcoint;
	}

	public void setTcoint(double tcoint) {
		this.tcoint = tcoint;
	}

	public String getSecurityCode() {
		return this.securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public byte getWarning() {
		return this.warning;
	}

	public void setWarning(byte warning) {
		this.warning = warning;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCitizenIdentification() {
		return this.citizenIdentification;
	}

	public void setCitizenIdentification(String citizenIdentification) {
		this.citizenIdentification = citizenIdentification;
	}

	public String getPhotoCitizenIdentification() {
		return this.photoCitizenIdentification;
	}

	public void setPhotoCitizenIdentification(String photoCitizenIdentification) {
		this.photoCitizenIdentification = photoCitizenIdentification;
	}

	public Set getAuctions() {
		return this.auctions;
	}

	public void setAuctions(Set auctions) {
		this.auctions = auctions;
	}

	public Set getSellerDetails() {
		return this.sellerDetails;
	}

	public void setSellerDetails(Set sellerDetails) {
		this.sellerDetails = sellerDetails;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getRoles() {
		return this.roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	public Set getBidLogs() {
		return this.bidLogs;
	}

	public void setBidLogs(Set bidLogs) {
		this.bidLogs = bidLogs;
	}

	public Set getRecipientInformations() {
		return this.recipientInformations;
	}

	public void setRecipientInformations(Set recipientInformations) {
		this.recipientInformations = recipientInformations;
	}

	public Set getTickets() {
		return this.tickets;
	}

	public void setTickets(Set tickets) {
		this.tickets = tickets;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

	public Set getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set invoices) {
		this.invoices = invoices;
	}

	public Set getAuctions_1() {
		return this.auctions_1;
	}

	public void setAuctions_1(Set auctions_1) {
		this.auctions_1 = auctions_1;
	}

	public Set getTransactionHistories() {
		return this.transactionHistories;
	}

	public void setTransactionHistories(Set transactionHistories) {
		this.transactionHistories = transactionHistories;
	}

}