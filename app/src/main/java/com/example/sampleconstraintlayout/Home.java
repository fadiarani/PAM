package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class Home extends AppCompatActivity  {

    private ListView list;

    private  ListViewAdapter adapter;

    String[] listNama;

    public static ArrayList<ClassNama> classNamaArrayList = new ArrayList<ClassNama>();

    Bundle bundle = new Bundle();

    Intent intent;

    protected void onCreate Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listNama = new String[]{"Rani", "Fadia", "Tasya",
                "Rayka", "Arya", "Vadillah", "Aya", "Adel",
                "Lina", "Lisa"};

        list = findViewById(R.id.listKontak);

        classNamaArrayList = new ArrayList<>();

        for (int i = 0; i < listNama.length; i++) {
            ClassNama classNama = new ClassNama(listNama[i]);

            classNamaArrayList.add(classNama);
        }

        adapter = new ListViewAdapter(this);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama = classNamaArrayList.get(position).getNama();
                bundle.putString("a", nama.trim());

                PopupMenu pm = new PopupMenu((getApplicationContext(),view);

                pm.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) Home.this);

                pm.inflate(R.menu.popup_menu);

                pm.show();
            }
        });
    }

    @Override
public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.mnview:
                intent = new Intent(getApplicationContext(), LihatData.class);
                intent.putExtras((bundle));
                startActivity(intent);
                break;
            case R.id.mnedit:
                Toast.makeText(getApplicationContext(), "Ini Untuk Edit Kontak Ya!!!", Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
