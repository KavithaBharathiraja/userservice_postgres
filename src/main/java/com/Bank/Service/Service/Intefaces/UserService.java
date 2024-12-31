package com.Bank.Service.Service.Intefaces;





import com.Bank.Service.Models.User;

import java.util.List;

public interface UserService {

   User createUser(User user);

    List<User> getAllUsers();

    User updateUser(User user);

    boolean deleteUser(Long id);


}
