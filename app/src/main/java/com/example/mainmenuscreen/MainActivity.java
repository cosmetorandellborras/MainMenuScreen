package com.example.mainmenuscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mainmenuscreen.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] items = getResources().getStringArray(R.array.options);

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,R.layout.menu_item,items);
        binding.listViewMenu.setAdapter(adapt);

        binding.listViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view;
                String text = textView.getText().toString();
                if(text.equals(items[0])){
                    Toast.makeText(getApplicationContext(),"PLAY GAME SELECTED",Toast.LENGTH_SHORT).show();
                }else if (text.equals(items[1])){
                    Toast.makeText(getApplicationContext(),"VIEW SCORES SELECTED",Toast.LENGTH_SHORT).show();
                }else if (text.equals(items[2])){
                    Toast.makeText(getApplicationContext(),"SETTINGS SELECTED",Toast.LENGTH_SHORT).show();
                }else if (text.equals(items[3])){
                    Toast.makeText(getApplicationContext(),"HELP SELECTED",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}