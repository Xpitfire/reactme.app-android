package com.dork.app.react.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dork.app.react.R;
import com.dork.app.react.fragment.UserFragment.OnListFragmentInteractionListener;
import com.dork.app.react.api.model.User;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * {@link RecyclerView.Adapter} that can display a {@link User} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 */
public class UserRecyclerViewAdapter extends RecyclerView.Adapter<UserRecyclerViewAdapter.ViewHolder> {

    private final List<User> _values;
    private final OnListFragmentInteractionListener _listener;

    public UserRecyclerViewAdapter(List<User> items, OnListFragmentInteractionListener listener) {
        _values = items;
        _listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder._item = _values.get(position);
        holder._idView.setText(_values.get(position).getUsername());
        holder._contentView.setText(_values.get(position).getEmail());

        holder._view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != _listener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    _listener.onListFragmentInteraction(holder._item);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return _values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public View _view;
        @BindView(R.id.title_textview) public TextView _idView;
        @BindView(R.id.subtitle_textview) public TextView _contentView;

        public User _item;

        public ViewHolder(View view) {
            super(view);
            _view = view;
            ButterKnife.bind(this, view);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + _contentView.getText() + "'";
        }
    }
}
