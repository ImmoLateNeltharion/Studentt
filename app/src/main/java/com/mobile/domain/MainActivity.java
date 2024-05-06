package com.mobile.domain;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mobile.domain.student.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(207363);
        student.setName("Evgeniy");

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getName());
    }
}
