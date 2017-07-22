package com.example.home.myapplicationx1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Main2Activity extends AppCompatActivity {



    Button next_button,gps_button,save_button;







    private DatabaseReference mDatabase;

    private EditText mNameField;
    private EditText mNameField1;
    private EditText mNameField2;
    private EditText mNameField3;
    private EditText mNameField4;
    private EditText mNameField5;


    private EditText mNameField8;
    private EditText mNameField9;
    private EditText mNameField10;
    private EditText mNameField11;


    boolean saved = false;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final SharedPreferences Details;
        Details = getSharedPreferences("Details",MODE_PRIVATE);



        next_button = (Button)findViewById(R.id.next_button2);
        gps_button = (Button)findViewById(R.id.get_location);
        save_button = (Button)findViewById(R.id.save_button);





        mNameField = (EditText) findViewById(R.id.fir_entry);

        mNameField1 = (EditText) findViewById(R.id.time_entry);
        mNameField2 = (EditText) findViewById(R.id.police_station_entry);
        mNameField3 = (EditText) findViewById(R.id.no_of_non_motor_vehicles);
        mNameField4 = (EditText) findViewById(R.id.no_of_motor_vehicles);
        mNameField5 = (EditText) findViewById(R.id.no_of_pedestrians);



        mNameField8 = (EditText) findViewById(R.id.road_name_entry);
        mNameField9 = (EditText) findViewById(R.id.road_no_entry);
        mNameField10 = (EditText) findViewById(R.id.landmark_entry);
        mNameField11 = (EditText) findViewById(R.id.road_chainage_entry);



        mDatabase = FirebaseDatabase.getInstance().getReference();






        save_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {

                        final SharedPreferences.Editor ed = Details.edit();


                        //keyname = "fir_no" value = "mNameField.getText().toString()"
                        if(!TextUtils.isEmpty(mNameField.getText().toString())) {
                            ed.putString("fir_no",mNameField.getText().toString());
                        }
                        else {
                            ed.putString("fir_no","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField1.getText().toString())){
                            ed.putString("time",mNameField1.getText().toString());
                        }
                        else {
                            ed.putString("time","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField2.getText().toString()))
                        {
                            ed.putString("police_station",mNameField2.getText().toString());
                        }
                        else {
                            ed.putString("police_station","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField3.getText().toString()))
                        {
                            ed.putString("non_motor_vehicles",mNameField3.getText().toString());
                        }
                        else {
                            ed.putString("non_motor_vehicles","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField4.getText().toString()))
                        {
                            ed.putString("motor_vehicles",mNameField4.getText().toString());
                        }
                        else {
                            ed.putString("motor_vehicles","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField5.getText().toString()))
                        {
                            ed.putString("pedestrians",mNameField5.getText().toString());
                        }
                        else {
                            ed.putString("pedestrians","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField8.getText().toString()))
                        {
                            ed.putString("road_name",mNameField8.getText().toString());
                        }
                        else {
                            ed.putString("road_name","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField9.getText().toString()))
                        {
                            ed.putString("road_no",mNameField9.getText().toString());
                        }
                        else {
                            ed.putString("road_no","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField10.getText().toString()))
                        {
                            ed.putString("landmark",mNameField10.getText().toString());
                        }
                        else {
                            ed.putString("landmark","NONE");
                        }

                        if(!TextUtils.isEmpty(mNameField11.getText().toString()))
                        {
                            ed.putString("chainage",mNameField11.getText().toString());
                        }
                        else {
                            ed.putString("chainage","NONE");
                        }
                        ed.commit();
                        saved =true;

                    }
                }
        );

            next_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        if(saved){
                            Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                            startActivity(intent);

                        }
                        else
                            Toast.makeText(getApplicationContext(),"not saved",Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }


}

