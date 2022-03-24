package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private Button  AC,Power,Back,Div,Mul,Add,Sub,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Zero,Ans,Point,Equal;
    private String input,Answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.screen);
        AC=findViewById(R.id.ac);
        Power=findViewById(R.id.power);
        Back=findViewById(R.id.back);
        Div=findViewById(R.id.div);
        Seven=findViewById(R.id.seven);
        Eight=findViewById(R.id.eight);
        Nine=findViewById(R.id.nine);
        Mul=findViewById(R.id.mul);
        Four=findViewById(R.id.four);
        Five=findViewById(R.id.five);
        Six=findViewById(R.id.six);
        Sub=findViewById(R.id.sub);
        One=findViewById(R.id.one);
        Two=findViewById(R.id.two);
        Three=findViewById(R.id.three);
        Add=findViewById(R.id.add);
        Zero=findViewById(R.id.zero);
        Point=findViewById(R.id.point);
        Ans=findViewById(R.id.ans);
        Equal=findViewById(R.id.equal);




    }
    public void ButtonClick(View view){
        Button button=(Button) view;
        String data=button.getText().toString();
        switch (data){
            case "AC":
            input="";
            break;
            case "Ans":
                input+="Answer";
                break;

            case "X":
                Solve();
                input+="*";
                break;

            case "^":
                Solve();
                input+="^";
                break;
            case "=":
                Solve();
                Answer=input;
                break;

            case "←":
                    String newText=input.substring(0,input.length()-1);

                  input=newText;
                  break;
            default:
                if (input==null){
                    input="";
                }
                if (data.equals("+")|| data.equals("-")|| data.equals("/")){
                    Solve();
                }
                input+=data;


        }
        screen.setText(input);

    }
    private void Solve(){


    }
}