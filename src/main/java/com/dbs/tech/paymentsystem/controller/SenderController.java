package com.dbs.tech.paymentsystem.controller;

import com.dbs.tech.paymentsystem.entities.Sender;
import com.dbs.tech.paymentsystem.service.SenderService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vi/sender")
@Slf4j
public class SenderController {

    @Autowired
    private SenderService service;

    @PostMapping("/transfer")
    public void transfer(@RequestParam("senderId") Integer senderId, @RequestParam("receiverId") Integer receiverId, @RequestParam("amount") Double amount){
        log.info("Transferring amount "+amount+ " from "+senderId+" to "+receiverId+" account");
        service.transferBalance(senderId, receiverId,amount);
    }

    @PostMapping("/create")
    public ResponseEntity<Sender> createSender(@RequestBody Sender sender){
        return new ResponseEntity<>(service.save(sender), HttpStatus.CREATED);
    }

    @GetMapping("/getAllSenders")
    public List<Sender> getAllSenders(){
        return service.getAll();
    }

}
