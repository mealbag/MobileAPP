package com.lunchbox.services.app.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

//@RestController
@Slf4j
public class LunchBoxController {

	@Autowired
	private LunchBoxService lunchBoxService;

	@RequestMapping("/menu")
	public Iterable<Menu> getMenu() {
		log.debug("Inside Menu calls");
		return lunchBoxService.getMenu();
	}

	@RequestMapping("/menu/{searchStr}")
	public Menu searchMenu(@PathVariable String searchStr) {

		System.out.println("1111111111111111111" + searchStr);
		return lunchBoxService.searchMenu(searchStr);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/signUpCust")
	public void signUpCustomer(@RequestBody Customer customer) {

		lunchBoxService.signUpCustomer(customer);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/loginUser")
	public boolean loginUser(@RequestBody Customer customer) {
		System.out.println("user.............->" + customer.toString());
		log.debug("inside login user");
		return lunchBoxService.loginUser(customer.getLoginusername(), customer.getPassword());
	}

}

/*
 * MenuBean menuBean = MenuBean.builder() .id(1234) .name("Sambar") .price(10)
 * .ingredients("pappu sambar masala").build();
 */
