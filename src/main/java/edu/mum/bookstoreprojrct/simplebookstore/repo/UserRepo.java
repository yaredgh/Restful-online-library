package edu.mum.bookstoreprojrct.simplebookstore.repo;

import edu.mum.bookstoreprojrct.simplebookstore.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    void deleteByUserName(String  userName);
    User findByUserName(String userName);
}
