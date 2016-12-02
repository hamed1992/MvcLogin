package com.example.hp.mvchomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button teacher = (Button) findViewById(R.id.teacher_btn);
        Button student = (Button) findViewById(R.id.student_btn);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teacher = new Intent(MainActivity.this,Teacher.class);
                startActivity(teacher);
            }
        });
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent student = new Intent(MainActivity.this,student.class);
                startActivity(student);
            }
        });

    }
}
