package main;

import java.util.Collections;
import java.util.LinkedList;

public class Statement {

    LinkedList historial = new LinkedList();

    public void addNewStatement(int amount, String date, int balance){
        LinkedList lineStatement = new LinkedList();
        lineStatement.add(date);
        if(amount >= 0){
            lineStatement.add(amount);
            lineStatement.add("    ");
        }
        else if(amount<0){
            lineStatement.add("    ");
            lineStatement.add((amount)*-1);
        }
        lineStatement.add(balance);
        historial.add(lineStatement);
    }

    public String toString(){
        Collections.reverse(historial);
        historial.forEach(x -> printLine((LinkedList) x ));
        return "";
    }

    void printLine(LinkedList x){
        x.forEach(e -> {System.out.print(e+"  ||  ");});
        System.out.println();
    }
}
