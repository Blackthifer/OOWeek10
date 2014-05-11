/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooweek10;

import java.util.Scanner;

/**
 *
 * @author hessel
 */
public class Term {
    
    public double factor;
    public int power;
    
    public Term(Term t){
        factor = t.factor;
        power = t.power;
    }
    
    public Term(double f, int p){
        factor = f;
        power = p;
    }
    
    @Override
    public String toString(){
        return toString(-1);
    }
    
    public String toString(int index){
        if(index < 0)
            return "error";
        String out = "";
        if(index != 0 && factor < 0){
            factor = -factor;
            out += factor;
            factor = -factor;
        }
        else
            out += factor;
        if(power != 0){
            out += "*x";
            if(power != 1){
                out += "^";
                out += power;
            }
        }
        return out;
    }
    
    /**
	 * A static method for converting scanner input into
	 * a term. The expected format is two numbers (coef, exp)
	 * separated by whitespaces. The coef should be either
	 * an integer or a decimal number. The exp is an integer.
	 * This format is specified by the regular expression named coef_patt
	 * @param s the scanner providing the input
	 * @return null if no term could be found, the found term otherwise
         * @author Sjaak Smetsers
	 */
    public static Term scanTerm (Scanner s) {
        String coef_patt = "\\-?\\d+(\\.\\d+)?";
        if (s.hasNext (coef_patt)) {
            String coef = s.next(coef_patt);
            int exp  = s.nextInt();
            return new Term (Double.parseDouble(coef), exp);
        } else {
            return null;
        }
    }
}
