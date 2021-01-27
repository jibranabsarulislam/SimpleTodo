package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> items;

    Button btnAdd;
    EditText editem;
    RecyclerView recyview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        editem = findViewById(R.id.editem);
        recyview = findViewById(R.id.recyview);


        items = new ArrayList<>();
        items.add("test");
        items.add("quiz");
        items.add("pop quiz");
        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        recyview.setAdapter(itemsAdapter);
        recyview.setLayoutManager(new LinearLayoutManager(this));
    }
}