package sg.edu.rp.c346.id20022098.p03_demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button buttonDisplay;
    EditText editInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay =findViewById(R.id.textViewDisplay);
        buttonDisplay =findViewById(R.id.buttonDisplay);
        editInput =findViewById(R.id.editTextInput);

        System.out.println("test onCreate");

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strResponse = editInput.getText().toString();
                tvDisplay.setText(strResponse);
            }
        });
    }
}