package com.timtodo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    public boolean isAllbutton() {
        return allbutton;
    }

    public void setAllbutton(boolean allbutton) {
        this.allbutton = allbutton;
    }

    public boolean isCollegebutton() {
        return collegebutton;
    }

    public void setCollegebutton(boolean collegebutton) {
        this.collegebutton = collegebutton;
    }

    public static boolean isProbutton() {
        return probutton;
    }

    public static void setProbutton(boolean probutton) {
        HomeActivity.probutton = probutton;
    }

    public static boolean isHousebutton() {
        return housebutton;
    }

    public static void setHousebutton(boolean housebutton) {
        HomeActivity.housebutton = housebutton;
    }

    protected static boolean allbutton = false;
    protected static boolean collegebutton = false;
    protected static boolean probutton = false;
    protected static boolean housebutton = false;

//    RecyclerView recyclerView;
//    ImageView empty_imageview;
//    TextView no_data;
//
//    MyDatabaseHelper myDB;
//    ArrayList<String> book_id, book_title, book_author, book_pages, checkbox, list;
//    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        setAllbutton(false);
//        setCollegebutton(false);
//        setProbutton(false);
//        setHousebutton(false);


        final Button button = findViewById(R.id.collegeAssignButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setAllbutton(false);
                setCollegebutton(true);
                setProbutton(false);
                setHousebutton(false);
                Log.v("CollegeButtonPressed in HomeActivity", "" + isCollegebutton());

                Intent intent = new Intent (getBaseContext(), MainActivity.class);
                startActivity(intent);

            }
        });
        final Button button2 = findViewById(R.id.AllButton);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setAllbutton(true);
                setCollegebutton(false);
                setProbutton(false);
                setHousebutton(false);

                Log.v("AllButtonPressed in HomeActivity", "" + isAllbutton());

                Intent intent = new Intent (getBaseContext(), MainActivity.class);
                startActivity(intent);

            }
        });
        final Button button3 = findViewById(R.id.proWorkButton);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                setAllbutton(false);
                setCollegebutton(false);
                setProbutton(true);
                setHousebutton(false);
                Log.v("AllButtonPressed in HomeActivity", "" + isProbutton());

                Intent intent = new Intent (getBaseContext(), MainActivity.class);
                startActivity(intent);

            }
        });
        final Button button4 = findViewById(R.id.houseWorkButton);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                setAllbutton(false);
                setCollegebutton(false);
                setProbutton(false);
                setHousebutton(true);
                Log.v("AllButtonPressed in HomeActivity", "" + isHousebutton());

                Intent intent = new Intent (getBaseContext(), MainActivity.class);
                startActivity(intent);

            }
        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1) {
//            recreate();
//        }
//    }

//    void storeCollegeAssignInArrays() {
//        Cursor cursor = myDB.readOnlyCollegeAssign();
//        if (cursor.getCount() == 0) {
//            empty_imageview.setVisibility(View.VISIBLE);
//            no_data.setVisibility(View.VISIBLE);
//        }
//        else {
//            while (cursor.moveToNext()) {
//                book_id.add(cursor.getString(0));
//                book_title.add(cursor.getString(1));
//                book_author.add(cursor.getString(2));
//                book_pages.add(cursor.getString(3));
//                checkbox.add(cursor.getString(4));
//                list.add(cursor.getString(5));
//            }
//            empty_imageview.setVisibility(View.GONE);
//            no_data.setVisibility(View.GONE);
//        }
//    }
}