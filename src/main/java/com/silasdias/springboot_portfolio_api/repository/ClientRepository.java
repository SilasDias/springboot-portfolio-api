package com.silasdias.springboot_portfolio_api.repository;

import com.silasdias.springboot_portfolio_api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
