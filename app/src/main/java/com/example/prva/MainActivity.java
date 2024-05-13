package com.example.prva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText rezultat;
    Button ena,dva,tri,stiri,pet,sest,sedem,osem,devet,nic,nic2,enako;

    String operator;
    double st1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rezultat = findViewById(R.id.rezultat);
        ena= findViewById(R.id.ena);
        dva= findViewById(R.id.dva);
        tri= findViewById(R.id.tri);
        stiri= findViewById(R.id.stiri);
        pet= findViewById(R.id.pet);
        sest= findViewById(R.id.sest);
        sedem= findViewById(R.id.sedem);
        osem= findViewById(R.id.osem);
        devet= findViewById(R.id.devet);
        nic= findViewById(R.id.nic);
        enako= findViewById(R.id.enako);
    }
    public void Ena(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"1");
    }
    public void Dva(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"2");
    }
    public void Tri(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"3");
    }
    public void Stiri(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"4");
    }
    public void Pet(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"5");
    }
    public void Sest(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"6");
    }
    public void Sedem(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"7");
    }
    public void Osem(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"8");
    }
    public void Devet(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"9");
    }
    public void Nic(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"0");
    }
    public void Nic2(View v){
        String a = String.valueOf(rezultat.getText());
        rezultat.setText(a+"00");
    }
    public void Vejica(View v){
        try {
            String a = String.valueOf(rezultat.getText());
            rezultat.setText(a+".");
            operator = ".";
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Plus(View v){
        try {
            st1 = Double.valueOf(String.valueOf(rezultat.getText()));
            rezultat.setText("");
            operator = "+";
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Minus(View v){
        try {
            st1 = Double.valueOf(String.valueOf(rezultat.getText()));
            rezultat.setText("");
            operator = "-";
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Krat(View v){
        try {
            st1 = Double.valueOf(String.valueOf(rezultat.getText()));
            rezultat.setText("");
            operator = "*";
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Deljeno(View v){
        try {
            st1 = Double.valueOf(String.valueOf(rezultat.getText()));
            rezultat.setText("");
            operator = "/";
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void Clear(View v){
        rezultat.setText("");
        operator = "";
    }
    public void Enako(View v){
        try {
            if (operator.equals("+")) {
                double r = st1 + Double.valueOf(String.valueOf(rezultat.getText()));
                rezultat.setText(String.valueOf(r));
            }
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
        try {
            if (operator.equals("-")) {
                double r = st1 - Double.valueOf(String.valueOf(rezultat.getText()));
                rezultat.setText(String.valueOf(r));
            }
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            if (operator.equals("*")) {
                double r = st1 * Double.valueOf(String.valueOf(rezultat.getText()));
                rezultat.setText(String.valueOf(r));
            }
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
        try {
            if (operator.equals("/")) {
                double r = st1 / Double.valueOf(String.valueOf(rezultat.getText()));
                rezultat.setText(String.valueOf(r));
            }
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),"Vnesi drugo stevilo",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}