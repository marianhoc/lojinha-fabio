package com.mariano.lojinhafabio.Dao;

import com.mariano.lojinhafabio.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
    private static Map<Integer, User> users;

    static {
        users = new HashMap<Integer, User>(){
            {
                put(1, new User(1, "mariano", "21 989898989", "Rua lero lero", false));
                put(2, new User(2, "caio", "21 879897986768", "Rua bla bla", true));
                put(3, new User(3, "fabio", "21 444555666", "Nao informado", false));

            }
        };
    }


    public Collection<User> getUsers(){
        return this.users.values();
    }

    public User getUserById(int id){
        return this.users.get(id);
    }

    public void removeUserById(int id) {
        this.users.remove(id);
    }

    public void updateUser(User user){
        User u = users.get(user.getId());
        u.setName(user.getName());
        u.setTel(user.getTel());
        users.put(user.getId(),user);
    }

    public void insertUserToDB(User user) {
        this.users.put(user.getId(), user);

    }



}
