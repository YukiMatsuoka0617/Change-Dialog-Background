package com.example.changedialogbackground;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        showDialog();
    }

    void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Title");
        builder.setMessage("Message");
        builder.setPositiveButton("OK", null);
        builder.setNegativeButton("NG", null);

        AlertDialog dialog = builder.create();
        dialog.show();

        WindowManager.LayoutParams wMLP = dialog.getWindow().getAttributes();
        wMLP.dimAmount = 0.3f;
        wMLP.gravity = Gravity.TOP;
        dialog.getWindow().setAttributes(wMLP);
    }
}