package org.example;
import java.time.*;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Nightingale",511,LocalDate.of(2015,04,22), "Kristin Hannah");
        Book book2 = new Book("The Da Vinci Code",432,LocalDate.of(2003,05,12), "Dan Brown");


        Magazine magazine1=new Magazine("Forbes",320,LocalDate.of(2022,5,20),6971,"The Forbes", Magazine.Periodicity.ONCE_MONTH);
        Magazine magazine2=new Magazine("The Economist",320,LocalDate.of(2022,2,2),338,"The Economist Group", Magazine.Periodicity.ONCE_WEEK);

        book1.setAuthor("Noname"); // not set value short than 10 characters
        book2.setAuthor("Dan Gerhard Brown");
        System.out.println( book1.toString());
        System.out.println( book2.toString());


        System.out.println( magazine1.toString());
        System.out.println( magazine2.toString());


        System.out.println("Before set new group name");
        magazine2.setEditorGroup("the economist"); // not set value first letter isn't upper case
        magazine2.setDatePublished(LocalDate.of(1990,05,20)); ; // not set value year less 2005
        System.out.println( magazine2.toString());

    }
}