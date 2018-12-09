package com.example.keerthipreethi.dictionary_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context c;
    String[]name={"admiration",
            "beauty", "colourfull","determination","eligible","fantasy","glory","happy", "independent","joy"};
    String [] meaning={"to admire or follow someone","a combination of qualities, such as shape, colour, or form, that pleases the aesthetic senses, especially the sight."
            ,"having much or varied colour; bright."
            ,"firmness of purpose.","having the right to do"," activity of imagining impossible","magnificence or great beauty.","showing pleasure",
            " capable of thinking or acting for oneself.",
            " a feeling of great pleasure and happiness"};
    int [] image={R.drawable.admire,R.drawable.beauty,
    R.drawable.colourful,R.drawable.determoination,
    R.drawable.e,R.drawable.fantasy,
            R.drawable.g,R.drawable.happy,
            R.drawable.independent,R.drawable.joy};

    public CustomAdapter(Context ctx)
    {
        this.c=ctx;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return name[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.words,null);

        }
        TextView nametxt=(TextView)convertView.findViewById(R.id.name);
        TextView meaningtxt=(TextView)convertView.findViewById(R.id.meaning);
        ImageView img=(ImageView)convertView.findViewById(R.id.imgid);

        nametxt.setText(name[position]);
        meaningtxt.setText(meaning[position]);
        img.setImageResource(image[position]);

        return convertView;
    }
}
