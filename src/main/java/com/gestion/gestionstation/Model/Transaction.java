package com.gestion.gestionstation.Model;

public class Transaction {
    private int idTransaction;
    private int idStation;
    private String typeOfTransaction;

    public Transaction(int idTransaction, int idStation, String typeOfTransaction) {
        this.idTransaction = idTransaction;
        this.idStation = idStation;
        this.typeOfTransaction = typeOfTransaction;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
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
                ", idStation=" + idStation +
                ", typeOfTransaction='" + typeOfTransaction + '\'' +
                '}';
    }
}
