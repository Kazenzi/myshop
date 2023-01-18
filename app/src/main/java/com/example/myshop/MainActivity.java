package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String Breadc_extra="com.example.myshop.Breadc_extra";
    public static final String Breadp_extra="com.example.myshop.Breadp_extra";

    TextView showvalue;
    TextView showcake;
    TextView showmuffin;
    TextView showjuice;
    TextView totalbread;
    TextView totalcake;
    TextView totaljuice;
    TextView totalmuffin;
    TextView breadprice;
    TextView cakeprice;
    TextView muffinprice;
    TextView juiceprice;
    TextView totals;
    TextView discount;
    TextView pAYable;
    Button newact;


    int counter=0;
    int countcake=0;
    int countmf=0;
    int contjc=0;
    int breadcost=1000;double disc=0.15;
            int muffincost=600;int cakecost=700;int juicecost=600;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showvalue=findViewById(R.id.textView3);
        showcake=findViewById(R.id.textView8);
        showmuffin=findViewById(R.id.textView10);
        showjuice=findViewById(R.id.textView12);
        totalbread=findViewById(R.id.textView4);
        totalcake=findViewById(R.id.textView5);
        totalmuffin=findViewById(R.id.textView6);
        totaljuice=findViewById(R.id.textView15);
        breadprice=findViewById(R.id.textView2);
        cakeprice=findViewById(R.id.textView7);
        muffinprice=findViewById(R.id.textView9);
        juiceprice=findViewById(R.id.textView11);
        totals=findViewById(R.id.textView13);
        discount=findViewById(R.id.textView14);
        pAYable=findViewById(R.id.textView16);
        newact=findViewById(R.id.button3);

    }
public void newact(View View){
        String str= totalbread.getText().toString();
    String str1= showvalue.getText().toString();
    String str2= showcake.getText().toString();
    String str3= totalcake.getText().toString();
    String str4= showmuffin.getText().toString();
    String str5= totalmuffin.getText().toString();
    String str6= showjuice.getText().toString();
    String str7= totaljuice.getText().toString();
    String str8= totals.getText().toString();
    String str9= discount.getText().toString();
    String str10= pAYable.getText().toString();

    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
    //  intent.putExtra("breadbought",breadngapi);
    intent.putExtra("totalbread",str);
    intent.putExtra("totalcount",str1);
    intent.putExtra("totalcake",str2);
    intent.putExtra("cakecount",str3);
    intent.putExtra("totalmf",str5);
    intent.putExtra("mfcount",str4);
    intent.putExtra("totaljuice",str7);
    intent.putExtra("juicecount",str6);
    intent.putExtra("last",str8);
    intent.putExtra("disc",str9);
    intent.putExtra("pay",str10);















    startActivity(intent);






}


    public void countin(View View){

        if (counter == 4) {
            Toast.makeText(this, "Maximum items", Toast.LENGTH_LONG).show();
        }else{
            counter++;
        }
        int breadngapi=Integer.parseInt(showvalue.getText().toString());
        int breadtotal= breadcost*counter;
        totalbread.setText(Integer.toString(breadtotal));

        showvalue.setText(Integer.toString(counter));
    }

    public void countdec(View View){
       if (counter==0){
           Toast.makeText(this, "No items in cart", Toast.LENGTH_LONG).show();
       }else{
        counter--;}
        int breadngapi=Integer.parseInt(showvalue.getText().toString());
        int breadtotal= breadcost* counter;
        totalbread.setText(Integer.toString(breadtotal));
        showvalue.setText(Integer.toString(counter));
    }
    public void countcakeadd(View View){
        if (countcake == 4) {
            Toast.makeText(this, "Maximum items", Toast.LENGTH_LONG).show();
        }else{
            countcake++;
        }
        int cakengapi=Integer.parseInt(showcake.getText().toString());
        int caketotal= cakecost* countcake;
        totalcake.setText(Integer.toString(caketotal));
        showcake.setText(Integer.toString(countcake));


    }
    public void countckdec(View View){
        if (countcake==0){
            Toast.makeText(this, "No items in cart", Toast.LENGTH_LONG).show();
        }else{
            countcake--;}
        int cakengapi=Integer.parseInt(showcake.getText().toString());
        int caketotal= cakecost* countcake;
        totalcake.setText(Integer.toString(caketotal));

        showcake.setText(Integer.toString(countcake));
    }
    public void mfadd(View View){

        if (countmf == 4) {
            Toast.makeText(this, "Maximum items", Toast.LENGTH_LONG).show();
        }else{
            countmf++;
        }
        int mfngapi=Integer.parseInt(showmuffin.getText().toString());
        int caketotal= muffincost* countmf;
        totalmuffin.setText(Integer.toString(caketotal));

        showmuffin.setText(Integer.toString(countmf));
    }
    public void mfdec(View View){
        if (countmf == 0) {
            Toast.makeText(this, "No items in cart", Toast.LENGTH_LONG).show();
        }else{
            countmf--;
        }
        int mfngapi=Integer.parseInt(showmuffin.getText().toString());
        int caketotal= cakecost* countmf;
        totalmuffin.setText(Integer.toString(caketotal));


        showmuffin.setText(Integer.toString(countmf));
    }
    public void jcadd(View View){

        if (contjc== 4) {
            Toast.makeText(this, "Maximum items", Toast.LENGTH_LONG).show();
        }else{
            contjc++;
        }
        int jcngapi=Integer.parseInt(showjuice.getText().toString());
        int juicetotal= juicecost* contjc;
        totaljuice.setText(Integer.toString(juicetotal));

        showjuice.setText(Integer.toString(contjc));
    }
    public void jcdec(View View){
        if (contjc== 0) {
            Toast.makeText(this, "No items in cart", Toast.LENGTH_LONG).show();
        }else{
            contjc--;
        }
        int jcngapi=Integer.parseInt(showjuice.getText().toString());
        int juicetotal= juicecost* contjc;
        totaljuice.setText(Integer.toString(juicetotal));
        showjuice.setText(Integer.toString(contjc));


    }

   public void getkilaprice(View view){
       int sumck=Integer.parseInt(totalcake.getText().toString());
       int sumbr=Integer.parseInt(totalbread.getText().toString());
       int summf=Integer.parseInt(totalmuffin.getText().toString());
       int sumjc=Integer.parseInt(totaljuice.getText().toString());
       int shopprice= sumbr+sumck+summf+sumjc;
       totals.setText("TOTALS:"+String.valueOf(shopprice));
       int shopdisc= (int) (shopprice*disc);
       discount.setText("DISCOUNT:"+String.valueOf(shopdisc));
       int lastshop=shopprice-shopdisc;
       pAYable.setText("TOTAL PAY:"+String.valueOf(lastshop));






   }




}