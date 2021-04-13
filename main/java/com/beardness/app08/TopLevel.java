package com.beardness.app08;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TopLevel extends AppCompatActivity {
  
  AdapterView.OnItemClickListener itemClickListener = (parent, view, position, id) -> {
    Intent intent = new Intent(TopLevel.this, Category.class);
    intent.putExtra(Category.CATEGORY, position);
    startActivity(intent);
  };
  
  ListView lv;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_top_level);
    
    lv = findViewById(R.id.list_options);
    lv.setOnItemClickListener(itemClickListener);
  }
  
  
}