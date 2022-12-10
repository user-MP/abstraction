package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Magazine extends Edition {

    public enum Periodicity{
        ONCE_WEEK, TWICE_WEEK, ONCE_MONTH, ONCE_YEAR
    }
    private int numberMagazine;


    private String editorGroup;

    private Periodicity periodicity;




    public Magazine(){

    }

    public Magazine(String name, int countPages, LocalDate datePublished, int numberMagazine, String editorGroup, Periodicity periodicity) {
        super(name, countPages, datePublished);
        this.numberMagazine = numberMagazine;
        this.editorGroup = editorGroup;
        this.periodicity = periodicity;
    }


    @Override
    public boolean validateDate(LocalDate datePublished) {
        if(datePublished.getYear()<2005) {
            return false;

        }

        return true;
    }





@Override
    public boolean validateMainName(String value) {


       if(value.trim().length()<4){
           return false;

       }

       char firstLetter=value.charAt(0);

        if(!Character.isUpperCase(firstLetter)){

            return false;

        }

        return true;


    }

    public int getNumberMagazine() {
        return numberMagazine;
    }

    public void setNumberMagazine(int numberMagazine) {
        this.numberMagazine = numberMagazine;
    }

    public String getEditorGroup() {
        return editorGroup;
    }

    public void setEditorGroup(String editorGroup) {
        if(this.validateMainName(editorGroup)){
            this.editorGroup = editorGroup;
        }

    }

    public Periodicity getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Periodicity periodicity) {
        this.periodicity = periodicity;
    }

    public void setDatePublished(LocalDate datePublished){

        if(validateDate(datePublished)){
            super.setDatePublished(datePublished);
        }

    }

    @Override
    public String toString() {
        return   "Number magazine=" + numberMagazine +
                "\nEditor Group='" + editorGroup +
                "\nPeriodicity=" + periodicity +"\n"+
               super.toString();


    }
}
