package com.example.program10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.Toast;

public class MaainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.check1:
                if (checked)
                    Toast.makeText(this, "Selected BCA", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Removed BCA", Toast.LENGTH_SHORT).show();
                break;
            case R.id.check2:
                if (checked)
                    Toast.makeText(this, "Selected MCA", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Removed MCA", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
