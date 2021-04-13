package com.beardness.app08.DataFactory;

import com.beardness.app08.SimpleDataBase.Caffe;
import com.beardness.app08.SimpleDataBase.Drink;
import com.beardness.app08.SimpleDataBase.Food;

public class MainDF {
  private MainDF() {}
  
  public static int getLogo(int p) {
    switch (p) {
      case 0: return Drink.getLogo();
      case 1: return Food.getLogo();
      case 2: return Caffe.getLogo();
      
      default: return Drink.getLogo();
    }
  }
  
  public static String[] getNames(int p) {
    switch (p) {
      case 0: return Drink.getNames();
      case 1: return Food.getNames();
      case 2: return Caffe.getNames();
    
      default: return Drink.getNames();
    }
  }
  
  public static int getImage(int p, int i) {
    switch (p) {
      case 0: return Drink.getImg(i);
      case 1: return Food.getImg(i);
      case 2: return Caffe.getImg(i);
    
      default: return Drink.getImg(i);
    }
  }
  
  public static String getName(int p, int i) {
    switch (p) {
      case 0: return Drink.getName(i);
      case 1: return Food.getName(i);
      case 2: return Caffe.getName(i);
    
      default: return Drink.getName(i);
    }
  }
  
  public static String getDescription(int p, int i) {
    switch (p) {
      case 0: return Drink.getDescription(i);
      case 1: return Food.getDescription(i);
      case 2: return Caffe.getDescription(i);
    
      default: return Drink.getDescription(i);
    }
  }
  
  public static int getButtonText(int p) {
    switch (p) {
      case 0: return Drink.getButtonText();
      case 1: return Food.getButtonText();
      case 2: return Caffe.getButtonText();
    
      default: return Drink.getButtonText();
    }
  }
  
  
}
