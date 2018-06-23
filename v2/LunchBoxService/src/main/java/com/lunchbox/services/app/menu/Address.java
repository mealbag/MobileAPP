package com.lunchbox.services.app.menu;


import lombok.AccessLevel;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@Builder
@RequiredArgsConstructor (access=AccessLevel.PRIVATE)
@NoArgsConstructor (access=AccessLevel.PRIVATE, force = true)

public class Address {

	/**
	 * The number. This will be the flat, house number or house name.
	 */
	private final Integer houseNumber;
	private final String street;
	private final String city;
	private final Integer pinCode;
	private final String state;

}
