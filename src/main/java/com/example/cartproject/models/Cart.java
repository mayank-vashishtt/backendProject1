package com.example.cartproject.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cart {
    private long Id;
    private  long UserId;
    private  String Date;
    private  CartProduct[] CartProducts;

    public Cart(long Id, long UserId, String Date, CartProduct[] CartProducts) {
        this.Id = Id;
        this.UserId = UserId;
        this.Date = Date;
        this.CartProducts = CartProducts;
    }

    public  Cart(){
        Id=0;
        UserId=0;
        Date="";
        CartProducts = new CartProduct[0];
    }

    public long getId() {
        return Id;
    }

    public void setCartId(long Id) {
        this.Id = Id;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        this.UserId = UserId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public CartProduct[] getCartProducts() {
        return CartProducts;
    }

    public void setCartProducts(CartProduct[] CartProducts) {
        this.CartProducts = CartProducts;
    }
}