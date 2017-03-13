package com.dork.app.react.service.task;

import android.os.AsyncTask;

import com.dork.app.react.model.EntityBase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Xpitfire on 13.03.2017.
 */
public abstract class PersistenceTask<TEntity extends EntityBase>
        extends AsyncTask<TEntity, Void, TEntity> {

    private FirebaseDatabase mDatabase;

    public PersistenceTask() {
        this.mDatabase = FirebaseDatabase.getInstance();
    }

    @Override
    protected TEntity doInBackground(TEntity... params) {
        DatabaseReference ref = mDatabase.getReference().push();
        TEntity entity = save(ref);
        return entity;
    }

    protected abstract TEntity save(DatabaseReference ref);

}
