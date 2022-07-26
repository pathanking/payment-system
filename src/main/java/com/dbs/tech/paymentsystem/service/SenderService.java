package com.dbs.tech.paymentsystem.service;

import com.dbs.tech.paymentsystem.entities.Receiver;
import com.dbs.tech.paymentsystem.entities.Sender;
import com.dbs.tech.paymentsystem.repository.ReceiverRepository;
import com.dbs.tech.paymentsystem.repository.SenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class SenderService {

    @Autowired
    private SenderRepository senderRepository;


    @Autowired
    private ReceiverRepository receiverRepository;

    @Transactional
    public void transferBalance(Integer senderId, Integer receiverId, Double amount) {
        Sender sender = senderRepository.findById(senderId).get();
        if (sender.getBalance() > amount) {
            double balanceAfterTransfer = sender.getBalance()-amount;
            sender.setBalance(balanceAfterTransfer);

            Receiver receiver = receiverRepository.findById(receiverId).get();
            receiver.setBalance(receiver.getBalance() + amount);
        }
    }


}
