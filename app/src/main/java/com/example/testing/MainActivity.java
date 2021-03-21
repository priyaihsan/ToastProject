package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

                String email = "priya@gmail.com";
                String pass = "1234";

                // untuk menampilkan toast
                if (nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext()
                    ,"Email dan Password wajib diisi",Toast.LENGTH_LONG);
                    t.show();

                }
                else{

                    if (nama.equals(email) || password.equals(pass)){
                        Toast t = Toast.makeText(getApplicationContext()
                                ,"login Berhasil",Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a",nama.trim());

                        b.putString("b",password.trim());

                        Intent i =  new Intent(getApplicationContext(),ActivityTwo.class);

                        i.putExtras(b);

                        startActivity(i);

                    }
                    else{
                        Toast t = Toast.makeText(getApplicationContext()
                                ,"login Gagal",Toast.LENGTH_LONG);

                        t.show();
                    }
                }

            }
        });
    }
}