package com.example.calculate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity; // Pastikan ini di-import!

public class LingkaranActivity extends AppCompatActivity { // Gunakan AppCompatActivity

    private EditText edtJariJari;
    private Button btnHitung;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        // Inisialisasi View
        edtJariJari = findViewById(R.id.edtJariJari);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLingkaran();
            }
        });
    }

    private void hitungLingkaran() {
        String jariJariStr = edtJariJari.getText().toString();

        if (jariJariStr.isEmpty()) {
            txtHasil.setText("Masukkan jari-jari terlebih dahulu!");
            return;
        }

        double jariJari = Double.parseDouble(jariJariStr);
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        txtHasil.setText("Luas: " + luas + "\nKeliling: " + keliling);
    }
}
