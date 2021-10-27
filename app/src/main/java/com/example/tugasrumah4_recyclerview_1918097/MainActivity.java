package com.example.tugasrumah4_recyclerview_1918097;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasrumah4_recyclerview_1918097.Mahasiswa;
import com.example.tugasrumah4_recyclerview_1918097.MahasiswaAdapter;
import com.example.tugasrumah4_recyclerview_1918097.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recycleview);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.profilku,"Muhammad Hasan Syuaibi ", "1918097", "2019"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.profile2,"Hasby", "1918097", "2019"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.profile3,"Muhammad Hasby", "1918097", "2019"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.profile4,"Syuaibi", "1918097", "2019"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.profile5,"Hasan", "1918097", "2019"));
    }
}
