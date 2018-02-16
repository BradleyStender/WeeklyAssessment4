package com.company.Question_2;

public class HouseModel {

    int squareFootage=1054;
    Boolean hasDeck;






    public HouseModel(int squareFootage, Boolean hasDeck) {
        this.squareFootage = squareFootage;
        this.hasDeck = hasDeck;
    }

    public HouseModel() {

    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public Boolean getHasDeck() {
        return hasDeck;
    }

    public void setHasDeck(Boolean hasDeck) {
        this.hasDeck = hasDeck;
    }

    public void getHouseInfo(){

        System.out.println("The house has " + squareFootage +" square feet and has a deck!");


    }


}
