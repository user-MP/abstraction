package org.example;

import java.time.LocalDate;

public class Book extends Edition  {

    private String author;




    public Book() {

    }

    public Book(String name, int countPages, LocalDate datePublished, String author) {
        super(name, countPages, datePublished);
        this.author = author;
    }




    public boolean validateDate(LocalDate date) {

        if(date.getYear()<1300) {
            return false;

        }

        return true;
    }

    public boolean validateMainName(String value) {

        String nameAuthor=value.trim();

        if(nameAuthor.length()<10){
            return false;

        }

        return true;
    }

    public void setAuthor(String author) {
        if(this.validateMainName(author)){
            this.author = author;
        }

    }

    public String getAuthor() {
        return author;
    }
    public void setDatePublished(LocalDate datePublished) {
        if(this.validateDate(datePublished)){
            super.setDatePublished(datePublished);
        }

    }
    @Override
    public String toString() {
        return "Author : "+author+"\n"+
                super.toString();


    }

}
