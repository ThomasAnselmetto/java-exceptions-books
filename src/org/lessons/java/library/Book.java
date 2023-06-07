package org.lessons.java.library;

public class Book {
    //Fields
    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;
    //Constructor
//    le gestione delle validazioni teoricamente dovrei affidarla al costruttore tramite i metodi setter di ogni attributo
    public Book (String titolo, int numeroPagine, String autore, String editore) {

        if (titolo.isEmpty()) {
            throw new RuntimeException();
        } else {
            this.titolo = titolo;
        }
        if (numeroPagine <= 0) {
            throw new RuntimeException();

        } else {
            this.numeroPagine = numeroPagine;
        }
        if (autore.isEmpty()) {
            throw new RuntimeException();

        } else {
            this.autore = autore;
        }
        if (editore.isEmpty()) {
            throw new RuntimeException();

        } else {
            this.editore = editore;
        }
    }
    //Getters and Setters

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }


    @Override
    public String toString() {
        return "Book{" +
                "titolo='" + titolo + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                ", editore='" + editore + '\'' +
                '}';
    }
}
