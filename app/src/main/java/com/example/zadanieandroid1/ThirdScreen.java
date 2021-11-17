package com.example.zadanieandroid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        Intent intent3 = getIntent();
        String text1 = intent3.getStringExtra(MainActivity.EXTRA_TEXT6);
        TextView textView1 = (TextView) findViewById(R.id.textBox1);
        String text2 = intent3.getStringExtra(MainActivity.EXTRA_TEXT7);
        TextView textView2 = (TextView) findViewById(R.id.textBox2);
        String text3 = intent3.getStringExtra(MainActivity.EXTRA_TEXT8);
        TextView textView3 = (TextView) findViewById(R.id.textBox3);
        String text4 = intent3.getStringExtra(MainActivity.EXTRA_TEXT9);
        TextView textView4 = (TextView) findViewById(R.id.textBox4);
        String text5 = intent3.getStringExtra(MainActivity.EXTRA_TEXT10);
        TextView textView5 = (TextView) findViewById(R.id.textBox5);
        String text6 = intent3.getStringExtra(MainActivity.EXTRA_TEXT11);
        TextView textView6 = (TextView) findViewById(R.id.textBox6);
        String text7 = intent3.getStringExtra(MainActivity.EXTRA_TEXT12);
        TextView textView7 = (TextView) findViewById(R.id.textBox7);
        textView1.setText(text1);
        textView2.setText(text2);
        textView3.setText(text3);
        textView4.setText(text4);
        textView5.setText(text5);
        textView6.setText(text6);
        textView7.setText(text7);

        String text8 = intent3.getStringExtra(SecondScreen.EXTRA_TEXT6);
        TextView textView8 = (TextView) findViewById(R.id.textBox1);
        String text9 = intent3.getStringExtra(SecondScreen.EXTRA_TEXT7);
        TextView textView9 = (TextView) findViewById(R.id.textBox2);
        String text10 = intent3.getStringExtra(SecondScreen.EXTRA_TEXT8);
        TextView textView10 = (TextView) findViewById(R.id.textBox3);
        String text11 = intent3.getStringExtra(SecondScreen.EXTRA_TEXT9);
        TextView textView11 = (TextView) findViewById(R.id.textBox4);
        String text12 = intent3.getStringExtra(SecondScreen.EXTRA_TEXT10);
        TextView textView12 = (TextView) findViewById(R.id.textBox5);
        String text13 = intent3.getStringExtra(SecondScreen.EXTRA_TEXT11);
        TextView textView13 = (TextView) findViewById(R.id.textBox6);
        String text14 = intent3.getStringExtra(SecondScreen.EXTRA_TEXT12);
        TextView textView14 = (TextView) findViewById(R.id.textBox7);
        textView8.setText(text8);
        textView9.setText(text9);
        textView10.setText(text10);
        textView11.setText(text11);
        textView12.setText(text12);
        textView13.setText(text13);
        textView14.setText(text14);
    }
}