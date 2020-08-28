package com.example.buttonoptions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbStatus;
    RadioButton rbMale;
    RadioButton rbFemale;
    Switch switchGrade;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbStatus=findViewById(R.id.cbStatus);
        rbMale=findViewById(R.id.rbMale);
        rbFemale=findViewById(R.id.rbFemale);
        switchGrade=findViewById(R.id.SwitchGrade);
        tvResult=findViewById(R.id.tvResult);
    }

    public void btnClicked(View view) {
        String Result="";
        if (cbStatus.isChecked())
            Result="He is married";
        else
            Result="He is not married";
        if (rbMale.isChecked())
            Result+=" also he is male";
        else
            Result+=" also she is female";
        if (switchGrade.isChecked())
            Result+=" also this student is grade";
        else
            Result+=" also this student is not grade";

        tvResult.setText(Result);
    }
}