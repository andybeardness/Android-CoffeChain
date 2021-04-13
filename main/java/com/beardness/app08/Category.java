package com.beardness.app08;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.beardness.app08.DataFactory.MainDF;

public class Category extends AppCompatActivity {
  
  public final static String CATEGORY = "category-id";
  
  ImageView iv;
  ListView lv;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_category);
    
    int p = getIntent().getIntExtra(CATEGORY, 0);
    
    iv = findViewById(R.id.logo);
    iv.setImageResource(MainDF.getLogo(p));
    
    lv = findViewById(R.id.list_drinks);
    lv.setAdapter(
      new ArrayAdapter<>(
              this,
              android.R.layout.simple_list_item_1,
              MainDF.getNames(p)
      )
    );
    
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(Category.this, Description.class);
        intent.putExtra(Description.CATEGORY_ID, p);
        intent.putExtra(Description.DRINK_ID, position);
        
        startActivity(intent);
      }
    });
    
    
    
  }
}