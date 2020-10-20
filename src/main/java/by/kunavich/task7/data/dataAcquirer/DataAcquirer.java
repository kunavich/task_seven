/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task7.data.dataAcquirer;


import by.kunavich.task7.data.DataException;

import java.util.List;


/**
 *
 * @author Lord
 */
public interface DataAcquirer {
    List<String> getData(String name) throws DataException;
    
}
