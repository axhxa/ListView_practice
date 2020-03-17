package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    List<Map<String,Object>> list;
    String text_list[]={
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"
    };

    int image_list[]={
            R.drawable.emoji_kids_01,
            R.drawable.emoji_kids_02,
            R.drawable.emoji_kids_03,
            R.drawable.emoji_kids_04,
            R.drawable.emoji_kids_05,
            R.drawable.emoji_kids_06,
            R.drawable.emoji_kids_07,
            R.drawable.emoji_kids_08,
            R.drawable.emoji_kids_09,
            R.drawable.emoji_kids_10,
            R.drawable.emoji_kids_11,
            R.drawable.emoji_kids_12,
            R.drawable.emoji_kids_13,
            R.drawable.emoji_kids_14,
            R.drawable.emoji_kids_15,
            R.drawable.emoji_kids_16,
            R.drawable.emoji_kids_17,
            R.drawable.emoji_kids_18,
            R.drawable.emoji_kids_19,
            R.drawable.emoji_kids_20,
            R.drawable.emoji_kids_21,
            R.drawable.emoji_kids_22,
            R.drawable.emoji_kids_23,
            R.drawable.emoji_kids_24,
            R.drawable.emoji_kids_25,
            R.drawable.emoji_kids_26,
            R.drawable.emoji_kids_27,
            R.drawable.emoji_kids_28,
            R.drawable.emoji_kids_29,
            R.drawable.emoji_kids_30,
            R.drawable.emoji_kids_31,
            R.drawable.emoji_kids_32,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.list_view);
        list=new ArrayList<>();
        for(int i=0;i<text_list.length;i++){
            Map <String,Object> map=new HashMap<>();
            map.put("text",text_list[i]);
            map.put("image",image_list[i]);
            list.add(map);
        }
        String from[]={"text","image"};
        int to[]={R.id.text,R.id.image};
        SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.sample_my_view,from,to);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),Info.class);
                Bundle bundle=new Bundle();
                bundle.putInt("img",image_list[position]);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}
