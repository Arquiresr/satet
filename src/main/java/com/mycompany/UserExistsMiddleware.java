/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Familia
 */
public class UserExistsMiddleware extends Middleware{
    private Server server;
    public UserExistsMiddleware(Server server){
        this.server = server;
    }
    public boolean check(String email, String password){
        if(!server.hasEmail(email)){
            System.out.println("E-mail nao emcontrado");
            return false;
        }
        if(!server.isValidPassword(email, password)){
              System.out.println("E-mail ou senha não não encotrado");
            return false;
        }
        return checkNext(email,password);
    }
    
}
