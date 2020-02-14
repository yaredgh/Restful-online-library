package edu.mum.bookstoreprojrct.simplebookstore.service;

import edu.mum.bookstoreprojrct.simplebookstore.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User>findAll();
    User save(User user);
    void deleteById(Long id);
    void deleteByUserName(String userName);
    Optional<User> findById(Long id);
    User findByUserName(String userName);



}
