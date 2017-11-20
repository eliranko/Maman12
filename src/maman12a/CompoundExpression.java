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
public abstract class CompoundExpression extends Expression {
    protected final Expression operand1;
    protected final Expression operand2;

    public CompoundExpression(Expression operand1, Expression operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}