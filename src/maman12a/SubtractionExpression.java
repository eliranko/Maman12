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
public class SubtractionExpression extends CompoundExpression {
    
    public SubtractionExpression(Expression operand1, Expression operand2) {
        super(operand1, operand2);
    }
    
    @Override
    public double calculate() {
        return operand1.calculate() - operand2.calculate();
    }
    
    @Override
    public String toString() {
        return "(" + operand1.toString() + ")" + " - " + "(" + operand2.toString() + ")";
    }
}
