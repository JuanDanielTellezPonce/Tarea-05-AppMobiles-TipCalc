package com.johapps.tipcalc.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.johapps.tipcalc.R;
import com.johapps.tipcalc.activities.DetallePropina;
import com.johapps.tipcalc.adapters.OnItemClickListener;
import com.johapps.tipcalc.adapters.TipAdapter;
import com.johapps.tipcalc.entity.TipRecord;
import com.johapps.tipcalc.utils.TipUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */

public class TipHistoryListFragment extends Fragment implements TipHistoryListFragmentListener, OnItemClickListener {

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    TipAdapter adapter;

    public TipHistoryListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tip_history_list, container, false);
        ButterKnife.bind(this, view);
        initAdapter();
        initRecyclerView();
        return view;
    }

    private void initAdapter() {
        if (adapter == null) {
            adapter = new TipAdapter(getActivity().getApplicationContext(), this);
        }
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void addToList(TipRecord record) {
        adapter.add(record);
    }

    @Override
    public void clearList() {
        adapter.clear();
    }

    @Override
    public void onItemClick(TipRecord tipRecord) {
        Intent i = new Intent(getActivity(), DetallePropina.class);

        i.putExtra(DetallePropina.TIP_KEY, TipUtils.getTip(tipRecord));
        i.putExtra(DetallePropina.BILL_TOTAL_KEY, tipRecord.getBill());
        i.putExtra(DetallePropina.DATE_KEY, TipUtils.getDateFormated(tipRecord));
        startActivity(i);
    }

}
