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
public abstract class Expression {
    public abstract double calculate();

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Expression)) return false;
        
        Expression expression = (Expression) obj;
        return this.calculate() == expression.calculate();
    }
}
