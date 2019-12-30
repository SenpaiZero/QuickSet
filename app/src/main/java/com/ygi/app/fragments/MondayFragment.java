package com.ygi.app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.ygi.app.adapters.WeekAdapter;
import com.ygi.app.utils.DbHelper;
import com.ygi.app.R;
import com.ygi.app.utils.FragmentHelper;


public class MondayFragment extends Fragment {

    public static final String KEY_MONDAY_FRAGMENT = "Monday";
    private DbHelper db;
    private ListView listView;
    private WeekAdapter adapter;
    private ImageView popup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monday, container, false);
        setupAdapter(view);
        setupListViewMultiSelect();
        popup = view.findViewById(R.id.popupbtn);
        return view;
    }

    private void setupAdapter(View view) {
        db = new DbHelper(getActivity());
        listView = view.findViewById(R.id.mondaylist);
        adapter = new WeekAdapter(getActivity(), listView, R.layout.listview_week_adapter, db.getWeek(KEY_MONDAY_FRAGMENT));
        listView.setAdapter(adapter);
    }

    private void setupListViewMultiSelect() {
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(FragmentHelper.setupListViewMultiSelect(getActivity(), listView, adapter, db));
    }
}