package com.beardness.app08.SimpleDataBase;

import com.beardness.app08.R;

public class Caffe {
  
  private String name;
  private String description;
  private int img;
  
  private static int logo = R.drawable.caffe_logo;
  private static int buttonText = R.string.button_visit;
  
  private static Caffe[] caffes = new Caffe[] {
          new Caffe("Кафе на Бибирево", "Первое правило кафе на Бибирево - никому не рассказывать про кафе на Бибирево", R.drawable.caffe_one),
          new Caffe("Кафе на Чальника", "Только для на Чальников. Если вы не на Чальник, то идите в другое кафе", R.drawable.caffe_two),
          new Caffe("Кафе на Гибаторов", "Бесперерывная фан-встреча любителей Дота 2", R.drawable.caffe_three)
  };
  
  private Caffe(String name, String description, int img) {
    this.name = name;
    this.description = description;
    this.img = img;
  }
  
  public static String getName(int i) {
    return caffes[i].name;
  }
  
  public static String getDescription(int i) {
    return caffes[i].description;
  }
  
  public static int getImg(int i) {
    return caffes[i].img;
  }
  
  public static String[] getNames() {
    String[] names = new String[caffes.length];
    
    for (int i = 0; i < names.length; i++) {
      names[i] = caffes[i].name;
    }
    
    return names;
  }
  
  public static int getLogo() {
    return logo;
  }
  
  public static int getButtonText() {
    return buttonText;
  }
}
