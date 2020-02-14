package edu.mum.bookstoreprojrct.simplebookstore.Impservice;

import edu.mum.bookstoreprojrct.simplebookstore.models.User;
import edu.mum.bookstoreprojrct.simplebookstore.repo.UserRepo;
import edu.mum.bookstoreprojrct.simplebookstore.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceIm  implements UserService {

    private UserRepo userRepo;

    public UserServiceIm(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> findAll() {
        List<User> users = (List<User>)userRepo.findAll();
        return users;
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public void deleteByUserName(String userName) {

       //find by username
        User user = userRepo.findByUserName(userName);
         userRepo.deleteById(user.getId());

   }

    @Override
    public Optional<User> findById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepo.findByUserName(userName);
    }
}
