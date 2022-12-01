package com.example.dependenciesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Glide library
        /*ImageView imageView = findViewById(R.id.imageView);*/

        /*imageView.setImageResource(R.drawable.mountains);*/

        /*Glide
                .with(this)
                .load(R.drawable.mountains)
                .into(imageView);*/

        /* PDFViewer Library */
        PDFView pdfView = findViewById(R.id.pdfView);

        // Cargar documento PDF de la carpeta assets
        pdfView.fromAsset("heap.pdf").load();

    }
}