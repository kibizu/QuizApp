package com.example.android.quizapp;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizapp.databinding.ActivityMainBinding;
import com.example.android.quizapp.databinding.CustomToastBinding;
import com.example.android.quizapp.databinding.ResultToastBinding;

/**
 *This app is a quiz about the Harry Potter's world
 *
 */



public class MainActivity extends AppCompatActivity {


    private int result;

    private static final String CHECKED1 = "checked1";
    private boolean checked1;
    private static final String ID_RADIO_BUTTON1 = "idRadioButton1";
    private int idRadioButton1;
    private RadioButton radioButton1;

    private static final String CHECKED2 = "checked2";
    private boolean checked2;
    private static final String ID_RADIO_BUTTON2 = "idRadioButton2";
    private int idRadioButton2;
    private RadioButton radioButton2;

    private String namePrincipal;

    private static final String CHECKED4 = "checked4";
    private boolean checked4;

    private static final String WIT_CHECK_VALUE = "witCheckValue";
    private boolean witCheckValue = false;

    private static final String INTELL_CHECK_VALUE = "intellCheckValue";
    private boolean intellCheckValue = false;

    private static final String CUNNING_CHECK_VALUE = "cunningCheckValue";
    private boolean cunningCheckValue = false;

    private static final String LOYALTY_CHECK_VALUE = "loyaltyCheckValue";
    private boolean loyaltyCheckValue = false;

    private CheckBox witCheck;
    private CheckBox intellCheck;
    private CheckBox cunningCheck;
    private CheckBox loyaltyCheck;

    private static final String CHECKED5 = "checked5";
    private boolean checked5;
    private static final String ID_RADIO_BUTTON5 = "idRadioButton5";
    private int idRadioButton5;
    RadioButton radioButton5;

    private static final String CHECKED6 = "checked6";
    private boolean checked6;
    private static final String ID_RADIO_BUTTON6 = "idRadioButton6";
    private int idRadioButton6;
    RadioButton radioButton6;

    private static final String CHECKED8 = "checked8";
    private boolean checked8;
    private static final String ID_RADIO_BUTTON8 = "idRadioButton8";
    private int idRadioButton8;
    RadioButton radioButton8;

    private String nameCourier;

    private int incomplete;

    ActivityMainBinding binding;
    CustomToastBinding customToastBinding;
    ResultToastBinding resultToastBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(Bundle.EMPTY);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        // If we have a saved state then we can restore it now
        if (savedInstanceState != null) {

            checked1 = savedInstanceState.getBoolean(CHECKED1,true);
            idRadioButton1 = savedInstanceState.getInt(ID_RADIO_BUTTON1,0);

            checked2 = savedInstanceState.getBoolean(CHECKED2,true);
            idRadioButton2 = savedInstanceState.getInt(ID_RADIO_BUTTON2,0);

            checked4 = savedInstanceState.getBoolean(CHECKED4, true);
            witCheckValue = savedInstanceState.getBoolean(WIT_CHECK_VALUE, false);
            intellCheckValue = savedInstanceState.getBoolean(INTELL_CHECK_VALUE, false);
            cunningCheckValue = savedInstanceState.getBoolean(CUNNING_CHECK_VALUE, false);
            loyaltyCheckValue = savedInstanceState.getBoolean(LOYALTY_CHECK_VALUE, false);

            checked5 = savedInstanceState.getBoolean(CHECKED5,true);
            idRadioButton5 = savedInstanceState.getInt(ID_RADIO_BUTTON5,0);

            checked6 = savedInstanceState.getBoolean(CHECKED6,true);
            idRadioButton6 = savedInstanceState.getInt(ID_RADIO_BUTTON6,0);

            checked8 = savedInstanceState.getBoolean(CHECKED8,true);
            idRadioButton8 = savedInstanceState.getInt(ID_RADIO_BUTTON8,0);
        }

        if (checked1) {

            radioButton1 = (RadioButton) findViewById(idRadioButton1);
            radioButton1.setChecked(true);

        }

        if (checked2) {

            radioButton2 = (RadioButton) findViewById(idRadioButton2);
            radioButton2.setChecked(true);

        }

        binding.checkboxWit.setChecked(witCheckValue);
        binding.checkboxIntelligence.setChecked(intellCheckValue);
        binding.checkboxCunning.setChecked(cunningCheckValue);
        binding.checkboxLoyalty.setChecked(loyaltyCheckValue);

        if (checked5) {

            radioButton5 = (RadioButton) findViewById(idRadioButton5);
            radioButton5.setChecked(true);

        }

        if (checked6) {

            radioButton6 = (RadioButton) findViewById(idRadioButton6);
            radioButton6.setChecked(true);

        }

