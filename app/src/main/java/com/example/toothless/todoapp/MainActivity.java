package com.example.toothless.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ArrayList arrayList;
    Button add_msg;
    TextView txtView;
    EditText editText;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList();
        add_msg = findViewById(R.id.add_msg);
        txtView = findViewById(R.id.txtView);

        add_msg.setOnClickListener(this);
    }

    public void onClick(View view) {

        editText = findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        arrayList.add(message);

        txtView.setText(arrayList.get(i).toString()+"\n"+txtView.getText());
        i++;
    }
}