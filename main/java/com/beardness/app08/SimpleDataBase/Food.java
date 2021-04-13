package com.beardness.app08.SimpleDataBase;

import com.beardness.app08.R;

public class Food {
  
  private String name;
  private String description;
  private int img;
  
  private static int logo = R.drawable.food_logo;
  private static int buttonText = R.string.button_buy;
  
  private static Food[] foods = new Food[] {
          new Food("Яичница", "Разбитые надежды мамы-курицы на достойное продолжение рода", R.drawable.egg),
          new Food("Яблоки", "Если надкусить, то цена взлетит", R.drawable.apple),
          new Food("Бананы", "Их много, с ними Бананбог", R.drawable.banana)
  };
  
  private Food(String name, String description, int img) {
    this.name = name;
    this.description = description;
    this.img = img;
  }
  
  public static String getName(int i) {
    return foods[i].name;
  }
  
  public static String getDescription(int i) {
    return foods[i].description;
  }
  
  public static int getImg(int i) {
    return foods[i].img;
  }
  
  public static String[] getNames() {
    String[] names = new String[foods.length];
    
    for (int i = 0; i < names.length; i++) {
      names[i] = foods[i].name;
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
