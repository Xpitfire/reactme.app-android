package com.dork.app.react.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dork.app.react.R;
import com.dork.app.react.api.InitApi;
import com.dork.app.react.api.invoker.ApiCallback;
import com.dork.app.react.api.invoker.ApiException;
import com.dork.app.react.api.model.User;
import com.dork.app.react.event.LoginMessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.ButterKnife;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class UserFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public UserFragment() {
    }

    // TODO: Customize parameter initialization
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
        View view = inflater.inflate(R.layout.fragment_user_list, container, false);
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
                    new UserRecyclerViewAdapter(
                            new ArrayList<User>(),
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

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onLoginMessageEvent(LoginMessageEvent event) {
        final RecyclerView recyclerView = (RecyclerView) getView();
        InitApi api = new InitApi();
        try {
            api.apiInitUserGetAsync(new ApiCallback<Void>() {
                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    Log.d("Dork-Fragment", "InitApi get failed!");
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            recyclerView.setAdapter(
                                    new UserRecyclerViewAdapter(
                                            new ArrayList<User>(),
                                            mListener));
                        }
                    });
                }

                @Override
                public void onSuccess(Void result, int statusCode, Map<String, List<String>> responseHeaders) {
                    Log.d("Dork-Fragment", "InitApi get worked!");
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ArrayList<User> users = new ArrayList<>();
                            User user;

                            user = new User();
                            user.email("test@test.com");
                            user.username("test");
                            users.add(user);
                            user = new User();
                            user.email("dork@dork.com");
                            user.username("dork");
                            users.add(user);

                            recyclerView.setAdapter(
                                    new UserRecyclerViewAdapter(
                                            users,
                                            mListener));
                        }
                    });
                }

                @Override
                public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {

                }

                @Override
                public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {

                }
            });
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        void onListFragmentInteraction(User user);
    }
}
