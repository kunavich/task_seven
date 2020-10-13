/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task7;

import by.kunavich.task7.data.DataException;
import by.kunavich.task7.data.Parser;
import by.kunavich.task7.data.dataAcquirer.DataAcquirer;
import by.kunavich.task7.data.dataAcquirer.FileDataAcquirer;
import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.logic.Calculator;
import by.kunavich.task7.view.ConcoleResultPrinter;
import by.kunavich.task7.view.ResultPrinter;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lord
 */
public class Controller {
     public static void run() {

         // get

         DataAcquirer dataAcquirer = new FileDataAcquirer();

         List<String> strings = new ArrayList<>();
         try {


             strings = dataAcquirer.getData("text.txt");
         } catch ( DataException e)         {

         }
         Parser parser =new Parser();
         List<Ellipse> ellipses = new ArrayList<>();
         for (String line:strings) {
             try {
                 Ellipse ellipse = parser.parse(line);
                 ellipses.add(ellipse);
             } catch (DataException e)      {

             }
         }
         //count
         Calculator calculator = new Calculator();
         for (Ellipse ellipse :ellipses) {
             double square = calculator.square(ellipse);
             double perimetr =calculator.perimetr(ellipse);
         }



    }
}
