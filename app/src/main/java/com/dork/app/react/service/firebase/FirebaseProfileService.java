package com.dork.app.react.service.firebase;

import android.os.AsyncTask;

import com.dork.app.react.model.User;
import com.dork.app.react.service.ProfileService;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public class FirebaseProfileService implements ProfileService {

    private FirebaseDatabase mDatabase;
    private FirebaseAuth mAuth;

    public FirebaseProfileService() {
        this.mDatabase = FirebaseDatabase.getInstance();
        this.mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public AsyncTask<User, Void, User> Register(final User user) {
        return new AsyncTask<User, Void, User>() {
            @Override
            protected User doInBackground(User... params) {
                if (user == null) return null;
                DatabaseReference ref = mDatabase.getReference().push();
                user.id = ref.getKey();

                mDatabase.getReference()
                        .child("users")
                        .child(mAuth.getCurrentUser().getUid())
                        .setValue(user);
                return user;
            }
        };
    }

}
