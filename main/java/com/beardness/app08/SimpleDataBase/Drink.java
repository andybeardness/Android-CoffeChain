package com.beardness.app08.SimpleDataBase;

import com.beardness.app08.R;

public class Drink {
  
  private String name;
  private String description;
  private int img;
  
  private static int logo = R.drawable.coffe_logo;
  private static int buttonText = R.string.button_buy;
  
  private static Drink[] drinks = new Drink[] {
    new Drink("Эспрессо", "Многие путают с экспрессо, но последние - это всего лишь испанские железные дороги", R.drawable.espresso),
    new Drink("Каппучино", "В названии этого кофе возможна ошибка", R.drawable.cappuccino),
    new Drink("Доппио", "Вообще незнакомый мне кофе. Добавил его только из-за удобного размера картинки", R.drawable.doppio)
  };
  
  private Drink(String name, String description, int img) {
    this.name = name;
    this.description = description;
    this.img = img;
  }
  
  public static String getName(int i) {
    return drinks[i].name;
  }
  
  public static String getDescription(int i) {
    return drinks[i].description;
  }
  
  public static int getImg(int i) {
    return drinks[i].img;
  }
  
  public static String[] getNames() {
    String[] names = new String[drinks.length];
    
    for (int i = 0; i < names.length; i++) {
      names[i] = drinks[i].name;
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
