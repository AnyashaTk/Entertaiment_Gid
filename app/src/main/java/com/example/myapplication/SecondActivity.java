package com.example.mapapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private RadioGroup radioGroupCharacter;
    private RadioButton radioButtonMale;
    private RadioButton radioButtonFemale;

    private RadioGroup radioGroupDiffLevel;
    private RadioButton radioButtonEasy;
    private RadioButton radioButtonMedium;
    private RadioButton radioButtonHard;

    private Button buttonSave;

    private String LOGTAG = "AndroidRadioDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        this.radioGroupCharacter= (RadioGroup) this.findViewById(R.id.radioGroup_character);
        this.radioButtonMale = (RadioButton) this.findViewById(R.id.radioButton_w);
        this.radioButtonFemale  =  (RadioButton)this.findViewById(R.id.radioButton_a);
        this.radioButtonFemale  =  (RadioButton)this.findViewById(R.id.radioButton_sm);
        this.radioButtonFemale  =  (RadioButton)this.findViewById(R.id.radioButton_sp);
        this.radioButtonMale.setChecked(true);

        //
        this.radioGroupDiffLevel= (RadioGroup) this.findViewById(R.id.radioGroup_diffLevel);
        this.radioButtonEasy = (RadioButton) this.findViewById(R.id.radioButton_easy);
        this.radioButtonMedium  =  (RadioButton)this.findViewById(R.id.radioButton_medium);
        this.radioButtonHard =  (RadioButton)this.findViewById(R.id.radioButton_hard);
        this.radioButtonMedium.setChecked(true);

        this.buttonSave= (Button) this.findViewById(R.id.button_save);


        this.radioGroupDiffLevel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                doOnDifficultyLevelChanged(group, checkedId);
            }
        });

        this.radioButtonMale.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                doOnGameCharacterChanged(buttonView,isChecked);
            }
        });


        this.radioButtonFemale.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                doOnGameCharacterChanged(buttonView,isChecked);
            }
        });


        this.buttonSave.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSave();
            }
        });
    }



    private void doOnDifficultyLevelChanged(RadioGroup group, int checkedId) {
        int checkedRadioId = group.getCheckedRadioButtonId();

        if(checkedRadioId== R.id.radioButton_easy) {
            Toast.makeText(this,"Вы предпочли активный вид отдыха.",Toast.LENGTH_SHORT).show();
        } else if(checkedRadioId== R.id.radioButton_medium ) {
            Toast.makeText(this,"Вы предпочли пассивный вид отдыха.",Toast.LENGTH_SHORT).show();
        } else if(checkedRadioId== R.id.radioButton_hard) {
            Toast.makeText(this,"Вы предпочли совмещённый отдых.",Toast.LENGTH_SHORT).show();
        }
    }


    private void doOnGameCharacterChanged(CompoundButton buttonView, boolean isChecked)  {
        RadioButton radio =(RadioButton) buttonView;

        Log.i(LOGTAG, "RadioButton "+ radio.getText()+" : "+ isChecked);
    }


    private void doSave()  {
        int difficultyLevel = this.radioGroupDiffLevel.getCheckedRadioButtonId();
        int gameCharacter = this.radioGroupCharacter.getCheckedRadioButtonId();

        RadioButton radioButtonDiffLevel = (RadioButton) this.findViewById(difficultyLevel);
        RadioButton radioButtonGameCharacter = (RadioButton) this.findViewById(gameCharacter);

        String message ="Вид отдыха: "+ radioButtonDiffLevel.getText()
                +". Предпочитаемый сезон: " + radioButtonGameCharacter.getText() +".";

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}