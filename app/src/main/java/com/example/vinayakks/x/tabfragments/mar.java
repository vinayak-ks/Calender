package com.example.vinayakks.x.tabfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.vinayakks.x.CustomAdapter;
import com.example.vinayakks.x.ListItems;
import com.example.vinayakks.x.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinayak ks on 4/5/2016.
 */
public class mar extends Fragment {
    public  mar(){

    }
    protected View v;
    protected ListView list;
    protected ImageView img;
    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    public static List<ListItems> dbObjects = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize datasets
        PrepareData();
    }

    public static mar newInstance(int pos) {

        Bundle args = new Bundle();

        mar fragment = new mar();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mar, container, false);
        // BEGIN_INCLUDE(initializeRecyclerView)
        /*mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.activity_venues, container, false);
        //layout
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new CustomAdapter(dbObjects);
        // Set CustomAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        Log.d("HI", "hi");*/
        // END_INCLUDE(initializeRecyclerView)
        return rootView;
    }
    public void PrepareData(){
        for(int i=0;i<10;i++){
            ListItems list = new ListItems("abc","abcc","hgdkhgkshgkhskghskghsk");
            dbObjects.add(list);
        }
    }
}
