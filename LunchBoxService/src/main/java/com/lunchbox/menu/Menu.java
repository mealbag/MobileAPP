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
@RequiredArgsConstructor (access=AccessLevel.PRIVATE)
@NoArgsConstructor (access=AccessLevel.PRIVATE, force = true)
@Entity // This tells Hibernate to make a table out of this class
//@Table(name="menu")
public class Menu {
	
    @GeneratedValue(strategy=GenerationType.AUTO)
	private final Integer id;
	private final String type;
	@Id
	private final String name;
	private final String description;
	private final Integer price;
	private final String extraComments;
	private final String ingredients;
	private final Integer rating;
	
	

}
