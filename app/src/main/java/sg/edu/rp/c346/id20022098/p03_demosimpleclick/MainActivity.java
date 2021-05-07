package sg.edu.rp.c346.id20022098.p03_demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button buttonDisplay;
    EditText editInput;
    ToggleButton toggleButtonEnabled;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay =findViewById(R.id.textViewDisplay);
        buttonDisplay =findViewById(R.id.buttonDisplay);
        editInput =findViewById(R.id.editTextInput);
        toggleButtonEnabled =findViewById(R.id.toggleButton);
        radioGroup =findViewById(R.id.radioGroupGender);

        System.out.println("test onCreate");

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strResponse = editInput.getText().toString();
                int checkedRadioID =radioGroup.getCheckedRadioButtonId();
                if(checkedRadioID == R.id.radioButtonGenderMale){
                    strResponse ="He says" + strResponse;
                }
                else{
                    strResponse ="She says" + strResponse;
                }
                tvDisplay.setText(strResponse);
            }
        });

        toggleButtonEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButtonEnabled.isChecked()){
                    editInput.setEnabled(true);
                }
                else{
                    editInput.setEnabled(false);
                }
            }
        });
    }
}