package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList=(RecyclerView)findViewById(R.id.programmingList);

        //this can be done in single line;
        RecyclerView.LayoutManager layoutManager;
        layoutManager=new LinearLayoutManager(this);
        programmingList.setLayoutManager(layoutManager);
        //programmingList.setLayoutManager(new LinearLayoutManager(this));

        String[] language={"Java","JavaScript","Python","Ruby","Scala","C","C++","Golang","Kotlin","Dart","PHP","Java","JavaScript","Python","Ruby","Scala","C","C++","Golang","Kotlin","Dart","PHP"};
        programmingList.setAdapter(new ProgrammingAdapter(language));
    }
}
