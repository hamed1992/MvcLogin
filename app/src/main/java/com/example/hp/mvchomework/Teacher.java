package com.example.hp.mvchomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);


        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtusername = (EditText) findViewById(R.id.teacher_username);
                EditText txtpass = (EditText) findViewById(R.id.teacher_password);
                UserController usercontroller = new UserController();
                User teacher = new User(txtusername.getText().toString(),txtpass.getText().toString(),"teacher");
                boolean loggedin = usercontroller.Login(teacher);
                if(loggedin ){
                    Toast.makeText(Teacher.this, "Welcome", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Teacher.this, "Sorry", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
