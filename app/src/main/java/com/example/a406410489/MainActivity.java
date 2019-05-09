package com.example.a406410489;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.ScrollingMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView output;
    String text="";
    private float size=12;
    String meesage ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=findViewById(R.id.editText);
        output=findViewById(R.id.textView);


    }
    public void sizeup(View v){
        size+=3;
        input.setTextSize(size);
    }
    public void sizedown(View v){
        size-=3;
        input.setTextSize(size);
    }
    public void rewrite(View v){
        input.setText(text);
    }
    public void sentmeesage(View v){
        Random x = new Random(4);

        meesage = input.getText().toString();

        SpannableString colortext = new SpannableString(meesage+output.getText());

        colortext.setSpan(new ForegroundColorSpan(Color.RED),0,meesage.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);

        colortext.setSpan(new AbsoluteSizeSpan((int) size, true),0,meesage.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        output.setText(colortext, TextView.BufferType.SPANNABLE);

        output.setMovementMethod(new ScrollingMovementMethod());
        input.setText(text);

    }
}
