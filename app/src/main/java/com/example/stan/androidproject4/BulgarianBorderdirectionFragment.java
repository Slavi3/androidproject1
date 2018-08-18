package com.example.stan.androidproject4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BulgarianBorderdirectionFragment extends Fragment {


    public BulgarianBorderdirectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bulgarian_borderdirection, container, false);
        Toast.makeText(getActivity(), "North,Northeast:Romania\nArea:238,397 km2\npopulation:19,638,000\ncapital:Bucharest", Toast.LENGTH_LONG).show();
        Toast.makeText(getActivity(), "Northwest:Serbia\nArea:77,474 km2 \npopulation:7,040,272 \ncapital:Belgrade", Toast.LENGTH_LONG).show();
        Toast.makeText(getActivity(), "West:FYR Macedonia\nArea:25,713 km2 \npopulation:2,103,721 \ncapital:Skopje", Toast.LENGTH_LONG).show();
        Toast.makeText(getActivity(), "South,Southwest:Greece\nArea:131,957 km2 \npopulation:10,768,477\ncapital:Athens", Toast.LENGTH_LONG).show();
        Toast.makeText(getActivity(), "Southeast:Turkey\nArea:783,356 km2 \npopulation 80,810,525\ncapital:Ankara", Toast.LENGTH_LONG).show();
        Toast.makeText(getActivity(), "East:Black sea\nArea: 436,402 km²", Toast.LENGTH_LONG).show();

        return view;
    }

    public static BulgarianBorderdirectionFragment newInstance() {
        return new BulgarianBorderdirectionFragment();
    }
}
