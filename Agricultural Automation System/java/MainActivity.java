package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login,signUp;
    EditText username,password;
    TextView error ;
    String usern;
    String passw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        signUp=(Button) findViewById(R.id.signUp);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View login) {
                usern=username.getText().toString();
                passw=password.getText().toString();

                if(usern.equalsIgnoreCase("admin")&&passw.equalsIgnoreCase("admin")){
                    Intent mainPage = new Intent(MainActivity.this,MainPage.class);
                    startActivity(mainPage);
                }
                else{
                    Toast.makeText(MainActivity.this, "User name or password invalid", Toast.LENGTH_LONG).show();
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View signUp) {
                Intent signup = new Intent(Intent.ACTION_VIEW);
                signup.setData(Uri.parse("http://google.com"));
                startActivity(signup);
            }
        });

    }
}