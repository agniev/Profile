package agniev.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import agniev.fragment.R;

public class MainActivity extends AppCompatActivity {

//    int DIALOG_DATE = 1;
//    int myYear = 2017;
//    int myMonth = 00;
//    int myDay = 01;
//    TextView myDate;

    int checkName = 0;
    int checkSurname = 0;
    int checkDate = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editName = (EditText) findViewById(R.id.editName);
        editName.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s != null) {
                    checkName = 1;
                }
            }
        });

        EditText editSurname = (EditText) findViewById(R.id.editName);
        editSurname.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s != null) {
                    checkSurname = 1;
                }
            }
        });
    }

}
