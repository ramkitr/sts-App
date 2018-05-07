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
import com.firebase.client.ValueEventListener;


public class Main2Activity extends AppCompatActivity {

    EditText e1=null,e2=null,e3=null,e4=null;
    Button b1;
    //final Main2Activity mm=new Main2Activity();
    private Firebase ref;
    public int nof1;
    public void getnof()
    {
        Firebase.setAndroidContext(this);

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
            Firebase.setAndroidContext(this);
       e1 = (EditText)findViewById(R.id.editText3);
       e2 = (EditText)findViewById(R.id.editText4);
       e3 = (EditText)findViewById(R.id.editText5);
       e4 = (EditText)findViewById(R.id.editText6);
        Button b1 = (Button) findViewById(R.id.button3);




        b1.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                final String user=e1.getText().toString().trim();
                final String pass=e2.getText().toString().trim();
                final String email=e3.getText().toString().trim();
                final String phone=e4.getText().toString().trim();

                Firebase fm=new Firebase("https://fireapp-1530e.firebaseio.com/user/"+user);
                Firebase fg=fm.child("password");
                fg.setValue(pass);
                fg=fm.child("emailid");
                fg.setValue(email);
                fg=fm.child("phone_no");
                fg.setValue(phone);


                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
              } );
    }
}

