/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maman12a;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author elira
 */
public class Maman12a {

    private static final int NUMNBER_OF_EXPRESSIONS = 5;
    private static final Random RAND = new Random();
    private static final ArrayList<Expression> EXPRESSIONS = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fill atomic expressions
        for(int i = 0; i < NUMNBER_OF_EXPRESSIONS; i++) {
            EXPRESSIONS.add(new AtomicExpression(getRandomDouble()));
        }
        
        // Fill AdditionExpression
        for(int i = 0; i < NUMNBER_OF_EXPRESSIONS; i++) {
            EXPRESSIONS.add(new AdditionExpression(getRandomExpression(),
                    getRandomExpression()));
        }
        
        // Fill SubtractionExpression
        for(int i = 0; i < NUMNBER_OF_EXPRESSIONS; i++) {
            EXPRESSIONS.add(new SubtractionExpression(getRandomExpression(),
                    getRandomExpression()));
        }
        
        System.out.println("List of expressions:");
        for(Expression expression : EXPRESSIONS) {
            if(expression instanceof AtomicExpression) {
                System.out.println("\t" + expression.toString());
            }
            else {
                System.out.println("\t" + expression.toString() + " = " 
                        + expression.calculate());
            }
        }
        
        System.out.println("List of equal expressions:");
        ArrayList<Integer> usedIndices = new ArrayList<>();
        for(int i = 0; i <EXPRESSIONS.size(); i++) {
            if(usedIndices.contains(i)) {
                continue;
            }
            usedIndices.add(i);
            
            String result = EXPRESSIONS.get(i).toString();
            boolean equaled = false;
            for(int j = 0; j < EXPRESSIONS.size(); j++) {
                if(usedIndices.contains(j) ||
                        !EXPRESSIONS.get(i).equals(EXPRESSIONS.get(j))) {
                    continue;
                }
                
                result += " = " + EXPRESSIONS.get(j).toString();
                equaled = true;
            }
            
            if(equaled) {
                System.out.println("\t" + result);
            }
        }
    }
    
    /**
     * 
     * @return double number from 1 to 5, with 1 digits after 
     */
    private static double getRandomDouble() {
        return RAND.nextInt(10);
    }
    
    private static Expression getRandomExpression() {
        return EXPRESSIONS.get(RAND.nextInt(EXPRESSIONS.size()));
    }
}
