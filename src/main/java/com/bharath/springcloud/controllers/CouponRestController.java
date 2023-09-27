package com.bharath.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.springcloud.model.Coupon;
import com.bharath.springcloud.repos.CouponRepo;
import com.bharath.springcloud.service.CodeService;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired 
	CouponRepo repo;
	
	@Autowired
	private CodeService codeService;
	 
	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {

	return repo.save(coupon);
	}

	@RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
	public ResponseEntity<Object> getCoupon(@PathVariable("code") String code) {
	return codeService.getCode(code);
		
	}
}
