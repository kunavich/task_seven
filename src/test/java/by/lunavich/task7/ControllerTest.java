package by.lunavich.task7;

import by.kunavich.task7.Controller;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ControllerTest {

    @Test
    public void сontrollerSquareTest()    {
        //given
        //DOMConfigurator is used to configure logger from xml configuration file
        DOMConfigurator.configure("log4j.xml");
        Controller controller = new Controller();
        List<Double> actual= new ArrayList<>();
        actual.add(8.19955682586936);
        actual.add(1.696460032938487);
        actual.add(3.974114706791087);
        actual.add(3.110176727053895);

        //whenn
        List<Double> doubles =controller.runSquare("text.txt");
        //then
        Assert.assertEquals(doubles,actual);
   }

    @Test
    public void сontrollerPerimetrTest()    {
        //given
        //DOMConfigurator is used to configure logger from xml configuration file
        DOMConfigurator.configure("log4j.xml");
        Controller controller = new Controller();
        List<Double> actual= new ArrayList<>();
        actual.add(10.26921238584731);
        actual.add(5.694001269544864);
        actual.add(7.070328584409468);
        actual.add(9.976720923479125);

        //whenn
        List<Double> doubles =controller.runPerimetr("text.txt");
        //then
        Assert.assertEquals(doubles,actual);
    }

    @Test
    public void сontrollerCrossAxisTest()    {
        //given
        //DOMConfigurator is used to configure logger from xml configuration file
        DOMConfigurator.configure("log4j.xml");
        Controller controller = new Controller();
        List<Boolean> actual= new ArrayList<>();
        actual.add(false);
        actual.add(false);
        actual.add(false);
        actual.add(false);

        //whenn
        List<Boolean> doubles =controller.runCrossAxis("text.txt");
        //then
        Assert.assertEquals(doubles,actual);
    }

}