package client;

import entities.Compte;

import java.util.Date;

/**
 * Created by zied on 22/11/2017.
 */
public class App {
    public static void main(String[] args){
        Compte compte = new Compte(1,new Date(10,12,2017),"Zied yazidi",1000);
        System.out.println(compte.getOwnerCompte());

    }
}
