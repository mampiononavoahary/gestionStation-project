package com.gestion.gestionstation.Model;

public class Product {
   private int idStation;
   private int idDetailProduct;
   private int idTransaction;

    public Product(int idStation, int idDetailProduct,int idTransaction) {
        this.idStation = idStation;
        this.idDetailProduct = idDetailProduct;
        this.idTransaction = idTransaction;
    }

    public int getIdStation() {
        return idStation;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
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
