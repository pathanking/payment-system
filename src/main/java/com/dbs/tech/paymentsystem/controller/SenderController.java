package com.dbs.tech.paymentsystem.controller;

import com.dbs.tech.paymentsystem.service.SenderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
