package com.camilomartin.controller;
 
import com.camilomartin.model.Rol;
import com.camilomartin.model.User;
import java.util.ArrayList;
 
public class AuthSystem {
 
    private static ArrayList<User> UserList = new ArrayList<>();
 
    public AuthSystem() {
        User adminUser = new User("admin", "admin", "admin", Rol.ADMIN);
        User usuarioUser = new User("user", "user", "user", Rol.USER);
        User userMe = new User("Camilo",
                "123", "Camilo Alberto Martin Espinoza", Rol.ADMIN);
        
        UserList.add(adminUser);
        UserList.add(usuarioUser);
        UserList.add(userMe);
    }
    public User login (String userName, String clave){
    for(User searchedUser: UserList){
        if (searchedUser.getUserName().equals(userName)
                && searchedUser.getPassword().equals(clave))
            return searchedUser;
    }
    return null;
    }
 
    public static ArrayList<User> getListaUser() {
        return UserList;
    }
 
    public static void setListaUser(ArrayList<User> ListaUser) {
        AuthSystem.UserList = ListaUser;
    }
}
 