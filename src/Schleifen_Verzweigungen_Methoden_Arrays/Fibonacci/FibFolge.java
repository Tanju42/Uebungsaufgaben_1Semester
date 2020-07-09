/**
 * Aufgabenstellung: 
 * Das Programm soll eine Folge von Fibonacci-Zahlen in einem Array speichern
 * Die ersten beiden Werte sind 0 und 1. 
 * Jeder weitere Wert ergibt sich aus Addition der beiden vorherigen Werte.
 * Das Programm soll den Anwender auffordern, die Anzahl von 
 * Fibonacci-Werten einzugeben.
 * 
 * Beispielausführung:
 * Bitte geben Sie die Anzahl Fibonacci-Werte ein: 9
 * Ausgabe: "Die ersten 9 Werte lauten: 0, 1, 1, 2, 3, 5, 8, 13, 21"
 */
package Schleifen_Verzweigungen_Methoden_Arrays.Fibonacci;

import java.util.Scanner;


public class FibFolge {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tScan=new Scanner(System.in);
        int[] fibs;
        int number_fibs;
        
        //Anwender auffordern, die Anzahl Fibonacci-Werte einzugeben
        // und den eingegeben Wert in der Variablen "number_fibs" speichern
        System.out.print("Bitte geben Sie die Anzahl Fibonacci-Werte ein: ");
        number_fibs = tScan.nextInt();
        System.out.println(" ");
        
        
        // Array mit genau so vielen Elementen dimensionieren wie erforderlich
        //...
        fibs = new int[number_fibs];
        
        // Methode "calculate_fibs" und korrekten Parameter übergeben       
        calculate_fibs(fibs);
        
        // Methode "print_fibs" wird aufgerufen
        print_fibs(fibs);
    }
    
    // Methode calculate_fibs vervollständigen:
    // Fibnacci-Werte berechnen und im Array speichern
    public static void calculate_fibs(int[] fibvalues){
        if (fibvalues.length == 1) { // falls 1 eingegeben wird
            fibvalues[0] = 0;
            return;
        } else if (fibvalues.length == 2) { // falls 2 eingegeben wird
            fibvalues[0] = 0;
            fibvalues[1] = 1;
            return;
        } // Ab hier 3 oder Höher...
        fibvalues[0] = 0; // Das erste ist immer 0
        fibvalues[1] = 1; // Das zweite ist immer 1
        for (int i = 2; i < fibvalues.length; i++) { // Fange von 2 an weil am Ende sonnst ein Fehler ensteht
            fibvalues[i] = fibvalues[i-2] + fibvalues[i-1]; //Hier wird beim ersten durchlauf das gemacht: 0 + 1 = 1 == Also sieht die array dann so aus: 0, 1, 1
        }

    }
            
    // Methode "print_fibs" gibt das Array aus (bereits vollständig)
    public static void print_fibs(int[] fibvals){
        System.out.println();
        for (int i=0;i<fibvals.length;i++){
            System.out.print(fibvals[i] + ", ");
        }
           
        System.out.println();
    }
}
