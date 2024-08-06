package com.oopconcepts;

//Main class:
public class Main {
  public static void main(String[] args) {
     StockKeeper johnDoe = new StockKeeper("John Doe");
     /*
     Stock keeper creates album and assigns negative values for price and number of copies available
      */
     johnDoe.manageAlbum(new Album(), "Slippery When Wet", "Bon Jovi", -1000.00, -50);
  }
}