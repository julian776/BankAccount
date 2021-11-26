package main;

import java.util.Collections;
import java.util.LinkedList;

public class FilterStatements {
    /*
    Los numeros en la funcion show para determinar que filtrar
    0 dates
    1 credit
    2 debit
     */

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
        historial.forEach(x -> printFilteredLine((LinkedList) x, filter));
    }

    public void printFilteredLine(LinkedList x, int filter) {
        if(filter == 0){
            System.out.println(x.get(filter));
        }
        if (filter == 2 || filter == 1) {
            try{
                int num = (int) x.get(filter);
                System.out.println("   "+num);
            }catch (Exception e){
            }
        }
    }
}
