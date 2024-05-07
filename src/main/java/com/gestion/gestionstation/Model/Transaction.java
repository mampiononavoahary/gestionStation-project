package com.gestion.gestionstation.Model;

public class Transaction {
    private int idTransaction;
    private String typeOfTransaction;

    private int quantity;

    public Transaction(int idTransaction, String typeOfTransaction,int quantity) {
        this.idTransaction = idTransaction;
        this.typeOfTransaction = typeOfTransaction;
        this.quantity = quantity;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(String typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTransaction=" + idTransaction +
                ", typeOfTransaction='" + typeOfTransaction + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
