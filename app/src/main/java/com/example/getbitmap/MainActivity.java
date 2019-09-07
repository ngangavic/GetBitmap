package com.example.getbitmap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView,imageViewBitmap;
    Button buttonConvert;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageViewBitmap=findViewById(R.id.imageViewBitmap);
        buttonConvert=findViewById(R.id.buttonConvert);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewBitmap.setImageBitmap(getBitmap(imageView));
            }
        });
    }

    private Bitmap getBitmap(ImageView view){
        bitmap = ((BitmapDrawable)view.getDrawable()).getBitmap();
        return bitmap;

    }
}
