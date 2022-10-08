package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button Yes;
    Button No;
    TextView question;
    private String[] questions = {"1. Was java introduced in 1823?","2. Was Java is a compiled Language?","3. Java founder name is Syed Mughis Hussain?"
           , "4. Java is a Person?","5. Java was created by using PHP?","6. Java was founded by James Gosling?","7. Java is a compiled and interpreted language?",
    "8. Java is a object oriented programming languge?","9. Java supports multiple inheritance?","10. Java support interfaces?"};
    private boolean[] answers  ={false,true,false,false,false,true,true,true,false,true};
    private int index=0;
    private int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = findViewById(R.id.question);
        Yes  = findViewById(R.id.Yes);
        No = findViewById(R.id.No);
        question.setText(questions[index]);
        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(index<=questions.length-1){
                if(answers[index]==true){
                score++;
            }
            index++;
            if(index<=questions.length-1){
                question.setText(questions[index]);
            }
            else{
                    Toast.makeText(MainActivity.this, "Your score is"+score+ "/" +questions.length, Toast.LENGTH_SHORT).show();
                }}
           else{
                    Toast.makeText(MainActivity.this, "Restart Quiz App to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(answers[index]==false){
                        score++;
                    }
                index++;
                if(index<=questions.length-1){
                    question.setText(questions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your score is"+score+ "/" +questions.length, Toast.LENGTH_SHORT).show();
                }}
               else{
                        Toast.makeText(MainActivity.this, "Restart Quiz App to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}