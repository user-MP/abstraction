package org.example;

import java.time.LocalDate;


public abstract class Edition implements Validate {

    protected String name;

    protected int countPages;

    protected LocalDate datePublished;

    public Edition(){}

    public Edition(String name, int countPages, LocalDate datePublished) {
        this.name = name;
        this.countPages = countPages;
        this.datePublished = datePublished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }


    @Override
    public String toString() {
        return  "Name : "+name+
                "\nCount Pages : "+countPages+
                "\nDate published : "+datePublished.toString()+"\n";
    }
}
