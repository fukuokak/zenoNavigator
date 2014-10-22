package jp.co.fukuokak.zeronavigator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import jp.co.fukuokak.zeronavigator.model.Human;

/**
 * Created by fukuokak on 2014/10/22.
 */
public class PlaceholderFragment extends BaseFragment {

    private String text1;

    private Human human ;

    public PlaceholderFragment() {
    }

    public void setText1(String aaa) {
        this.text1 = aaa;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);
        TextView textView1 = (TextView)rootView.findViewById(R.id.Text1);
        textView1.setText(text1 + human.getHeadSize() + human.getHandSize() + human.getFootSize());



        return rootView;
    }


}
