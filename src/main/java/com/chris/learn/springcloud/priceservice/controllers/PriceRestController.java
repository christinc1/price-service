package com.chris.learn.springcloud.priceservice.controllers;

import com.chris.learn.springcloud.priceservice.model.Price;
import com.chris.learn.springcloud.priceservice.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prices")
public class PriceRestController {

    @Autowired
    PriceRepository priceRepository;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Price price) {
        return ResponseEntity.ok(priceRepository.save(price));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTicket(@PathVariable("id") Long id) {
        return ResponseEntity.ok(priceRepository.findById(id));
    }
}
