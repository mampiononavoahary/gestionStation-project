package com.gestion.gestionstation.Model;

public class DetailProduct {
    private int idDetailProduct;
    private String productName;
    private Double productPrice;
    private  int productInStock;
    private int evaporationRate;

    public DetailProduct(int idDetailProduct, String productName, Double productPrice, int productInStock, int evaporationRate) {
        this.idDetailProduct = idDetailProduct;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productInStock = productInStock;
        this.evaporationRate = evaporationRate;
    }

    public int getIdDetailProduct() {
        return idDetailProduct;
    }

    public void setIdDetailProduct(int idDetailProduct) {
        this.idDetailProduct = idDetailProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductInStock() {
        return productInStock;
    }

    public void setProductInStock(int productInStock) {
        this.productInStock = productInStock;
    }

    public int getEvaporationRate() {
        return evaporationRate;
    }

    public void setEvaporationRate(int evaporationRate) {
        this.evaporationRate = evaporationRate;
    }

    @Override
    public String toString() {
        return "DetailProduct{" +
                "idDetailProduct=" + idDetailProduct +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productInStock=" + productInStock +
                ", evaporationRate=" + evaporationRate +
                '}';
    }
}
