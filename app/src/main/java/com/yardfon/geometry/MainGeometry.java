package com.yardfon.geometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainGeometry extends AppCompatActivity {
    private Button circle;
    private Button triangle;
    private Button square;
    private Button trapeoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_geometry);
        trapeoid = (Button) findViewById(R.id.trapeoid);
        trapeoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openTrapeoid();
            }
        });
        square = (Button) findViewById(R.id.square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSquare();
            }
        });

        triangle = (Button) findViewById(R.id.triangle);
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTriangle();
            }
        });

        circle = (Button) findViewById(R.id.circle);
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCircle();
            }
        });

    }
    public void openTrapeoid(){
        Intent intent = new Intent(this,Trapeoid.class);
        startActivity(intent);
    }
    public void openCircle(){
        Intent intent = new Intent(this,Circle.class);
        startActivity(intent);
    }
    public void openTriangle(){
        Intent intent = new Intent(this,Triangle.class);
        startActivity(intent);
    }
    public void openSquare(){
        Intent intent = new Intent(this,Square.class);
        startActivity(intent);
    }


}
