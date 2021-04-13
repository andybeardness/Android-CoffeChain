package com.beardness.app08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.beardness.app08.DataFactory.MainDF;
import com.beardness.app08.SimpleDataBase.Drink;

public class Description extends AppCompatActivity {
  
  public static final String DRINK_ID = "drink-id";
  public static final String CATEGORY_ID = "category-id";
  
  private int drink_id, category_id;
  
  ImageView logo;
  TextView name, descr;
  Button button;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_description);
    
    drink_id = getIntent().getIntExtra(DRINK_ID, 0);
    category_id = getIntent().getIntExtra(CATEGORY_ID, 0);
    
    logo = findViewById(R.id.drink_logo);
    name = findViewById(R.id.drink_name);
    descr = findViewById(R.id.drink_descr);
    button = findViewById(R.id.action);
    
    logo.setImageResource(MainDF.getImage(category_id, drink_id));
    name.setText(MainDF.getName(category_id, drink_id));
    descr.setText(MainDF.getDescription(category_id, drink_id));
    button.setText(MainDF.getButtonText(category_id));
    
  }
  
}