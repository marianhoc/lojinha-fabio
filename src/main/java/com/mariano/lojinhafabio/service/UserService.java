package com.mariano.lojinhafabio.service;

import com.mariano.lojinhafabio.Dao.UserDao;
import com.mariano.lojinhafabio.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;


    public Collection<User> getUsers(){
        return this.userDao.getUsers();
    }

    public User getUserById(int id){
        return this.userDao.getUserById(id);
    }


    public void removeUserById(int id) {
        this.userDao.removeUserById(id);
    }


    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    public void insertUser(User user) {
        this.userDao.insertUserToDB(user);

    }


}
