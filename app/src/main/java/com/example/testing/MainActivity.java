package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edEmail,edPassword;
    Button btnLogin;
    String nama,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // memasukan variabel input ke variabel baru
        btnLogin   = findViewById(R.id.bsignin);
        edEmail    = findViewById(R.id.TextEmail);
        edPassword = findViewById(R.id.TextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama     = edEmail.getText().toString();
                password = edPassword.getText().toString();

                // untuk menampilkan toast
                if (nama.equals("priya") && password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                    ,"login Berhasil",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(nama.equals("priya") && !password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                   ,"Password Salah",Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!nama.equals("priya") && password.equals("1234")){
                    Toast t = Toast.makeText(getApplicationContext()
                    ,"Email Salah",Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext()
                    ,"Email dan Password Salah",Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }
}