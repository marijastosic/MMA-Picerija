/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Marija
 */
public interface GenericDAO<T> {
   List<T> readAll (Class<T> p);
   void saveOrUpdate(T obj);
   void delete(T obj);
}
