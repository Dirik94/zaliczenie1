package com.example.zadanieandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondScreen extends AppCompatActivity {

    private Button button1;
    private Button button2;

    public static final String EXTRA_TEXT6 = "com.example.zadanieandroid1.EXTRA_TEXT6";
    public static final String EXTRA_TEXT7 = "com.example.zadanieandroid1.EXTRA_TEXT7";
    public static final String EXTRA_TEXT8 = "com.example.zadanieandroid1.EXTRA_TEXT8";
    public static final String EXTRA_TEXT9 = "com.example.zadanieandroid1.EXTRA_TEXT9";
    public static final String EXTRA_TEXT10 = "com.example.zadanieandroid1.EXTRA_TEXT10";
    public static final String EXTRA_TEXT11 = "com.example.zadanieandroid1.EXTRA_TEXT11";
    public static final String EXTRA_TEXT12 = "com.example.zadanieandroid1.EXTRA_TEXT12";

    public String onCreate1;
    public String onStart1;
    public String onResume1;
    public String onPause1;
    public String onStop1;
    public String onRestart1;
    public String onDestroy1;
    private static final String TAG = "SecondScreen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        button1 = (Button) findViewById(R.id.returnButton);
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        Intent intent2 = getIntent();
        String text1 = intent2.getStringExtra(MainActivity.EXTRA_TEXT1);
        String text2 = intent2.getStringExtra(MainActivity.EXTRA_TEXT2);
        String text3 = intent2.getStringExtra(MainActivity.EXTRA_TEXT3);
        String text4 = intent2.getStringExtra(MainActivity.EXTRA_TEXT4);
        String text5 = intent2.getStringExtra(MainActivity.EXTRA_TEXT5);

        TextView textView1 = (TextView) findViewById(R.id.name2);
        TextView textView2 = (TextView) findViewById(R.id.surname2);
        TextView textView3 = (TextView) findViewById(R.id.address2);
        TextView textView4 = (TextView) findViewById(R.id.email2);
        TextView textView5 = (TextView) findViewById(R.id.password2);

        textView1.setText(text1);
        textView2.setText(text2);
        textView3.setText(text3);
        textView4.setText(text4);
        textView5.setText(text5);

        button2 = (Button) findViewById(R.id.cylkeZycia);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openThirdScreen();
            }
        });

        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onCreate1 = format + " " + "OnCreate: SecondScreen";
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openThirdScreen(){
        Intent intent = new Intent(this, ThirdScreen.class);

        intent.putExtra(EXTRA_TEXT6, onCreate1);
        intent.putExtra(EXTRA_TEXT7, onStart1);
        intent.putExtra(EXTRA_TEXT8, onResume1);
        intent.putExtra(EXTRA_TEXT9, onPause1);
        intent.putExtra(EXTRA_TEXT10, onStop1);
        intent.putExtra(EXTRA_TEXT11, onRestart1);
        intent.putExtra(EXTRA_TEXT12, onDestroy1);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onStart1 = format + " " + "OnStart: SecondScreen";
    }

    @Override
    protected void onResume() {
        super.onResume();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onResume1 = format + " " + "OnResume: SecondScreen";
    }

    @Override
    protected void onPause() {
        super.onPause();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onPause1 = format + " " + "OnPause: SecondScreen";
    }

    @Override
    protected void onStop() {
        super.onStop();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onStop1 = format + " " + "OnStop: SecondScreen";
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onRestart1 = format + " " + "OnRestart: SecondScreen";
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onDestroy1 = format + " " + "OnDestroy: SecondScreen";
    }
}