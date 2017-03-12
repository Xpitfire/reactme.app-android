package com.dork.app.react.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dork.app.react.R;
import com.dork.app.react.api.model.ActMessage;
import com.dork.app.react.fragment.WildActsFragment;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Xpitfire on 27.02.2017.
 */
public class WildActsRecyclerViewAdapter extends RecyclerView.Adapter<WildActsRecyclerViewAdapter.ViewHolder> {

    private List<ActMessage> mValues;
    private final WildActsFragment.OnListFragmentInteractionListener mListener;

    // Provide a suitable constructor (depends on the kind of dataset)
    public WildActsRecyclerViewAdapter(List<ActMessage> messages, WildActsFragment.OnListFragmentInteractionListener listener) {
        mValues = messages;
        mListener = listener;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public WildActsRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        CardView c = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(c);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mActMessage = mValues.get(position);
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mIdView.setText(mValues.get(position).getDescription());
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onListFragmentInteraction(holder.mActMessage);
            }
        });
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mValues.size();
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public CardView mCardView;
        @BindView(R.id.info_text) public TextView mIdView;
        public ActMessage mActMessage;

        public ViewHolder(CardView c) {
            super(c);
            mCardView = c;
            ButterKnife.bind(this, c);
        }
    }
}
