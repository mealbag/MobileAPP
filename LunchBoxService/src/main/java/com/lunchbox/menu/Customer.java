package com.lunchbox.menu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Builder
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Integer customer_id;
	private final String loginusername;
	private final String firstname;
	private final String lastname;
	private final String password;
	private final String dob;
	private final String mobilenum;
	private final String email;
	private final String company;
	// private final Address Address;
	private final String address;

}
