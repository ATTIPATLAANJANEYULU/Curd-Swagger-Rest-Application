package com.org.volvobus.controller;

import com.org.volvobus.model.Bus;
import com.org.volvobus.repositary.BusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private BusRepo busRepo;

    @PostMapping("/create")
    public void create(@RequestBody Bus bus) {
        busRepo.save(bus);
    }

    @GetMapping("/getId/{busId}")
    public void Id(@PathVariable int busId) {
        busRepo.findById(busId);
    }

    @GetMapping("/getName/{busName}")
    public void getName(@PathVariable String busName) {
        busRepo.findBybusName(busName);
    }

    @DeleteMapping("/deleteName/{busName}")
    public void deleteName(@PathVariable String busName) {
        busRepo.deleteBybusName(busName);
    }

    @PutMapping("/updateName/{bus}")
    public void updateName(@RequestBody Bus bus) {
        busRepo.save(bus);
    }
}

