/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 503
 */
public class Lista {
public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    int i = 0;
    do {
      System.out.print("Ingrese un número: ");
      int numero = scanner.nextInt();
      lista.add(numero);
      i++;
    } while (i < 7);

    System.out.println("Lista:");
    for (int j = 0; j < lista.size(); j++) {
      System.out.println(lista.get(j));
    }
  }
}

