package com.dbs.tech.paymentsystem.repository;

import com.dbs.tech.paymentsystem.entities.Sender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenderRepository extends JpaRepository<Sender, Integer> {
}
