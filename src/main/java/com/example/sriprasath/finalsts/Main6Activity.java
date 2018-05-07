package com.example.sriprasath.finalsts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6Activity extends AppCompatActivity {

    EditText t1;
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        t1 = (EditText) findViewById(R.id.editText30);
        b5 = (Button)findViewById(R.id.button11);


        try {
            FileInputStream fis = openFileInput("history.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(fis)));
            String msg;
            while((msg = br.readLine())!= null) {
                t1.append("\n");
                t1.append(msg);

                t1.append("\n");
            }
            fis.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(i);
            }
        });
    }
}
