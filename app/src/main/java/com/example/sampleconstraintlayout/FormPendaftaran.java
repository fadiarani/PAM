package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class FormPendaftaran extends AppCompatActivity {

    EditText edNama, edAlamat, edEmail, edPassword, edrePass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pendaftaran);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edNama.getText().toString().isEmpty() ||
                    edAlamat.getText().toString().isEmpty() ||
                    edEmail.getText().toString().isEmpty() ||
                    edPassword.getText().toString().isEmpty() ||
                    edrePass.getText().toString().isEmpty())
                {
                    Snackbar.make(v, "Wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edPassword.getText().toString().equals(edrePass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...",
                                Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(v, "Password dan Repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
