/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Pica;
import java.util.List;

/**
 *
 * @author Marija
 */
public interface PicaDAO extends GenericDAO<Pica>{
    List<Pica> getByVrstaPice (String vrstaPice);
    void deletePicaByID(int id);
    List<Pica> readAllAktivPica ();
}
