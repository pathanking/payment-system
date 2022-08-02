package com.dbs.tech.paymentsystem.controller;

import com.dbs.tech.paymentsystem.entities.Receiver;
import com.dbs.tech.paymentsystem.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("receiver")
public class ReceiverController {

    @Autowired
    private ReceiverService receiverService;

    @PostMapping("/create")
    public ResponseEntity<Receiver> createReceiver(@RequestBody @Valid Receiver receiver){
        return new ResponseEntity<>(receiverService.save(receiver), HttpStatus.CREATED);
    }

    @GetMapping("/getAllReceivers")
    public List<Receiver> getAllReceivers(){
        return receiverService.getAll();
    }


}
