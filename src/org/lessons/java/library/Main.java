package org.lessons.java.library;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        creo l'array'
    Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti libri vuoi aggiungere alla tua libreria personale? da 1 a 5...");
        int nBooks = Integer.parseInt(scanner.nextLine());
        Book[] personalLibrary = new Book[nBooks];

//        creo un ciclo che continuera' fino alla fine dell'array stabilito dall'utente'

        for (int i = 0; i < personalLibrary.length; i++) {
            System.out.println("titolo del libro numero " + (i + 1) + ": ");
            String titolo = scanner.nextLine();
            System.out.println("numero di pagine: ");
            int numeroPagine = Integer.parseInt(scanner.nextLine());
            System.out.println("autore: ");
            String autore = scanner.nextLine();
            System.out.println("editore: ");
            String editore = scanner.nextLine();
               try {
//                   provo ad ottenere questo risultato salvo la cattura di errori
                   Book book = new Book(titolo, numeroPagine,autore, editore);
                   personalLibrary[i] = book;
               }
            catch(RuntimeException e) {
                System.out.println("i parametri inseriti per i tuoi libri non sono corretti,riprova");i--;
            }

            }
        System.out.println(Arrays.toString(personalLibrary));
        scanner.close();

    }

}
