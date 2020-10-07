package in.bitcode.listview3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CityAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<City> mListCities;

    public CityAdapter(Context context, ArrayList<City> listCities) {
        this.mContext = context;
        mListCities = listCities;
    }

    @Override
    public int getCount() {
        if (mListCities == null) {
            return 0;
        }
        return mListCities.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CityView cityView;

        if (convertView == null) {
            cityView = new CityView(mContext);
        }
        else {
            cityView = (CityView)convertView;
        }

        cityView.setCity(mListCities.get(position));

        return cityView;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
