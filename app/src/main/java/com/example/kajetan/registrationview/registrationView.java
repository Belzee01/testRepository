package com.example.kajetan.registrationview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.example.kajetan.model.User;

public class registrationView extends AppCompatActivity {

    private User unregisteredUser;
    final EditText name = (EditText)findViewById(R.id.nameText);
    final EditText surname = (EditText)findViewById(R.id.surnameText);
    final EditText mail = (EditText)findViewById(R.id.mailText);
    final EditText password1 = (EditText)findViewById(R.id.passwordText);
    final EditText password2 = (EditText)findViewById(R.id.repeateText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_view);

    }

    public void onSubmitClick(View view){

        String Sname = name.getText().toString();
        String Ssurname = surname.getText().toString();
        String Smail = mail.getText().toString();
        String Spass1 = password1.getText().toString();
        String Spass2 = password2.getText().toString();

        if(!Spass1.equals(Spass2))
            return;

        unregisteredUser = new User(Sname, Ssurname, Smail, Spass1);
    }
}
