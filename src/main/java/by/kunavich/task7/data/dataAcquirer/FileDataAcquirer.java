/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task7.data.dataAcquirer;

import by.kunavich.task7.data.DataException;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lord
 */
public class FileDataAcquirer implements DataAcquirer{

    private static final String FILE_NAME = "text.txt";

    @Override
    public List<String> getData(String fileName) throws DataException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            List<String> data = new ArrayList<>();
            int i=0;
            String line;
            while ((line = reader.readLine()) != null) {

                data.add(line);
                i++;
            }
            return data;
        }
        catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }


    }
}
