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
import by.kunavich.task7.logic.EllipseCalculator;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 *
 * @author Lord
 */
public class Controller {



    static Logger LOGGER = Logger.getLogger(Controller.class);



     public List<Double> runSquare(String fileName) {

         // get
         LOGGER.info("initiate");
         DataAcquirer dataAcquirer = new FileDataAcquirer();
         LOGGER.info("Acquir data Acquirer");
         List<String> strings = new ArrayList<>();

         try {
             strings = dataAcquirer.getData(fileName);
         } catch ( DataException e)         {
             LOGGER.error(e.getMessage(),e);

         }
         LOGGER.info("get strings");
         Parser parser =new Parser();
         List<Ellipse> ellipses = new ArrayList<>();
         for (String line:strings) {
             try {
                 Ellipse ellipse = parser.parse(line);
                 ellipses.add(ellipse);
             } catch (DataException e)      {
                 LOGGER.error(e.getMessage(),e);
             }
         }
         LOGGER.info("get ellipses");
         List<Double> squares = new ArrayList<>();

         //count
         EllipseCalculator ellipseCalculator = new EllipseCalculator();
         for (Ellipse ellipse :ellipses) {
             double square = ellipseCalculator.square(ellipse);
             LOGGER.info("square : "+ square);
             squares.add(square);
         }
         LOGGER.info("end of program");
         return squares;
    }

    public List<Double> runPerimetr(String fileName) {

        // get
        LOGGER.info("initiate");
        DataAcquirer dataAcquirer = new FileDataAcquirer();
        LOGGER.info("Acquir data Acquirer");
        List<String> strings = new ArrayList<>();

        try {
            strings = dataAcquirer.getData(fileName);
        } catch ( DataException e)         {
            LOGGER.error(e.getMessage(),e);
        }
        LOGGER.info("get strings");
        Parser parser =new Parser();
        List<Ellipse> ellipses = new ArrayList<>();
        for (String line:strings) {
            try {
                Ellipse ellipse = parser.parse(line);
                ellipses.add(ellipse);
            } catch (DataException e)      {
                LOGGER.error(e.getMessage(),e);
            }
        }
        LOGGER.info("get ellipses");
        List<Double> perimetrs = new ArrayList<>();
        EllipseCalculator ellipseCalculator = new EllipseCalculator();

        //count
        for (Ellipse ellipse :ellipses) {

            double perimetr = ellipseCalculator.perimetr(ellipse);
            LOGGER.info("perimetr : "+ perimetr);
            perimetrs.add(perimetr);
        }
        LOGGER.info("end of program");
        return perimetrs;
    }

    public  List<Boolean> runCrossAxis(String fileName) {

        // get
        LOGGER.info("initiate");
        DataAcquirer dataAcquirer = new FileDataAcquirer();
        LOGGER.info("Acquir data Acquirer");
        List<String> strings = new ArrayList<>();

        try {
            strings = dataAcquirer.getData(fileName);
        } catch ( DataException e)         {
            LOGGER.error(e.getMessage(),e);

        }
        LOGGER.info("get strings");
        Parser parser =new Parser();
        List<Ellipse> ellipses = new ArrayList<>();
        for (String line:strings) {
            try {
                Ellipse ellipse = parser.parse(line);
                ellipses.add(ellipse);
            } catch (DataException e)      {
                LOGGER.error(e.getMessage(),e);
            }
        }
        LOGGER.info("get ellipses");
        List<Boolean> booleans = new ArrayList<>();
        EllipseCalculator ellipseCalculator = new EllipseCalculator();

        //count
        for (Ellipse ellipse :ellipses) {
            boolean b = ellipseCalculator.isEllipseCrossAxis(ellipse,5.0);
            LOGGER.info("is Ellipse Cross one Axis : "+ b);
            booleans.add(b);
        }
        LOGGER.info("end of program");
        return booleans;
    }
}
