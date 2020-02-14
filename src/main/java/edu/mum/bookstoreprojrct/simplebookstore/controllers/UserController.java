package edu.mum.bookstoreprojrct.simplebookstore.controllers;

import edu.mum.bookstoreprojrct.simplebookstore.models.User;
import edu.mum.bookstoreprojrct.simplebookstore.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/creat")
    public User creatUser(@RequestBody User user){
        return userService.save(user);
    }
    @DeleteMapping("/delete")
    public void removeUser(@RequestBody Long id){
        userService.deleteById(id);
    }
    @RequestMapping("/searchById")
    public Optional<User> findById(@RequestParam ("id") Long id ){
        return userService.findById(id);
    }
    @DeleteMapping("/deleteByUserName")
    public void deleteByUserName(@RequestParam("userName") String userName){
        userService.deleteByUserName(userName);
    }
    @RequestMapping("/findByUserName")
    public User findByUserName(@RequestParam("userName") String userName){
        return userService.findByUserName(userName);
    }
    @GetMapping("/findAll")
    public List<User>findAll(){
        List<User> users = userService.findAll();
        return users;
    }
}
