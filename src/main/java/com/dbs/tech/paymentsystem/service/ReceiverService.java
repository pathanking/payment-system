package com.dbs.tech.paymentsystem.service;

import com.dbs.tech.paymentsystem.entities.Receiver;
import com.dbs.tech.paymentsystem.repository.ReceiverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiverService {

    @Autowired
    private ReceiverRepository receiverRepository;

    public Receiver save(Receiver receiver) {
        return receiverRepository.save(receiver);
    }

    public List<Receiver> getAll() {
        return receiverRepository.findAll();
    }
}

