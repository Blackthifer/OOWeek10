/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooweek10;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author hessel
 */
public class Polynomials{
    
    private ArrayList<Term> polynomial;
    
    public Polynomials(String str){
        polynomial = new ArrayList<>();
        Scanner scan = new Scanner(str);
        for(Term t = Term.scanTerm(scan); t != null; t = Term.scanTerm(scan))
            polynomial.add(t);
        quickSortPolynomial(0, polynomial.size() - 1);
    }
    
    private void swapTerms(int ind1, int ind2){
        if(ind1 != ind2){
            Term store = new Term(polynomial.get(ind1));
            polynomial.set(ind1, polynomial.get(ind2));
            polynomial.set(ind2, store);
        }
    }
    
    private void quickSortPolynomial(int start, int end){
        int red = start - 1;
        int white = end + 1;
        int blue = end + 1;
        Term pivot = polynomial.get((start+end)/2);
        if(start < end){
            while(red < white - 1){
                Term t = polynomial.get(white - 1);
                if(t.power > pivot.power){
                    red++;
                    swapTerms(white - 1, red);
                }
                if(t.power == pivot.power){
                    white--;
                }
                if(t.power < pivot.power){
                    white--;
                    blue--;
                    swapTerms(white, blue);
                }
            }
            quickSortPolynomial(start, red);
            quickSortPolynomial(blue, end);
        }
    }
    
    public void add(Polynomials p){
        
    }
    
    public void substract(Polynomials p){
        for(int i = 0; i < p.polynomial.size() - 1; i++){
            Term t = p.polynomial.get(i);
            t.factor = -t.factor;
            p.polynomial.set(i, t);
        }
    }
    
    public void multiply(Polynomials p){
        Polynomials p1 = new Polynomials("");
        Polynomials p2 = new Polynomials("");
        ListIterator lIt1 = polynomial.listIterator();
        if(lIt1.hasNext()){
            Term t1 = new Term((Term)lIt1.next());
            ListIterator lIt2 = p.polynomial.listIterator();
            while(lIt2.hasNext()){
                Term t2 = new Term((Term)lIt2.next());
                t2.factor = t2.factor * t1.factor;
                t2.power = t2.power + t1.power;
                p1.polynomial.add(t2);
            }
        }
        while(lIt1.hasNext()){
            Term t1 = new Term((Term)lIt1.next());
            ListIterator lIt2 = p.polynomial.listIterator();
            while(lIt2.hasNext()){
                Term t2 = new Term((Term)lIt2.next());
                t2.factor = t2.factor * t1.factor;
                t2.power = t2.power + t1.power;
                p2.polynomial.add(t2);
            }
            p1.add(p2);
        }
        polynomial = p1.polynomial;
    }
    
    public double apply(double x){
        double value = 0;
        ListIterator lIt = polynomial.listIterator();
        while(lIt.hasNext()){
            Term t = (Term)lIt.next();
            value += t.factor * Math.pow(x, t.power);
        }
        return value;
    }
    
    @Override
    public String toString(){
        if(polynomial == null || polynomial.isEmpty())
            return "0";
        String out = "";
        ListIterator lIt = polynomial.listIterator();
        int index = -1;
        while(lIt.hasNext()){
            index++;
            out += ((Term)lIt.next()).toString(index);
            if(lIt.hasNext()){
                Term next = (Term)lIt.next();
                if(next.factor >= 0)
                    out += " + ";
                if(next.factor < 0)
                    out += " - ";
                lIt.previous();
            }
        }
        return out;
    }
}
