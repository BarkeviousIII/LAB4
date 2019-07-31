package com.example.student.madtute4mw;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Context context = getApplicationContext();
//        CharSequence text = "Hello toast!";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
//        toast.show();

        LayoutInflater inflator = getLayoutInflater();
        View view = inflator.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_container));

        TextView messageText = (TextView) view.findViewById(R.id.textView);
        messageText.setText("Custom toast");

        Toast toast =  new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL,0 ,0);
        toast.setDuration(Toast.LENGTH_LONG);

        toast.setView(view);

        toast.show();
    }
}
