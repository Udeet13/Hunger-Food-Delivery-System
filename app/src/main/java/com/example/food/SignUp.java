package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Retrofit;

public class SignUp extends AppCompatActivity {

    TextView login;
    Button create_account;

    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RetrofitInterface retrofitInterface;
    TextInputLayout full_name,email, mobile_number, create_password, confirm_password;


    @Override
    protected void onStop(){
        compositeDisposable.clear();
        super.onStop();
    }

    @Override
    public void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_signup);

        Retrofit retrofitClient = com.example.food.retrofitClient.getInstance();
        retrofitInterface = retrofitClient.create(RetrofitInterface.class);


        full_name = findViewById(R.id.full_name);
        email = findViewById(R.id.email);
        mobile_number = findViewById(R.id.mobile_number);
        create_password = findViewById(R.id.create_password);
        confirm_password = findViewById(R.id.confirm_password);

        final String name = this.full_name.getEditText().getText().toString();
        final String email = this.email.getEditText().getText().toString();
        final String mobile_number = this.mobile_number.getEditText().getText().toString();
        final String create_password = this.create_password.getEditText().getText().toString();
        final String confirm_password = this.confirm_password.getEditText().getText().toString();





        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this,LogIn.class));
            }
        });

        create_account = findViewById(R.id.create_acc);
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(SignUp.this,IntroActivity.class));
                Regist();

                //constraints

                if(TextUtils.isEmpty(name)) {
                    Toast.makeText(SignUp.this ,"Name Cannot be null",Toast.LENGTH_SHORT).show();
                    return;
                }



            }
        });

    }


    private void Regist() {




    }
}
