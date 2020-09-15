package in.bitcode.listview3;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<City> mListCities;
    public CityAdapter(Context context, ArrayList<City> listCities ) {
        this.mContext = context;
        mListCities = listCities;
    }

    @Override
    public int getCount() {
        if( mListCities == null ) {
            return 0;
        }
        return mListCities.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        RelativeLayout cityContainer;
        ImageView imgCity;
        TextView txtCityName, txtStateName;

        if( convertView == null ) {
            LayoutInflater layoutInflater = LayoutInflater.from( mContext );
            cityContainer = (RelativeLayout) layoutInflater.inflate( R.layout.city, null);
        }
        else {
            cityContainer = (RelativeLayout) convertView;
        }


        imgCity = cityContainer.findViewById( R.id.imgCity );
        txtCityName = cityContainer.findViewById( R.id.txtCityName );
        txtStateName = cityContainer.findViewById( R.id.txtStateName );

        City city = mListCities.get( position );
        imgCity.setImageResource( city.getImageId() );
        txtCityName.setText( city.getName() );
        if( city.isSelected() ) {
            txtCityName.setTextColor(Color.BLUE );
        }
        else {
            txtCityName.setTextColor(Color.BLACK );
        }
        txtStateName.setText( city.getState() );

        return cityContainer;
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
