package com.bharath.springcloud.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bharath.springcloud.model.Coupon;

  public interface CouponRepo extends MongoRepository<Coupon, Long> {
  
  Coupon findByCode(String code);
  
  }
 
