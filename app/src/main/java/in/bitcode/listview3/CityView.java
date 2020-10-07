package in.bitcode.listview3;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CityView extends LinearLayout {

    private ImageView mImgCity;
    private TextView mTxtCityName, mTxtStateName;
    private Context mContext;

    private City mCity;

    public CityView(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public CityView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    private void init() {

        //2
        View view = LayoutInflater.from(mContext).inflate(R.layout.city, null);
        this.addView(view);

        mImgCity = view.findViewById(R.id.imgCity);
        mTxtCityName = view.findViewById(R.id.txtCityName);
        mTxtStateName = view.findViewById(R.id.txtStateName);


        //1
        /*
        mImgCity = new ImageView(mContext);
        mImgCity.setLayoutParams(new ViewGroup.LayoutParams(200, 200));
        addView(mImgCity);

        mTxtCityName = new TextView(mContext);
        mTxtCityName.setTextSize(25);
        mTxtCityName.setPadding(20, 0, 0, 0);
        mTxtCityName.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        addView(mTxtCityName);

        setGravity(Gravity.CENTER_VERTICAL);
        setPadding(20, 10, 20, 10);
        */

    }

    public void setCity(City city) {
        mCity = city;
        mImgCity.setImageResource(mCity.getImageId());
        mTxtCityName.setText(mCity.getName());
        mTxtStateName.setText(mCity.getName());

        if(mCity.isSelected()){
            mTxtCityName.setTextColor(Color.BLUE);
        }
        else {
            mTxtCityName.setTextColor(Color.BLACK);
        }
     }

    public City getCity() {
        return mCity;
    }

}
