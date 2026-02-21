//Para declarar os repository em JPA, basta a interface, declarando-se a assinatura o proprio JPA gera as classes em runtime.


package com.example.login_arth_api.repository;

import com.example.login_arth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {

    Optional<User> findByEmail(String email);


}
