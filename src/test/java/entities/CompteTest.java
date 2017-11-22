package entities;

import junit.framework.TestCase;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by zied on 23/11/2017.
 */
public class CompteTest extends TestCase {
    public void testSoldeEnEuros() throws Exception {
        //Arrange
        Compte compte1 = new Compte(1,new Date(10,12,2017),"Zied yazidi",1000);
        double actual = compte1.soldeEnEuros(compte1.getSoldeEnDinars());

        //Act
        double expected = 1000 * 0.34123;

        //Assert
        assertEquals(expected,actual);
    }

}