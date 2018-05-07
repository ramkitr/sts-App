package com.example.sriprasath.finalsts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText e1, e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.editText2);
        e2 = (EditText) findViewById(R.id.editText3);

        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {

                                      final String uname = e1.getText().toString().trim();
                                      final String pass = e2.getText().toString().trim();
                                      Firebase fm = new Firebase("https://fireapp-1530e.firebaseio.com/user/" + uname + "/password");
                                      fm.addValueEventListener(new com.firebase.client.ValueEventListener() {
                                          @Override
                                          public void onDataChange(DataSnapshot dataSnapshot) {
                                              String pass1 = dataSnapshot.getValue(String.class);
                                              if (pass.equals(pass1)) {
                                                  Toast.makeText(getApplicationContext(), "you are logged in", Toast.LENGTH_LONG).show();
                                                  Intent i = new Intent(MainActivity.this,Main3Activity.class);
                                                  i.putExtra("q1",uname);
                                                  startActivity(i);

                                              }
                                              else if(uname.equals(""))
                                              {
                                                  Toast.makeText(getApplicationContext(), "enter the details", Toast.LENGTH_LONG).show();
                                                  Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                                  startActivity(i);
                                              }

                                              else {
                                                  Toast.makeText(getApplicationContext(), "dont have an account ??", Toast.LENGTH_LONG).show();
                                                  Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                                  startActivity(i);
                                              }

                                          }

                                          @Override
                                          public void onCancelled(FirebaseError firebaseError) {

                                          }
                                      });

                                  }
                              }
        );

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), Main2Activity.class);
                startActivity(i);

            }
        });
    }
}
