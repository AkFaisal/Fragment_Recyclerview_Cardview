package com.example.fragmentrecyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.fragmentrecyclerviewcardview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
    int []flags={R.drawable.bd,R.drawable.india,R.drawable.pakistan,R.drawable.bhutan,R.drawable.srilanka,R.drawable.japan};
    String[] titles;
    String[] details;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        titles=getResources().getStringArray(R.array.CountryNames);
        details=getResources().getStringArray(R.array.CountryDetails);

        recyclerViewAdapter=new RecyclerViewAdapter(this,titles,details,flags);
        binding.recylerViewID.setAdapter(recyclerViewAdapter);
        binding.recylerViewID.setLayoutManager(new LinearLayoutManager(this));







    }
}
