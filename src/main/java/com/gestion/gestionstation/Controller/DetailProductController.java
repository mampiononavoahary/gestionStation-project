package com.gestion.gestionstation.Controller;

import com.gestion.gestionstation.Model.DetailProduct;
import com.gestion.gestionstation.Service.DetailProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class DetailProductController {

private DetailProductService detailProductService;

    public DetailProductController(DetailProductService detailProductService) {
        this.detailProductService = detailProductService;
    }
    @GetMapping("/product")
    public List<DetailProduct> findAll() throws SQLException, ClassNotFoundException {
        return detailProductService.findAll();
    }
}
