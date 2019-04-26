package com.capg.IncomeTax.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.IncomeTax.Exception.IdNotFoundException;
import com.capg.IncomeTax.Service.TDSService;
import com.capg.IncomeTax.model.TDSDetails;

@RestController
public class TDSController {

	@Autowired
	TDSService tdsDetailsService;
	
	@GetMapping("/")
	public String homePage() {
		return "Welcome";
	}
	@GetMapping("/getById{id}")
	public TDSDetails getById(@PathVariable int id) {
		TDSDetails tdsDetails=tdsDetailsService.getById(id);
		if(tdsDetails==null) {
			throw new IdNotFoundException("ID not found wrong ID : "+id);
		}
		else
			return tdsDetails;
	}

}
