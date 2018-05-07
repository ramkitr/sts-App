package com.example.sriprasath.finalsts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class Main7Activity extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e1,e2,e3;
    RatingBar r;
    Button b1;
    String q1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main7);

        t1 =(TextView)findViewById(R.id.textView0);
        t2 =(TextView)findViewById(R.id.textView);
        t3 = (TextView)findViewById(R.id.textView2);
        e1= (EditText)findViewById(R.id.editText01);
        e2= (EditText)findViewById(R.id.editText07);
        r = (RatingBar)findViewById(R.id.ratingBar);
        b1 =(Button)findViewById(R.id.button8);

        Intent i = getIntent();
        q1=i.getStringExtra("q2");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f = r.getRating();
                String a = t1.getText().toString();
                String b = t2.getText().toString();
                String c = t3.getText().toString();
                String d = e1.getText().toString();
                String e = e2.getText().toString();

                Firebase fm=new Firebase("https://fireapp-1530e.firebaseio.com/user/"+q1);
                Firebase fg=fm.child("rating");
                fg.setValue(f);
                fg=fm.child("experience");
                fg.setValue(d);
                fg=fm.child("needed by you");
                fg.setValue(e);
                Toast.makeText(getApplicationContext(),"your feedback has been recorede",Toast.LENGTH_LONG).show();

                Intent idm = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(idm);
            }
    });


}
}
