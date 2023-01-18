package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
//    public static final String breadprice="bp";
//    public static final String breadcount="bc";
//    public static final String cakecount="cc";
//    public static final String cakeprice="cp";
//    public static final String mfcount="mc";
//    public static final String mfprice="mp";
//   public static final String jcprice="jp";
//    public static final String jccount="jc";
//    public static final String ktotal="kt";
//    public static final String kdisc="kd";
//    public static final String kpy="kpy";

    TextView textView26, textView25,textView27,textView24;
    TextView textView32, textView30,textView31,textView29;
    TextView textView35, textView36,textView33,textView37;
    TextView textView39, textView40,textView41,textView42;
    TextView textView45, textView46,textView47;
    double desc=0.15;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView25=findViewById(R.id.textView25);
        textView26=findViewById(R.id.textView26);
        textView32=findViewById(R.id.textView32);
        textView30=findViewById(R.id.textView30);
        textView35=findViewById(R.id.textView35);
        textView36=findViewById(R.id.textView36);
        textView39=findViewById(R.id.textView39);
        textView40=findViewById(R.id.textView40);
        textView45=findViewById(R.id.textView45);
        textView46=findViewById(R.id.textView46);
        textView47=findViewById(R.id.textView47);


        Intent intent=getIntent();


        String str= intent.getStringExtra("totalbread");
        String str1=intent.getStringExtra("totalcount");
        String str2= intent.getStringExtra("totalcake");
        String str3= intent.getStringExtra("cakecount");
        String str4= intent.getStringExtra("totalmf");
        String str5= intent.getStringExtra("mfcount");
        String str6= intent.getStringExtra("totaljuice");
        String str7= intent.getStringExtra("juicecount");
        String str8= intent.getStringExtra("last");
        String str9= intent.getStringExtra("disc");
        String str10=intent.getStringExtra("pay");



        textView25.setText(str);
        textView26.setText(str1);
        textView30.setText(str3);
        textView32.setText(str2);
        textView35.setText(str5);
        textView36.setText(str4);
        textView39.setText(str7);
        textView40.setText(str6);
        textView45.setText(str8);
        textView46.setText(str9);
        textView47.setText(str10);



//int breaddis=Integer.parseInt(textView25.getText().toString());
//int bready= (int) (breaddis*desc);
//
//int cakedis=Integer.parseInt(textView32.getText().toString());
//int cakeady= (int) (cakedis*desc);
//
//
//int mfdis=Integer.parseInt(textView36.getText().toString());
//int mfady= (int) (mfdis*desc);
//
//int jcdis=Integer.parseInt(textView40.getText().toString());
//int jcdady= (int) (jcdis*desc);
//
//textView27.setText(bready);
//textView31.setText(cakeady);
//textView33.setText(mfady);
//textView41.setText(jcdady);




    }
}