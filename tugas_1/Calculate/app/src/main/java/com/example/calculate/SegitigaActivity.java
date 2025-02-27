package com.example.calculate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SegitigaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        EditText edtAlas = findViewById(R.id.edtAlas);
        EditText edtTinggi = findViewById(R.id.edtTinggi);
        Button btnHitung = findViewById(R.id.btnHitung);
        TextView txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(v -> {
            double alas = Double.parseDouble(edtAlas.getText().toString());
            double tinggi = Double.parseDouble(edtTinggi.getText().toString());
            double luas = 0.5 * alas * tinggi;
            txtHasil.setText("Luas: " + luas);
        });
    }
}
