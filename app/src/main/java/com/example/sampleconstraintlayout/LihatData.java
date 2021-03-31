package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama) {
            case "Rani":
                tvnama.setText("");
                tvnomor.setText("081233467789");
                break;
            case "Fadia":
                tvnama.setText("Dya");
                tvnomor.setText("082255667777");
                break;
            case "Tasya":
                tvnama.setText("Emak");
                tvnomor.setText("082159907660");
                break;
            case "Rayka":
                tvnama.setText("Mak");
                tvnomor.setText("081120000000");
                break;
            case "Arya":
                tvnama.setText("Yaya");
                tvnomor.setText("082260009990");
                break;
            case "Vadillah":
                tvnama.setText("Dillah");
                tvnomor.setText("081120976544");
                break;
            case "Aya":
                tvnama.setText("Yayaa");
                tvnomor.setText("08215544332");
                break;
            case "Adel":
                tvnama.setText("Adelina");
                tvnomor.setText("08220999999");
                break;
            case "Lina":
                tvnama.setText("Inaa");
                tvnomor.setText("08214003000");
                break;
            case "Lisa":
                tvnama.setText("Lalisa");
                tvnomor.setText("08531000000");
                break;
        }
    }
}
