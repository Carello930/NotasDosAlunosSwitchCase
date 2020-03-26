package com.leaoartes.notasdosalunosswitchcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gradeAnual(View view){

        TextView gradeStudent = (EditText) findViewById(R.id.editTextNota);
        String gradeText = gradeStudent.getText().toString();
        int grade = Integer.parseInt(gradeText);

        switch(grade){

            case 10:
            case 9:
                TextView grdStuGreat = findViewById(R.id.textViewResult);
                grdStuGreat.setText("Aluno com ótima nota");
                break;
            case 8:
                TextView grdStuGood = findViewById(R.id.textViewResult);
                grdStuGood.setText("Aluno com boa nota!");
                break;
            case 7:
                TextView grdStuRegular = findViewById(R.id.textViewResult);
                grdStuRegular.setText("Aluno com nota regular!");
                break;
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                TextView grdStuBad = findViewById(R.id.textViewResult);
                grdStuBad.setText("Aluno com péssima nota!");
                break;
            default:
                TextView grdStuIncorrect = findViewById(R.id.textViewResult);
                grdStuIncorrect.setText("Nota incorreta!");
        }
    }

}
