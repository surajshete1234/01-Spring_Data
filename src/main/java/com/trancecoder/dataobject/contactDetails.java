package com.trancecoder.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_DTLS")
public class contactDetails {

	@Id
	private String clientNum;

	@Column(name = "clientAddress")
	private String clientAddress;

	@Column(name = "clientPhone")
	private Long clientPhone;

	public String getClientNum() {
		return clientNum;
	}

	public void setClientNum(String clientNum) {
		this.clientNum = clientNum;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public Long getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(Long clientPhone) {
		this.clientPhone = clientPhone;
	}

	@Override
	public String toString() {
		return "contactDetails [clientNum=" + clientNum + ", clientAddress=" + clientAddress + ", clientPhone="
				+ clientPhone + "]";
	}

}
