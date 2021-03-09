package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    private TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada layout
        edpassword = findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nama.equals("lams@gmail.com") && password.equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!nama.equals("lams@gmail.com") && password.equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(nama.equals("lams@gmail.com") && !password.equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}
