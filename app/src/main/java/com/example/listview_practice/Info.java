package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Info extends AppCompatActivity {

    int img_id;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle bundle;
        bundle=this.getIntent().getExtras();
        img_id=bundle.getInt("img");
        imageView=findViewById(R.id.img);
        imageView.setImageResource(img_id);
    }
}
