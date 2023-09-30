/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author aluno
 */

/**
 * ConcreteHandler. Verifica se há muitas solicitações de login com falha.
 */
public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;
    
    public ThrottlingMiddleware(int requestPerMinute){
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }
 public boolean check(String email, String password){
     if(System.currentTimeMillis()> currentTime + 60_000){
         request = 0;
         currentTime = System.currentTimeMillis();
     }
     request++;
     if(request >requestPerMinute){
         System.out.println("Limite");
         Thread.currentThread();
     }
     return checkNext(email, password);
 }  
}
