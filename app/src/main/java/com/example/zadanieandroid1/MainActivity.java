package com.example.zadanieandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT1 = "com.example.zadanieandroid1.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2 = "com.example.zadanieandroid1.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.zadanieandroid1.EXTRA_TEXT3";
    public static final String EXTRA_TEXT4 = "com.example.zadanieandroid1.EXTRA_TEXT4";
    public static final String EXTRA_TEXT5 = "com.example.zadanieandroid1.EXTRA_TEXT5";

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

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                inputThirdScreen();
                openSeconScreen();
            }
        });
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onCreate1 = format + " " + "OnCreate: MainActivity";
    }
    public void openSeconScreen(){
        EditText editText1 = (EditText) findViewById(R.id.name);
        String text1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.surname);
        String text2 = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.address);
        String text3 = editText3.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.email);
        String text4 = editText4.getText().toString();

        EditText editText5 = (EditText) findViewById(R.id.password);
        String text5 = editText5.getText().toString();

        Intent intent = new Intent(this, SecondScreen.class);
        intent.putExtra(EXTRA_TEXT1, text1);
        intent.putExtra(EXTRA_TEXT2, text2);
        intent.putExtra(EXTRA_TEXT3, text3);
        intent.putExtra(EXTRA_TEXT4, text4);
        intent.putExtra(EXTRA_TEXT5, text5);
        startActivity(intent);
    }

    public void inputThirdScreen(){
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
        onStart1 = format + " " + "OnStart: MainActivity";
    }

    @Override
    protected void onResume() {
        super.onResume();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onResume1 = format + " " + "OnResume: MainActivity";
    }

    @Override
    protected void onPause() {
        super.onPause();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onPause1 = format + " " + "OnPause: MainActivity";
    }

    @Override
    protected void onStop() {
        super.onStop();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onStop1 = format + " " + "OnStop: MainActivity";
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onRestart1 = format + " " + "OnRestart: MainActivity";
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String format = s.format(new Date());
        onDestroy1 = format + " " + "OnDestroy: MainActivity";
    }
}