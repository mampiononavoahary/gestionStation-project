package com.gestion.gestionstation.Repository;

import java.sql.SQLException;
import java.util.List;

public interface CrudOperation<T>{
    List <T> findAll() throws SQLException, ClassNotFoundException;
    List<T> saveAll(List<T> toSave);
    T save(T toSave);
    T update(T toUpdate);
}
