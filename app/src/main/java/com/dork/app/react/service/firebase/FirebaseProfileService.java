package com.dork.app.react.service.firebase;

import com.dork.app.react.model.User;
import com.dork.app.react.service.ProfileService;
import com.dork.app.react.service.task.PersistenceTask;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public class FirebaseProfileService implements ProfileService {

    private FirebaseAuth mAuth;

    public FirebaseProfileService() {
        this.mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public PersistenceTask<User> Register(final User user) {
        return new PersistenceTask<User>() {
            @Override
            protected User save(DatabaseReference ref) {
                ref.child("users")
                        .child(mAuth.getCurrentUser().getUid())
                        .setValue(user);
                user.id = ref.getKey();
                return user;
            }
        };
    }

}
