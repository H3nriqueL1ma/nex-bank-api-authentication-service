package com.github.h3nriquel1ma.authenticationservicecore.Repositories;

import com.github.h3nriquel1ma.authenticationservicecore.Models.ClientModelQueryAuth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClientLoginRepository extends JpaRepository<ClientModelQueryAuth, UUID> {
    Optional<ClientModelQueryAuth> findByClientUserName(String username);
}
