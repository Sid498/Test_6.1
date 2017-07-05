package com.example.sid.test_61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Usernmame;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button = (Button) findViewById(R.id.btnLogin);

         Usernmame = (EditText) findViewById(R.id.etUserName);
         Password = (EditText) findViewById(R.id.etPassword);
    }

    public void Login(View view){

        if(Password.getText().toString().equals("admin")){
            Toast.makeText(MainActivity.this,"Valid User",Toast.LENGTH_SHORT).show();

            Toast.makeText(MainActivity.this,"Welcome "+Usernmame.getText().toString(),Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"INVALID USER",Toast.LENGTH_SHORT).show();
        }
    }
}
