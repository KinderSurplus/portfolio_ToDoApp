package com.timtodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddActivity extends AppCompatActivity {

    EditText title_input, author_input, checkbox_input;
    Button add_button;
    Spinner pages_input, list_input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        // Spinner click listener
//
        pages_input = (Spinner) findViewById(R.id.spinner);
        pages_input.setOnItemSelectedListener(pages_input.getOnItemSelectedListener());

        //Kinda's listspinner listener
        list_input = (Spinner) findViewById(R.id.listspinner);
        list_input.setOnItemSelectedListener(list_input.getOnItemSelectedListener());

        // Creating adapter for spinner
        ArrayAdapter<CharSequence> dataAdapter = ArrayAdapter.createFromResource(this,
                R.array.priorityLevels, android.R.layout.simple_spinner_item);

        // Creating adapter for listspinner
        ArrayAdapter<CharSequence> listdataAdapter = ArrayAdapter.createFromResource(this,
                R.array.chooseList, android.R.layout.simple_spinner_item);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Drop down layout style - list view with radio button
        listdataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        pages_input.setAdapter(dataAdapter);

        // attaching list data adapter to list spinner
        list_input.setAdapter(listdataAdapter);

        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
//        pages_input = findViewById(R.id.pages_input);
        pages_input = findViewById(R.id.spinner);
        add_button = findViewById(R.id.add_button);
        checkbox_input = findViewById(R.id.checkbox_input);
        list_input = findViewById(R.id.listspinner);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim(),
                        pages_input.getSelectedItemPosition(),
                        checkbox_input.getText().toString().trim(),
                        list_input.getSelectedItemPosition());


                        System.out.println(pages_input.getSelectedItemPosition());
//                        Integer.valueOf(pages_input.getText().toString().trim()));

            }
        });

    }
}