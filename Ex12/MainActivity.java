package com.example.ex12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleradiobutton(View view){
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rb1:
                if (checked){
                    showmessage("Selected Male");
                }
                break;
            case R.id.rb2:
                if (checked){
                    showmessage("Selected Female");
                }
        }
    }

    private void showmessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
