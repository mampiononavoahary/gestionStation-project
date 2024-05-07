package com.gestion.gestionstation.Service;

import com.gestion.gestionstation.Model.DetailProduct;
import com.gestion.gestionstation.Repository.DetailProductCrudOperation;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class DetailProductService {
    DetailProductCrudOperation detailProductCrudOperation = new DetailProductCrudOperation();

    public List<DetailProduct> findAll() throws SQLException, ClassNotFoundException {
        return detailProductCrudOperation.findAll();
    }
}
