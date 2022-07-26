package com.dbs.tech.paymentsystem.repository;

import com.dbs.tech.paymentsystem.entities.Receiver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiverRepository extends JpaRepository<Receiver, Integer> {
}
