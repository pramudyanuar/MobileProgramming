package com.example.calculate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPersegi = findViewById(R.id.btnPersegi);
        Button btnPersegiPanjang = findViewById(R.id.btnPersegiPanjang);
        Button btnSegitiga = findViewById(R.id.btnSegitiga);
        Button btnLingkaran = findViewById(R.id.btnLingkaran);

        btnPersegi.setOnClickListener(v -> startActivity(new Intent(this, PersegiActivity.class)));
        btnPersegiPanjang.setOnClickListener(v -> startActivity(new Intent(this, PersegiPanjangActivity.class)));
        btnSegitiga.setOnClickListener(v -> startActivity(new Intent(this, SegitigaActivity.class)));
        btnLingkaran.setOnClickListener(v -> startActivity(new Intent(this, LingkaranActivity.class)));
    }
}
