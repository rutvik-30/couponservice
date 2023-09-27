package com.bharath.springcloud.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bharath.springcloud.model.Coupon;
import com.bharath.springcloud.repos.CouponRepo;

@Service
public class CodeService {
	
	@Autowired
	private CouponRepo couponRepo;

	/*
	 * public ResponseEntity<Object> checkCode(String code) {
	 * 
	 * if(code!=null) { Coupon coupon=couponRepo.findByCode(code); if(coupon!=null)
	 * { LocalDateTime expirationDate=coupon.getExpDate(); LocalDateTime
	 * dateNow=LocalDateTime.now();
	 * 
	 * if(expirationDate.isBefore(dateNow)) { return new
	 * ResponseEntity<>("Coupon is expired",HttpStatus.BAD_REQUEST); } else { return
	 * new ResponseEntity<>(coupon,HttpStatus.OK); } } else { return new
	 * ResponseEntity<>("Coupon Code is Invalid",HttpStatus.BAD_REQUEST); } }
	 * 
	 * return null; }
	 */

	public ResponseEntity<Object> getCode(String code) {
		Coupon coupon=couponRepo.findByCode(code);
		if(coupon!=null) {
			return new ResponseEntity<>(coupon,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("NO_OK",HttpStatus.BAD_REQUEST);
		}
		
	}

}
