package com.example.adrianreda.zadanie5;

        import android.content.Context;
        import android.content.Intent;
        import android.content.res.Resources;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private void initResources(){
        Resources res = getResources();
        lang = res.getStringArray(R.array.telefony);
    }

    private String[] lang;

    private ListView lv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.langagues);
        initResources();
        initLanguagesListView();
    }
    private void initLanguagesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1, lang));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                Context context;
                context = getApplicationContext();
                if(lang[pos].equals("Samsung Galaxy S6")) {
                    Intent intent = new Intent(context, com.example.adrianreda.zadanie5.gals6.class);
                    startActivity(intent);
                }else if(lang[pos].equals("Samsung Galaxy S7")){
                    Intent intent = new Intent(context, com.example.adrianreda.zadanie5.gals7.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(context, com.example.adrianreda.zadanie5.gals8.class);
                    startActivity(intent);
                }

            }
        });

    }

}
