/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.util.HashMap;
 import java.util.Map;       
/**
 *
 * @author Familia
 */
public class Server {
    public Map<String, String> users = new HashMap<>();
    private Middleware  middleware;
    
    
    public void setMiddleware(Middleware  middleware){
        this.middleware = middleware;
    }
       public boolean logIn(String email, String password) {
    if(middleware.check(email, password)){
        System.out.println("Holla adm");
        return true;
    }
    return false;
       }
       public void register(String email, String password){
           users.put(email,  password);
       }
       public boolean hasEmail(String email){
           return users.containsKey(email);
       }
 public boolean     isValidPassword(String email,String password){
 return users.get(email).equals(password);
 }
}


