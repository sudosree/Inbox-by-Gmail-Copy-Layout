package com.example.sreemoyeec662.inboxapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sreemoyeec662 on 31/03/2018.
 */

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.InboxViewHolder> {

    private Context mContext;

    public InboxAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public InboxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.inbox_list_row, parent, false);
        return new InboxViewHolder(view);
    }

    @Override
    public void onBindViewHolder(InboxViewHolder holder, int position) {
        holder.mGmailItemLetter.setText("U");
        holder.mFrom.setText(R.string.gmail_from);
        holder.mSubject.setText(R.string.gmail_subject);
        holder.mMessage.setText(R.string.gmail_message);
        holder.mTimeStamp.setText(R.string.gmail_timestamp);
    }

    @Override
    public int getItemCount() {
        return 40;
    }

    class InboxViewHolder extends RecyclerView.ViewHolder {

        private TextView mGmailItemLetter;
        private TextView mSubject;
        private TextView mFrom;
        private TextView mMessage;
        private TextView mTimeStamp;

        InboxViewHolder(View view) {
            super(view);
            mGmailItemLetter = view.findViewById(R.id.gmail_item_letter);
            mSubject = view.findViewById(R.id.tv_subject);
            mFrom = view.findViewById(R.id.tv_from);
            mMessage = view.findViewById(R.id.tv_message);
            mTimeStamp = view.findViewById(R.id.tv_timestamp);
        }
    }
}
