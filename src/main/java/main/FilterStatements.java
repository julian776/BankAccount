package main;

import java.util.Collections;
import java.util.LinkedList;

public class FilterStatements {
    public void show(int filter, Account account) {
        Statement statement = account.statement;
        LinkedList historial = statement.historial;

        switch (filter) {
            case 0:
                System.out.println("  Date  ");
                break;
            case 1:
                System.out.println("  Credit  ");
                break;
            case 2:
                System.out.println("  Debit  ");
                break;
        }
        //Collections.reverse(historial);
        historial.forEach(x -> printFilteredLine((LinkedList) x, filter));
    }

    public void printFilteredLine(LinkedList x, int filter) {
        if(filter == 0){
            System.out.println(x.get(filter));
        }
        if (filter == 2) {
            filter = 1;
            int num = (int) x.get(filter);
            if (num < 0) {System.out.println((num)*-1);}
        }
        else if(filter == 1){
            int num = (int) x.get(filter);
            if( num>= 0){System.out.println(num);}
        }

    }
}
