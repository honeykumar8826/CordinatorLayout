package com.coordinator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class CollapseToolbarActivity extends AppCompatActivity {
private RecyclerView studentListRecycler;
private List<StudentModal> studentModalList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapse_toolbar);
        /* initialize the id*/
        inItId();
        /*add the data in the list*/
        addStudentInfoData();
        /*set the adapter on recycle view*/
        addRecyclerView();
    }

    private void addRecyclerView() {
        Log.i(UserDefinedConstant.TAG, "addRecyclerView: "+studentModalList.size());
        studentListRecycler.setLayoutManager(new LinearLayoutManager(CollapseToolbarActivity.this));
        StudentInfoAdapter studentInfoAdapter = new StudentInfoAdapter(studentModalList);
        studentListRecycler.setAdapter(studentInfoAdapter);
    }

    private void addStudentInfoData() {
        studentModalList = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            StudentModal studentModals = new StudentModal("Harish"+i,"M"+i);
            studentModalList.add(studentModals);
        }

    }

    private void inItId() {
        studentListRecycler = findViewById(R.id.studentList_recycler);
    }
}
