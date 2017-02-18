package nikhi.xxhacks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


/**
 * Created by nikhi on 2/18/17.
 */
public class ReportListActivity extends AppCompatActivity {
    public User myUser;
    public Button nextButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportlist);
        myUser = (User)(getIntent().getExtras().getSerializable("myObject"));
        nextButton = (Button) findViewById(R.id.button);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hi");
                newScreen(v);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButtonWomen1:
                if (checked)
                    myUser.setPreference("women", 1);
                break;
            case R.id.radioButtonWomen2:
                if (checked)
                    myUser.setPreference("women", 2);
                break;
            case R.id.radioButtonWomen3:
                if (checked)
                    myUser.setPreference("women", 3);
                break;
            case R.id.radioButtonWomen4:
                if (checked)
                    myUser.setPreference("women", 4);
                break;
            case R.id.radioButtonWomen5:
                if (checked)
                    myUser.setPreference("women", 5);
                    break;
            case R.id.radioButtonCivil1:
                if (checked)
                    myUser.setPreference("civil", 1);
                break;
            case R.id.radioButtonCivil2:
                if (checked)
                    myUser.setPreference("civil", 2);
                break;
            case R.id.radioButtonCivil3:
                if (checked)
                    myUser.setPreference("civil", 3);
                break;
            case R.id.radioButtonCivil4:
                if (checked)
                    myUser.setPreference("civil", 4);
                break;
            case R.id.radioButtonCivil5:
                if (checked)
                    myUser.setPreference("civil", 5);
                    break;
            case R.id.radioButtonLGBT1:
                if (checked)
                    myUser.setPreference("LGBT", 1);
                break;
            case R.id.radioButtonLGBT2:
                if (checked)
                    myUser.setPreference("LGBT", 2);
                break;
            case R.id.radioButtonLGBT3:
                if (checked)
                    myUser.setPreference("LGBT", 3);
                break;
            case R.id.radioButtonLGBT4:
                if (checked)
                    myUser.setPreference("LGBT", 4);
                break;
            case R.id.radioButtonLGBT5:
                if (checked)
                    myUser.setPreference("LGBT", 5);
                break;
            case R.id.radioButtonMin1:
                if (checked)
                    myUser.setPreference("Min", 1);
                break;
            case R.id.radioButtonMin2:
                if (checked)
                    myUser.setPreference("Min", 2);
                break;
            case R.id.radioButtonMin3:
                if (checked)
                    myUser.setPreference("Min", 3);
                break;
            case R.id.radioButtonMin4:
                if (checked)
                    myUser.setPreference("Min", 4);
                break;
            case R.id.radioButtonMin5:
                if (checked)
                    myUser.setPreference("Min", 5);
                break;
            case R.id.radioButtonImm1:
                if (checked)
                    myUser.setPreference("Imm", 1);
                break;
            case R.id.radioButtonImm2:
                if (checked)
                    myUser.setPreference("Imm", 2);
                break;
            case R.id.radioButtonImm3:
                if (checked)
                    myUser.setPreference("Imm", 3);
                break;
            case R.id.radioButtonImm4:
                if (checked)
                    myUser.setPreference("Imm", 4);
                break;
            case R.id.radioButtonImm5:
                if (checked)
                    myUser.setPreference("Imm", 5);
                break;

            case R.id.radioButtonEdu1:
                if (checked)
                    myUser.setPreference("Edu", 1);
                break;
            case R.id.radioButtonEdu2:
                if (checked)
                    myUser.setPreference("Edu", 2);
                break;
            case R.id.radioButtonEdu3:
                if (checked)
                    myUser.setPreference("Edu", 3);
                break;
            case R.id.radioButtonEdu4:
                if (checked)
                    myUser.setPreference("Edu", 4);
                break;
            case R.id.radioButtonEdu5:
                if (checked)
                    myUser.setPreference("Edu", 5);
                break;
        }
    }
    public void newScreen (View view)
    {
        Intent startNewActivity = new Intent(this, PetitionActivity.class);
        startNewActivity.putExtra("myObject", myUser);
        startActivity(startNewActivity);
    }

}
