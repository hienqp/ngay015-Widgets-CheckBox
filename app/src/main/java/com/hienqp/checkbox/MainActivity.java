package com.hienqp.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBoxANDROID, checkBoxIOS, checkBoxPHP;
    Button buttonConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        declareCheckboxObject();

        checkedChangeListener();

        onClickListener();
    }

    private void declareCheckboxObject() {
        checkBoxANDROID = (CheckBox) findViewById(R.id.chon_android);
        checkBoxIOS = (CheckBox) findViewById(R.id.chon_ios);
        checkBoxPHP = (CheckBox) findViewById(R.id.chon_php);
        buttonConfirm = (Button) findViewById(R.id.nut_xac_nhan);
    }

    private void checkedChangeListener() {
        checkBoxANDROID.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Checked Android", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "UnChecked Android", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBoxIOS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Checked IOS", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "UnChecked IOS", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBoxPHP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "Checked PHP", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "UnChecked PHP", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void onClickListener() {
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subjects = "You've choose: \n";
                if (!checkBoxANDROID.isChecked() && !checkBoxIOS.isChecked() && !checkBoxPHP.isChecked()) {
                    Toast.makeText(MainActivity.this, subjects + "without any subject", Toast.LENGTH_SHORT).show();
                } else {
                    if (checkBoxANDROID.isChecked()) {
                        subjects += checkBoxANDROID.getText() + "\n";
                    }
                    if (checkBoxIOS.isChecked()) {
                        subjects += checkBoxIOS.getText() + "\n";
                    }
                    if (checkBoxPHP.isChecked()) {
                        subjects += checkBoxPHP.getText() + "\n";
                    }

                    Toast.makeText(MainActivity.this, subjects, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}