        if (checked8) {

            radioButton8 = (RadioButton) findViewById(idRadioButton8);
            radioButton8.setChecked(true);

        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putBoolean(CHECKED1,checked1);
        outState.putInt(ID_RADIO_BUTTON1, idRadioButton1);

        outState.putBoolean(CHECKED2,checked2);
        outState.putInt(ID_RADIO_BUTTON2, idRadioButton2);

        outState.putBoolean(CHECKED4, checked4);
        outState.putBoolean(WIT_CHECK_VALUE, witCheckValue);
        outState.putBoolean(INTELL_CHECK_VALUE, intellCheckValue);
        outState.putBoolean(LOYALTY_CHECK_VALUE, loyaltyCheckValue);
        outState.putBoolean(CUNNING_CHECK_VALUE, cunningCheckValue);

        outState.putBoolean(CHECKED5,checked5);
        outState.putInt(ID_RADIO_BUTTON5, idRadioButton5);

        outState.putBoolean(CHECKED6,checked6);
        outState.putInt(ID_RADIO_BUTTON6, idRadioButton6);

        outState.putBoolean(CHECKED8,checked8);
        outState.putInt(ID_RADIO_BUTTON8, idRadioButton8);

    }

    /**
     * This method is the onclick method of the first radio group
     */
    public void firstAnswerCheck(View view) {
        // Is the button now checked?

        checked1 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_badger:
                if (checked1) {
                    idRadioButton1 = R.id.radio_badger;
                    break;
                }

            //** This is the correct answer**//
            case R.id.radio_lion:
                if (checked1) {
                    idRadioButton1 = R.id.radio_lion;
                    break;
                }
            case R.id.radio_eagle:
                if (checked1) {
                    idRadioButton1 = R.id.radio_eagle;
                    break;
                }
            case R.id.radio_snake:
                if (checked1) {
                    idRadioButton1= R.id.radio_snake;
                    break;
                }
        }

    }

    /**
     *This method is the onclick method of the second Radio Group
     */
    public void secondAnswerCheck(View view) {
        // Is the button now checked?
        checked2 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_sefian:
                if (checked2) {
                    idRadioButton2 = R.id.radio_sefian;
                    break;
                }
            case R.id.radio_sesean:
                if (checked2) {
                    idRadioButton2 = R.id.radio_sesean;
                    break;
                }
            //* This is the correct answer *//
            case R.id.radio_sethan:
                if (checked2) {
                    idRadioButton2 = R.id.radio_sethan;
                    break;
                }
            case R.id.radio_sefoan:
                if (checked2) {
                    idRadioButton2 = R.id.radio_sefoan;
                    break;
                }
        }
    }

    /**
     * This method is the onclick method of the check boxes in the fourth question
     */
    public void fourthAnswerCheck(View view) {
        // Is the view now checked?
        checked4 = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            //** This is the correct answer**//
            case R.id.checkbox_wit:
                if (checked4) {
                    witCheckValue = true;
                    break;
                }
            //** This is the correct answer**//
            case R.id.checkbox_intelligence:
                if (checked4) {
                    intellCheckValue = true;
                    break;
                }
            case R.id.checkbox_cunning:
                if (checked4) {
                    cunningCheckValue = true;
                    break;
                }
            case R.id.checkbox_loyalty:
                if (checked4) {
                    loyaltyCheckValue = true;
                    break;
                }

        }

        return;

    }

    /**
     * This method is the onclick method of the radio group of the fifth question
     */
    public void fifthAnswerCheck(View view) {
        // Is the button now checked?
        checked5 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            //** This is the correct answer**//
            case R.id.radio_accio:
                if (checked5) {
                    idRadioButton5 = R.id.radio_accio;
                    break;
                }
            case R.id.radio_anapneo:
                if (checked5) {
                    idRadioButton5 = R.id.radio_anapneo;
                    break;
                }
            case R.id.radio_aparecium:
                if (checked5) {
                    idRadioButton5 = R.id.radio_aparecium;
                    break;
                }
            case R.id.radio_avis:
                if (checked5) {
                    idRadioButton5 = R.id.radio_avis;
                    break;
                }
        }
    }

    /**
     * This method is the onclick method of the radio group of the sixth question
     */
    public void sixthAnswerCheck(View view) {
        // Is the button now checked?
        checked6 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {

            case R.id.radio_green:
                if (checked6) {
                    idRadioButton6 = R.id.radio_green;
                    break;
                }
            //** This is the correct answer**//
            case R.id.radio_scarlet:
                if (checked6) {
                    idRadioButton6 = R.id.radio_scarlet;
                    break;
                }
            case R.id.radio_indigo:
                if (checked6) {
                    idRadioButton6 = R.id.radio_indigo;
                    break;
                }
            case R.id.radio_emerald:
                if (checked6) {
                    idRadioButton6 = R.id.radio_emerald;
                    break;
                }
        }

    }

    /**
     * This method is the onclick method of the radio group of the eighth question
     */
    public void eighthAnswerCheck(View view) {
        // Is the button now checked?
        checked8 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            //** This is the correct answer**//
            case R.id.radio_whomping:
                if (checked8) {
                    idRadioButton8 = R.id.radio_whomping;
                    break;
                }
            case R.id.radio_express:
                if (checked8) {
                    idRadioButton8 = R.id.radio_express;
                    break;
                }
            case R.id.radio_tower:
                if (checked8) {
                    idRadioButton8 = R.id.radio_tower;
                    break;
                }
            case R.id.radio_lake:
                if (checked8) {
                    idRadioButton8 = R.id.radio_lake;
                    break;
                }
        }
    }

    /**
     * This method checks all the answers and if the answer is correct, add 1 to result
     */
    private int checkQuest (){
        incomplete = 0;

        if (!checked1) {

            createToastMessage(getString(R.string.errorQuest1));
            incomplete = 1;
            return result;

        } else if (idRadioButton1 == R.id.radio_lion){

            result += 1;

        }

        if (!checked2) {

            createToastMessage(getString(R.string.errorQuest2));
            incomplete = 1;
            return result;

        } else if (idRadioButton2 == R.id.radio_sethan){

            result += 1;

        }

        namePrincipal = binding.namePrincipalInput.getText().toString();

        if (namePrincipal.matches("")) {

            createToastMessage(getString(R.string.errorQuest3));
            incomplete = 1;
            return result;

        }

        if (namePrincipal.toLowerCase().contains(getString(R.string.dumbledore)) ){

            result += 1;

        }

        if (!checked4) {

            createToastMessage(getString(R.string.errorQuest4));
            incomplete = 1;
            return result;

        } else if (witCheckValue & intellCheckValue & !cunningCheckValue & !loyaltyCheckValue){

            result +=1;

        }

        if (!checked5) {

            createToastMessage(getString(R.string.errorQuest5));
            incomplete = 1;
            return result;

        } else if (idRadioButton5 == R.id.radio_accio) {

            result += 1;

        }

        if (!checked6) {

            createToastMessage(getString(R.string.errorQuest6));
            incomplete = 1;
            return result;

        } else if (idRadioButton6 == R.id.radio_scarlet) {

            result += 1;

        }

        nameCourier = binding.nameViaInput.getText().toString();

        if (nameCourier.matches("")) {

            createToastMessage(getString(R.string.errorQuest7));
            incomplete = 1;
            return result;

        }

        if (nameCourier.toLowerCase().contains(getString(R.string.owl)) ){

            result += 1;
        }

        if (!checked8) {

            createToastMessage(getString(R.string.errorQuest8));
            incomplete = 1;
            return result;

        } else if (idRadioButton8 == R.id.radio_whomping) {

            result += 1;
        }
        return result;
    }

    /**
     *
     * @param textMessage is the message of the result toast message
     * @param imageId is the resource id of the image, if there is, of the result toast message
     */
    private void createResultToastMessage (String textMessage, int imageId) {

        Context context=getApplicationContext();
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.result_toast,
                (ViewGroup) findViewById(R.id.result_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);

        ImageView image = (ImageView) layout.findViewById(R.id.imagetoast);

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        text.setText(textMessage);
        image.setImageResource(imageId);
        toast.show();

        return;

    }

    /**
     *
     * @param textMessage is the message of the custom toast message
     */
    private void createToastMessage (String textMessage) {

        Context context=getApplicationContext();
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        text.setText(textMessage);
        toast.show();

        return;

    }

    /**
     * This method reset all the variables and all views of the quiz
     */
    private void resetFields() {
        RadioGroup radioGroup;
        EditText editText;
        CheckBox checkBox;


        binding.radiogroup1.clearCheck();
        binding.radiogroup2.clearCheck();
        binding.namePrincipalInput.setText("");
        binding.checkboxWit.setChecked(false);
        binding.checkboxCunning.setChecked(false);
        binding.checkboxLoyalty.setChecked(false);
        binding.checkboxIntelligence.setChecked(false);
        binding.radiogroup5.clearCheck();
        binding.radiogroup6.clearCheck();
        binding.radiogroup8.clearCheck();
        binding.nameViaInput.setText("");

        checked1 = false;
        idRadioButton1 = 0;
        checked2 = false;
        idRadioButton2 = 0;
        checked4 = false;
        intellCheckValue = false;
        witCheckValue = false;
        cunningCheckValue = false;
        loyaltyCheckValue = false;
        checked5 = false;
        idRadioButton5 = 0;
        checked6 = false;
        idRadioButton6 = 0;
        checked8 = false;
        idRadioButton8 = 0;
        incomplete = 0;
        result = 0;
        return;
    }

    /**
     * This method is called when the Mischief Managed button is clicked.
     */
    public void submitAnswers(View view) {

        checkQuest();

        if (result <= 3){

            createResultToastMessage(getString(R.string.result) + result + " " + getString(R.string.bad_result), R.drawable.piton);

        } else if (result <= 7 & result > 3) {

            createResultToastMessage(getString(R.string.result) + result + " " + getString(R.string.mid_result),R.drawable.piton1);

        } else  {

            createResultToastMessage(getString(R.string.result) + result + getString(R.string.good_result),R.drawable.silente);

        }
        if (incomplete == 0) {

            resetFields();

        } else {

            result = 0;

        }
        return;
    }
}
