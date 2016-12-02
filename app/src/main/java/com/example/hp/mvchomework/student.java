package com.example.hp.mvchomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class student extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);


        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtusername = (EditText) findViewById(R.id.student_username);
                EditText txtpass = (EditText) findViewById(R.id.student_password);
                UserController usercontroller = new UserController();
                User student = new User(txtusername.getText().toString(),txtpass.getText().toString(),"student");
                boolean loggedin = usercontroller.Login(student);
                if(loggedin ){
                    Toast.makeText(student.this, "Welcome", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(student.this, "Sorry", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
