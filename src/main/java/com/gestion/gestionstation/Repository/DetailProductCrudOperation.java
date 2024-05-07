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
        return null;
    }

    @Override
    public DetailProduct save(DetailProduct toSave) {
        return null;
    }

    @Override
    public DetailProduct update(DetailProduct toUpdate) {
        return null;
    }
}
