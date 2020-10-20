/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task7.logic;


import by.kunavich.task7.entity.Ellipse;

/**
 *
 * @author Lord
 */
public interface Calculator {


   public double square (Ellipse ellipse);
   public double perimetr (Ellipse ellipse);
   public boolean isEllipseCrossAxis (Ellipse ellipse,double length);

   public boolean isEllipse (Ellipse ellipse);
   public boolean isСircle (Ellipse ellipse);
}
