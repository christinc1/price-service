package com.chris.learn.springcloud.priceservice.repository;


import com.chris.learn.springcloud.priceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {

}
