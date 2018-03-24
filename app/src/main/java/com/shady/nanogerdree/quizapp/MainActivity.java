package com.shady.nanogerdree.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText egyptLangTv;
    CheckBox arabianCountryCb;
    CheckBox asianCountryCb;
    CheckBox africanCountryCb;
    CheckBox mediterraneanCountryCb;
    CheckBox southEastCountryCb;
    RadioButton egyptRiverRb;
    CheckBox pyramidsCb;
    CheckBox grandCanyonCb;
    CheckBox grandWallCb;
    CheckBox sphinxCb;
    Button checkScoreBtn;

    Integer score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        egyptLangTv = findViewById(R.id.egyptLangTv);
        arabianCountryCb = findViewById(R.id.arabianCountryCb);
        asianCountryCb = findViewById(R.id.asianCountryCb);
        africanCountryCb = findViewById(R.id.africanCountryCb);
        mediterraneanCountryCb = findViewById(R.id.mediterraneanCountryCb);
        southEastCountryCb = findViewById(R.id.southEastCountryCb);
        egyptRiverRb = findViewById(R.id.egyptRiverRb);
        pyramidsCb = findViewById(R.id.pyramidsCb);
        grandCanyonCb = findViewById(R.id.grandCanyonCb);
        grandWallCb = findViewById(R.id.grandWallCb);
        sphinxCb = findViewById(R.id.sphinxCb);
        checkScoreBtn = findViewById(R.id.checkScoreBtn);

        checkScoreBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v)
            {
                if (egyptLangTv.getText().toString().toLowerCase().equals("arabic"))
                    score++;
                if (arabianCountryCb.isChecked() && !asianCountryCb.isChecked() && africanCountryCb.isChecked()
                        && mediterraneanCountryCb.isChecked() && !southEastCountryCb.isChecked())
                    score++;
                if (pyramidsCb.isChecked() && !grandCanyonCb.isChecked() && !grandWallCb.isChecked() && sphinxCb.isChecked())
                    score++;
                if (egyptRiverRb.isChecked())
                    score++;

                if (score < 4){
                    Toast.makeText(getBaseContext(),"Score: " + String.valueOf(score) + " of 4",Toast.LENGTH_LONG).show();
                }else
                {
                    Toast.makeText(getBaseContext(),"Well Done. You solved them all.",Toast.LENGTH_LONG).show();
                }
                score = 0;
            }
        });
    }
}
