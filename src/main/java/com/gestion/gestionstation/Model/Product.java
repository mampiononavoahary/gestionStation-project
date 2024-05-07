package com.gestion.gestionstation.Model;

public class Product {
   private int idStation;
   private int idDetailProduct;

    public Product(int idStation, int idDetailProduct) {
        this.idStation = idStation;
        this.idDetailProduct = idDetailProduct;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public int getIdDetailProduct() {
        return idDetailProduct;
    }

    public void setIdDetailProduct(int idDetailProduct) {
        this.idDetailProduct = idDetailProduct;
    }
}
