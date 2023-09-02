package app.phuketvc.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int imageList[] = {R.mipmap.cat1, R.mipmap.cat2, R.mipmap.cat3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyAdapter myAdapter = new MyAdapter();

        //ลูป for สำหรับเพิ่มข้อมูล
        for (int i = 0; i < 20; i++) {
            DataDao dataDao = new DataDao();
            dataDao.setText("index : " + i);
            dataDao.setImageId(getRandomImage(imageList));
            myAdapter.add(dataDao);
        }
        GridView listView = findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

    }

    public int getRandomImage(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

}