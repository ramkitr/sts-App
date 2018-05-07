package com.example.sriprasath.finalsts;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

import static android.widget.Toast.LENGTH_LONG;

public class Main5Activity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
    Button b1,b5;
    int sum =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        e1 = (EditText) findViewById(R.id.textView17);
        e2 = (EditText) findViewById(R.id.textView177);
        e3 = (EditText) findViewById(R.id.textView187);
        e4 = (EditText) findViewById(R.id.textView179);
        e5 = (EditText) findViewById(R.id.editText3);
        e6 = (EditText) findViewById(R.id.editText30);
        e7 = (EditText) findViewById(R.id.editText773);
        e8 = (EditText) findViewById(R.id.editText733);
        e9 = (EditText) findViewById(R.id.editText730);
        b1 = (Button) findViewById(R.id.button9);
        this.registerForContextMenu(e1);
        this.registerForContextMenu(e2);
        this.registerForContextMenu(e3);
        this.registerForContextMenu(e4);


        b5 = (Button) findViewById(R.id.button108);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        int id = v.getId();
        if (id == R.id.textView17) {
            getMenuInflater().inflate(R.menu.main, menu);
        } else if (id == R.id.textView177) {
            getMenuInflater().inflate(R.menu.main1, menu);
        }

        else if (id == R.id.textView187) {
            getMenuInflater().inflate(R.menu.main2, menu);
        }

        else if (id == R.id.textView179) {
            getMenuInflater().inflate(R.menu.main3, menu);
        }


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.l1: {
                e1.setText("pipe");
                int a = Integer.parseInt(String.valueOf(e5.getText()));
                sum=sum+a*67;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l2: {
                e1.setText("elbow");
                int b = Integer.parseInt(String.valueOf(e5.getText()));
                sum = sum + b * 42;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l3: {
                e1.setText("bend");
                int c = Integer.parseInt(String.valueOf(e5.getText()));
                sum = sum + c * 38;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l4: {
                e1.setText("tee");
                int d = Integer.parseInt(String.valueOf(e5.getText()));
                sum = sum + d * 38;
                e9.setText(String.valueOf(sum));
                break;
            }

            case R.id.l5: {
                e2.setText("pipe");
                int a1 = Integer.parseInt(String.valueOf(e6.getText()));
                sum = sum + a1 * 67;
                e9.setText(String.valueOf(sum));
                break;
            }

            case R.id.l6: {
                e2.setText("elbow");
                int b2 = Integer.parseInt(String.valueOf(e6.getText()));
                sum = sum + b2 * 42;
                e9.setText(String.valueOf(sum));
                break;
            }

            case R.id.l7: {
                e2.setText("bend");
                int c1 = Integer.parseInt(String.valueOf(e6.getText()));
                sum = sum + c1 * 42;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l8: {
                e2.setText("tee");
                int d2 = Integer.parseInt(String.valueOf(e6.getText()));
                sum = sum + d2 * 38;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l9: {
                e3.setText("pipe");
                int a2 = Integer.parseInt(String.valueOf(e7.getText()));
                sum = sum + a2 * 67;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l10: {
                e3.setText("elbow");
                int b3 = Integer.parseInt(String.valueOf(e7.getText()));
                sum = sum + b3 * 42;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l11: {
                e3.setText("bend");
                int c2 = Integer.parseInt(String.valueOf(e7.getText()));
                sum = sum + c2 * 42;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l12: {
                e3.setText("tee");
                int d1 = Integer.parseInt(String.valueOf(e7.getText()));
                sum = sum + d1 * 38;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l13: {
                e4.setText("pipe");
                int a3 = Integer.parseInt(String.valueOf(e8.getText()));
                sum = sum + a3 * 67;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l14: {
                e4.setText("elbow");
                int b4 = Integer.parseInt(String.valueOf(e8.getText()));
                sum = sum + b4 * 42;
                e9.setText(String.valueOf(sum));
                break;
            }
            case R.id.l15: {
                e4.setText("bend");
                int c3 = Integer.parseInt(String.valueOf(e8.getText()));
                sum = sum + c3 * 38;
                e9.setText(String.valueOf(sum));
                break;
            }

            case R.id.l16: {
                e4.setText("tee");
                int d3 = Integer.parseInt(String.valueOf(e8.getText()));
                sum = sum + d3 * 38;
                e9.setText(String.valueOf(sum));
                break;
            }


        }

        return super.onContextItemSelected(item);
    }


     public void add(View v)
     {
         AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
         alertDialogBuilder.setMessage(" do you want to palce the order for ruppes " +sum);
                 alertDialogBuilder.setPositiveButton("yes",
                         new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface arg0, int arg1) {
                                 String message = e1.getText().toString();
                                 message=message+" - "+e5.getText().toString()+"\n"+e2.getText()+" - " +e6.getText() + "\n"+e3.getText()+" - "+e7.getText()+"\n"+e4.getText()+" - "+e8.getText()+"\n";
                                 String[] recp={"aswinthiagu333@gmail.com"};
                                 String sub ="order";

                                 Intent intend = new Intent(Intent.ACTION_SEND);
                                 intend.putExtra(Intent.EXTRA_EMAIL,recp);
                                 intend.putExtra(Intent.EXTRA_SUBJECT,sub);
                                 intend.putExtra(Intent.EXTRA_TEXT,message);

                                 intend.setType("message/rfc822");
                                 startActivity(Intent.createChooser(intend,"choose an email client"));

                                 try
                                 {
                                     FileOutputStream fos = openFileOutput("history.txt",MODE_APPEND);
                                     fos.write(message.getBytes());
                                     fos.close();
                                     Toast.makeText(getApplicationContext(),"file saved",LENGTH_LONG).show();

                                 }
                                 catch(Exception e)
                                 {

                                 }
                             }
                         });

         alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 finish();
             }
         });



         AlertDialog alertDialog = alertDialogBuilder.create();
         alertDialog.show();
     }
}







