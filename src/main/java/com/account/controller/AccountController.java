/**
 * 
 */
package com.account.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.account.dto.model.AccountDTO;
import com.account.service.AccountService;

/**
 * @author Naren
 *
 */
@RestController
@RequestMapping("/account/api")
public class AccountController {

	@Autowired
	AccountService accountService;

	private static final Logger LOGGER = Logger.getLogger(AccountController.class);
	
	@RequestMapping(value = "/getproductdetails", method = RequestMethod.GET, produces = "application/json")
	public List<AccountDTO> getAllAccounts() {

		List<AccountDTO> data = null;
		LOGGER.debug(" getAllAccounts :: Start::");
		data = accountService.getAllAccounts();
		LOGGER.debug(" getAllAccounts :: data :: "+ data.toString());
		if (data == null || data.size()==0) {
			LOGGER.error(HttpStatus.NOT_FOUND);
			throw new HttpServerErrorException(HttpStatus.NOT_FOUND);
		}
		LOGGER.debug(" getAllAccounts :: End::");
		return data;
	}
	
	@RequestMapping(value = "/getconfigdetails", method = RequestMethod.GET, produces = "application/json")
	public List<AccountDTO> getconfigdetails() {

		List<AccountDTO> data = null;
		LOGGER.debug(" getconfigdetails :: Start::");
		data = accountService.getAllAccounts();
		LOGGER.debug(" getconfigdetails :: data :: "+ data.toString());
		if (data == null || data.size()==0) {
			LOGGER.error(HttpStatus.NOT_FOUND);
			throw new HttpServerErrorException(HttpStatus.NOT_FOUND);
		}
		LOGGER.debug(" getconfigdetails :: End::");
		return data;
	}

}
