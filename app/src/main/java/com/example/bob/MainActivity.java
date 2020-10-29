package com.example.bob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private TextView image1;
    private TextView image2;
    private ImageView imageload;
    String image1URL= "https://i.imgur.com/KTXh633.jpg";
    String image2URL= "https://i.imgur.com/PjteAcu.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=(TextView) findViewById(R.id.IMG1);
        image2=(TextView) findViewById(R.id.IMG2);
        imageload=(ImageView)findViewById(R.id.iV);

        image1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Picasso.get().load(image1URL).into(imageload);
            }
        });

        image2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Picasso.get().load(image2URL).into(imageload);
            }

        });
    }

}