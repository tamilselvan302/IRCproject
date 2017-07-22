package com.example.home.myapplicationx1;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;


public class Main3Activity extends AppCompatActivity {



    Button save_button2;
    Button submit_button;


    RadioGroup rg;
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;
    RadioGroup rg4;
    RadioGroup rg5;

    RadioGroup rg6;
    RadioGroup rg7;
    RadioGroup rg8;
    RadioGroup rg9;
    RadioGroup rg10;
    RadioGroup rg11;
    RadioGroup rg12;
    RadioGroup rg13;
    RadioGroup rg14;
    RadioGroup rg15;
    RadioGroup rg16;



    RadioButton rgb;


    Boolean saved=false;


    private EditText mNameField6;
    private EditText mNameField7;

    FirebaseAuth authoriser;
    FirebaseUser user;

    private DatabaseReference reference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        authoriser = FirebaseAuth.getInstance();
        user = authoriser.getCurrentUser();

        save_button2 = (Button)findViewById(R.id.save_button2);
        submit_button = (Button)findViewById(R.id.submit_button);


        final SharedPreferences Details;
        Details = getSharedPreferences("Details",MODE_PRIVATE);


        mNameField6 = (EditText) findViewById(R.id.other_type_of_weather_entry);
        mNameField7 = (EditText) findViewById(R.id.other_type_of_collision_entry);

        reference = FirebaseDatabase.getInstance().getReference();


        rg = (RadioGroup) findViewById(R.id.type_of_area);
        rg1 = (RadioGroup) findViewById(R.id.accident_type);
        rg2 = (RadioGroup) findViewById(R.id.property_damage);
        rg3 = (RadioGroup) findViewById(R.id.type_of_weather);
        rg4 = (RadioGroup) findViewById(R.id.type_of_collision);
        rg5 = (RadioGroup) findViewById(R.id.hit_and_run);

        rg6 = (RadioGroup) findViewById(R.id.road_type);
        rg7 = (RadioGroup) findViewById(R.id.lanes);
        rg8 = (RadioGroup) findViewById(R.id.surface_condition);
        rg9 = (RadioGroup) findViewById(R.id.physical_divider);
        rg10 = (RadioGroup) findViewById(R.id.speed_limit);
        rg11 = (RadioGroup) findViewById(R.id.ongoing_construction);
        rg12 = (RadioGroup) findViewById(R.id.visibility);
        rg13 = (RadioGroup) findViewById(R.id.road_features);
        rg14 = (RadioGroup) findViewById(R.id.road_junction);
        rg15 = (RadioGroup) findViewById(R.id.type_of_traffic_control);
        rg16 = (RadioGroup) findViewById(R.id.pedestrian_involved);





        save_button2.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {

                        final SharedPreferences.Editor ed = Details.edit();


                        int selectedId = rg.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        String name= rgb.getText().toString().trim();
                        ed.putString("type_of_area",name);




                        selectedId = rg1.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("accident_type",name);




                        selectedId = rg2.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("property_damage",name);




                        selectedId = rg3.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        if(name=="other")
                        {
                            ed.putString("type_of_weather",mNameField6.getText().toString().trim());
                        }
                        else {
                            ed.putString("type_of_weather",name);

                        }




                        selectedId = rg4.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        if(name=="other")
                        {
                            ed.putString("type_of_collision",mNameField7.getText().toString().trim());
                        }
                        else {
                            ed.putString("type_of_collision",name);

                        }



                        selectedId = rg5.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("hit_and_run",name);




                        selectedId = rg11.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("ongoing_construction",name);




                        selectedId = rg6.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("road_type",name);





                        selectedId = rg7.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("lanes",name);




                        selectedId = rg8.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("surface_condition",name);




                        selectedId = rg9.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("physical_divider",name);




                        selectedId = rg10.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("speed_limit",name);



                        selectedId = rg12.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("visibility",name);




                        selectedId = rg13.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("road_features",name);




                        selectedId = rg14.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("road_junction",name);




                        selectedId = rg15.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("traffic_control",name);




                        selectedId = rg16.getCheckedRadioButtonId();
                        rgb = (RadioButton) findViewById(selectedId);
                        name= rgb.getText().toString().trim();
                        ed.putString("pedestrian",name);
                        ed.commit();

                        Toast.makeText(getApplicationContext(),"submitted",Toast.LENGTH_SHORT).show();



/*
                        // to access any key value pair
                        // String data = Details.getString("key name");
                        Map<String,?> keys = Details.getAll();



                        for (Map.Entry<String,?> entry : keys.entrySet()){
                            Log.d("map values",entry.getKey() + ": " +
                                    entry.getValue().toString());
                            Toast.makeText(getApplicationContext(),entry.getKey()+":"+entry.getValue(),Toast.LENGTH_SHORT).show();
                        }
*/

                        //write into firebase

                        saved = true;



                    }
                }
        );

        submit_button.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                          if(saved == true){
                                DatabaseReference chile;
                                Map<String,?> keys = Details.getAll();
                                for (Map.Entry<String,?> entry : keys.entrySet()){
                                    chile = reference.child("FIRs").child(Details.getString("fir_no",null)).child(entry.getKey());
                                    chile.setValue(entry.getValue());
                                }

                                chile = reference.child("FIRs").child(Details.getString("fir_no",null)).child("filer");
                                chile.setValue(user.getUid());

                                chile = reference.child("Users").child(user.getUid()).child(Details.getString("fir_no",null));
                                chile.setValue("yes");

                                Toast.makeText(getApplicationContext(),"new entry",Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                                startActivity(intent);
                          }
                          else
                              Toast.makeText(getApplicationContext(),"not saved click the save button",Toast.LENGTH_SHORT).show();
                    }
                }
        );



    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }

}

