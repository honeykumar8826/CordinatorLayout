package com.coordinator;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentInfoAdapter extends RecyclerView.Adapter<StudentInfoAdapter.StudentViewHolder> {
private String TAG ="tag";
    private List<StudentModal> recordList;
    public StudentInfoAdapter(List<StudentModal> recordList) {
        this.recordList = recordList; }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_user_info,viewGroup,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        StudentModal studentModal = recordList.get(i);
        studentViewHolder.textViewName.setText(""+studentModal.getUserName());
        studentViewHolder.textViewCourse.setText(""+studentModal.getUserCourse());
    }

    @Override
    public int getItemCount() {
        Log.i(TAG, "getItemCount: "+recordList.size());
        return recordList.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder
    {
        TextView textViewName;
        private TextView textViewCourse;
        private StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.tv_name_value);
            textViewCourse = itemView.findViewById(R.id.tv_course_value);
        }
    }
}
