/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Familia
 */
public abstract  class Middleware {
    private Middleware next;
    /**
   * Classe de middleware base.
   * * Constrói cadeias de objetos de middleware.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
       
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }
    /**
     * As subclasses implementarão este método com verificações concretas.
     */
      public abstract boolean check(String email, String password);
         protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
       
}
