package com.aserrano.exerciseslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    private static final String[] items ={"lorem", "ipsum", "dolor",
            "sit", "amet", "consectetuer", "adipiscing", "elit",
            "morbi", "vel", "ligula", "vitae", "arcu", "aliquet",
            "mollis", "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};
    private TextView selector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.row, R.id.textViewRow, items));

        selector = findViewById(R.id.selection);
    }

    public void onListItemClick(ListView parent, View v, int position, long id){
        selector.setText(items[position]);
    }


}