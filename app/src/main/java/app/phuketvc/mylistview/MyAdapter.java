package app.phuketvc.mylistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private ArrayList<DataDao> list = new ArrayList<>();

    public void add(DataDao text) {
        list.add(text);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataDao getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //นำเข้า XML file เพื่อใช้แสดงผล
        View item = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_item, viewGroup, false);
        //ค้นหา textview ที่ใส่ไว้ใน xml ไฟล์ที่นำเข้ามา
        TextView textView = item.findViewById(R.id.textView);

        ImageView imageView = item.findViewById(R.id.imageView);

        //แสดงผลคำว่า hi
        textView.setText(list.get(position).getText());

        imageView.setImageResource(list.get(position).getImageId());

        return item;
    }
}
