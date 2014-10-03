/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hu.dpc.observerpattern;

/**
 *
 * @author martfer
 */
public class ResponseHandler2 implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("Handler2: " + msg);
    }

    
}
