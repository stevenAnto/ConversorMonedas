import modelos.Cambiar;
import modelos.Data;
import modelos.ParMonedas;

import java.util.AbstractMap;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int idQuery;
        do{
            System.out.println("Bienvenido/a al conversor de monedas");
            System.out.println("Ingrese la opcion");
            System.out.println("""
                    1 Nuevo Sol (PEN) a Euro (EUR):
                    2 Nuevo Sol (PEN) a Dólar estadounidense (USD):
                    3 Nuevo Sol (PEN) a Yen japonés (JPY):
                    4 Euro (EUR) a Dólar estadounidense (USD): 
                    5 Euro (EUR) a Yen japonés (JPY):
                    6 Dólar estadounidense (USD) a Yen japonés (JPY):
                    7 Salir""");
            idQuery = sc.nextInt();
            if(idQuery==7)break;
            ParMonedas parMonedas = obtenerParMoendas(idQuery);
            System.out.println("Ingrese la cantidad "+parMonedas.baseCurrency()+" que deseas convertir");
            double amount = sc.nextDouble();
            Cambiar cambioA = new Cambiar();
            Data data = cambioA.cambio(parMonedas.baseCurrency(), parMonedas.toCurrency(), amount);
            //System.out.println(data);
            System.out.println();
            System.out.println("El valor "+amount+" "+parMonedas.baseCurrency()+" corresponde a "+data.conversion_result()+"" +
                    " "+parMonedas.toCurrency());
            System.out.println("***************************************************************");
        }while(true);
        System.out.println("Gracias!!!");
    }

    private static ParMonedas obtenerParMoendas(int opcion) {
            switch (opcion){
                case 1:
                    return new ParMonedas("PEN","EUR");
                case 2:
                    return new ParMonedas("PEN","USD");
                case 3:
                    return new ParMonedas("PEN","JPY");
                case 4:
                    return new ParMonedas("EUR","USD");
                case 5:
                    return new ParMonedas("EUR","JPY");
                case 6:
                    return new ParMonedas("USD","JPY");
                default:
                    return  null;
            }
    }
}