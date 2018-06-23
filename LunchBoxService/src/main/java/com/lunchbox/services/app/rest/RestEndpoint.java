package com.lunchbox.services.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lunchbox.services.app.menu.Customer;
import com.lunchbox.services.app.menu.LunchBoxService;
import com.lunchbox.services.app.menu.Menu;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/lunchbox")
public class RestEndpoint {

	@Autowired
	private LunchBoxService lunchBoxService;

	@RequestMapping("/menu")
	public Iterable<Menu> getMenu() {
		log.debug("Inside Menu calls");
		return lunchBoxService.getMenu();
	}

	@RequestMapping("/menu/{searchStr}")
	public Menu searchMenu(@PathVariable String searchStr) {

		System.out.println("searchStr:" + searchStr);
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
