package com.example.vinayakks.x;



/**
 * Created by Pathrer on 16-03-16.
 */
public class ListItems {
    public String title;
    public String place;
    public String price;


    public ListItems(){}

    public ListItems(String tit, String pla,String pri) {
        title = tit;
        place = pla;
        price = pri;
        //image = im;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}