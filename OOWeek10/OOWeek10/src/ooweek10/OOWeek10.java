/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooweek10;

/**
 *
 * @author hessel
 */
public class OOWeek10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polynomials p = new Polynomials("-3.0 1 9 2 3 0");
        System.out.println(p.toString());
        p = new Polynomials("2 1 -1 -3 4 5");
        System.out.println(p.toString());
    }
    
}
