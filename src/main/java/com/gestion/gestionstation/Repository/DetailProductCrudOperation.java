package com.gestion.gestionstation.Repository;

import com.gestion.gestionstation.Connection.ConnectSql;
import com.gestion.gestionstation.Model.DetailProduct;
import org.springframework.stereotype.Repository;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DetailProductCrudOperation implements CrudOperation<DetailProduct>{
    private static Connection connection;

    public static void getConnection() throws SQLException, ClassNotFoundException {
        ConnectSql connectSql = new ConnectSql();
        connection = connectSql.Createconnection();
    }
    private DetailProduct extractDetail(ResultSet resultSet) throws SQLException {
        int idDetailProduct = resultSet.getInt("idDetailProduct");
        String productName = resultSet.getString("productName");
        Double productPrice = resultSet.getDouble("productPrice");
        int productInStock = resultSet.getInt("productInStock");
        int evaporationRate = resultSet.getInt("evaporationRate");

        return new DetailProduct(idDetailProduct,productName,productPrice,productInStock,evaporationRate);
    }
    @Override
    public List<DetailProduct> findAll() throws SQLException, ClassNotFoundException {
        List<DetailProduct> detailProducts = new ArrayList<>();
        String sql = "SELECT * FROM DetailProduct";
        getConnection();
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                DetailProduct detailProduct = extractDetail(resultSet);
                detailProducts.add(detailProduct);
            }
            for (DetailProduct detailProduct : detailProducts){
                System.out.println(detailProduct);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return detailProducts;

    }

    @Override
    public List<DetailProduct> saveAll(List<DetailProduct> toSave) {
        List<DetailProduct> asArray = new ArrayList<>();
        try {
            String req = "INSERT INTO DetailProduct(idDetailProduct,productName,productPrice,productInStock,evaporationRate) VALUES(?,?,?,?,?)";
            getConnection();
            try(PreparedStatement statement = connection.prepareStatement(req)) {
                for (DetailProduct detailProduct : toSave){
                    statement.setInt(1,detailProduct.getIdDetailProduct());
                    statement.setString(2, detailProduct.getProductName());
                    statement.setDouble(3,detailProduct.getProductPrice());
                    statement.setInt(4,detailProduct.getProductInStock());
                    statement.setInt(5,detailProduct.getEvaporationRate());

                    int rows = statement.executeUpdate();

                    if (rows>0){
                        asArray.add(detailProduct);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return asArray;
    }

    @Override
    public DetailProduct save(DetailProduct toSave) {
       try {
            String sql = "INSERT INTO DetailProduct(idDetailProduct,productName,productPrice,productInStock,evaporationRate) VALUES(?,?,?,?,?)";
            getConnection();
            try (PreparedStatement statement = connection.prepareStatement(sql)){
                      statement.setInt(1,toSave.getIdDetailProduct());
                      statement.setString(2,toSave.getProductName());
                      statement.setDouble(3,toSave.getProductPrice());
                      statement.setInt(4,toSave.getProductInStock());
                      statement.setInt(5,toSave.getEvaporationRate());

                      statement.executeUpdate();
            }
       }catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }

       return null;
    }

    @Override
    public DetailProduct update(DetailProduct toUpdate) throws SQLException {
        try {
           String req = "UPDATE DetailProduct SET productName=?,productPrice=?,productInStock=?,evaporationRate=? WHERE idDetailProduct=?;";
           getConnection();
           try(PreparedStatement statement = connection.prepareStatement(req)) {
                statement.setString(1,toUpdate.getProductName());
                statement.setDouble(2,toUpdate.getProductPrice());
                statement.setInt(3,toUpdate.getProductInStock());
                statement.setInt(4,toUpdate.getEvaporationRate());

                statement.executeUpdate();
           }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
