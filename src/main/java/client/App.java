package client;

import entities.Compte;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by zied on 22/11/2017.
 */
public class App {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DATE, 24);
        Date date = calendar.getTime();
        Compte compte = new Compte(1,date,"Zied yazidi",1000);



    }
}
