/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer;

    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) { 
       Customer MyCustomer = CustomerFactory.createCustomer("Delinquent");
       System.out.println(MyCustomer.createMail());
    }
}
