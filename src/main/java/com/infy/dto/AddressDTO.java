package com.infy.dto;

import javax.validation.constraints.NotNull;

public class AddressDTO {

	private Integer addressId;
	@NotNull(message="please provide street")
	private String street;
	@NotNull(message="please provide cisty")
	String city;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AddressDTO [addressId=" + addressId + ", street=" + street + ", city=" + city + "]";
	}

}
