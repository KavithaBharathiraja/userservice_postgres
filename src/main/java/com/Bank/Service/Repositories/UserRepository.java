package com.Bank.Service.Repositories;



import com.Bank.Service.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
