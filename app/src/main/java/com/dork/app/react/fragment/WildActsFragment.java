package com.dork.app.react.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dork.app.react.R;
import com.dork.app.react.adapter.WildActsRecyclerViewAdapter;
import com.dork.app.react.event.WildActMessageEvent;
import com.dork.app.react.model.ActMessage;
import com.dork.app.react.service.moc.MocService;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

import butterknife.ButterKnife;

/**
 * Created by Xpitfire on 27.02.2017.
 */

public class WildActsFragment extends Fragment {

    private static final String ARG_COLUMN_COUNT = "column-count";

    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public WildActsFragment() {
    }

    @SuppressWarnings("unused")
    public static UserFragment newInstance(int columnCount) {
        UserFragment fragment = new UserFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__wild_acts, container, false);
        ButterKnife.bind(this, view);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            final RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(
                    new WildActsRecyclerViewAdapter(
                            new ArrayList<ActMessage>(),
                            mListener));
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
            EventBus.getDefault().register(this);
        } else {
            throw new RuntimeException("Activity containing this fragment must implement OnListFragmentInteractionListener!");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
        EventBus.getDefault().unregister(this);
    }

    public interface OnListFragmentInteractionListener {
        void onListFragmentInteraction(ActMessage message);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onWildActsMessageEvent(WildActMessageEvent event) {
        final RecyclerView recyclerView = (RecyclerView) getView();

        recyclerView.setAdapter(
                new WildActsRecyclerViewAdapter(
                        MocService.ACT_MESSAGES,
                        mListener));
    }
}
