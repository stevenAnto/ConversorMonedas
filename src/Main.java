import modelos.Cambiar;
import modelos.Data;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Ingrese las monedas");
        String baseCurrency = sc.next();
        String quoteCurrency = sc.next();
        System.out.println("Ingrese la cantidad");
        double amount = sc.nextDouble();
        Cambiar cambioA =new Cambiar();
        Data data = cambioA.cambio(baseCurrency,quoteCurrency,amount);
        System.out.println(data);
    }
}