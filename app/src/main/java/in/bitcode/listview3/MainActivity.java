package in.bitcode.listview3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListViewCities;
    private ArrayList<City> mListCities;

    private CityAdapter mCityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        mCityAdapter = new CityAdapter( this, mListCities );
        mListViewCities.setAdapter( mCityAdapter );

        mListViewCities.setOnItemClickListener( new CityClickListener() );
    }

    private void init() {
        mListCities = new ArrayList<City>();
        mListCities.add( new City("Pune", R.drawable.img1, "Maharashtra"));
        mListCities.add( new City("Mumbai", R.drawable.img2, "Maharashtra"));
        mListCities.add( new City("Delhi", R.drawable.img3, "Delhi"));
        mListCities.add( new City("Chennai", R.drawable.img4, "Tamilnadu"));
        mListCities.add( new City("Benguluru", R.drawable.img5, "Karnataka"));
        mListCities.add( new City("Jaipur", R.drawable.img6, "Rajsthan"));
        mListCities.add( new City("Baroda", R.drawable.img7, "Gujarat"));
        mListCities.add( new City("Surat", R.drawable.img8, "Gujarat"));
        mListCities.add( new City("Indore", R.drawable.img1, "MP"));
        mListCities.add( new City("PuneNew", R.drawable.img2, "Maharashtra"));
        mListCities.add( new City("PuneOld", R.drawable.img3, "Maharashtra"));
        mListCities.add( new City("ThePune", R.drawable.img4, "Maharashtra"));

        mListViewCities = findViewById(R.id.listViewCities);
    }

    private class CityClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {

            City citySelected = mListCities.get( position );

            if( citySelected.isSelected() ){
                citySelected.setSelected( false );
            }
            else {
                citySelected.setSelected( true );
            }
            mCityAdapter.notifyDataSetChanged();

            Toast.makeText( MainActivity.this, "You clicked " + citySelected.getName(), Toast.LENGTH_LONG ).show();
        }
    }


}