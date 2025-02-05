package com.example.roomhunt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class image extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        addListenerOnButton6();
        addListenerOnButton7();
    }
    private void addListenerOnButton6() {
        final Context context = this;
        Button sr = findViewById(R.id.button10);
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SharedRoom.class);
                startActivity(intent);
            }
        });
    }

    private void addListenerOnButton7() {
        final Context context = this;
        Button pr = findViewById(R.id.button11);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PrivateRoom.class);
                startActivity(intent);
            }
        });
    }
}
