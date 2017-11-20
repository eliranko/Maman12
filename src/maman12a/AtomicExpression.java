/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman12a;

/**
 *
 * @author elira
 */
public class AtomicExpression extends Expression {
    private final double number;
    
    AtomicExpression(double number) {
        this.number = number;
    }
    
    @Override
    public double calculate() {
        return number;
    }
    
    @Override
    public String toString() {
        return Double.toString(number);
    }
}
