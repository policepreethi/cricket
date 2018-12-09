package com.example.keerthipreethi.dictionary_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {

    int pos=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        Intent intent=getIntent();
        pos=intent.getExtras().getInt("Position");

        final CustomAdapter adapter=new CustomAdapter(this);
        final ImageView img=(ImageView)findViewById(R.id.imgid);
        final TextView name=(TextView)findViewById(R.id.name);
        final TextView meaning=(TextView)findViewById(R.id.meaning);

        img.setImageResource(adapter.image[pos]);
        name.setText(adapter.name[pos]);
        meaning.setText(adapter.meaning[pos]);

        Button btnnext=(Button)findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position= pos+1;
                img.setImageResource(adapter.image[position]);
                name.setText("Name" + adapter.name[position]);
                meaning.setText("Meaning" + adapter.meaning[position]);

                if (!(position>=adapter.getCount()-1))
                {
                    pos+=1;
                }
                else
                {
                    pos=-1;
                }
            }
        });

    }
}
