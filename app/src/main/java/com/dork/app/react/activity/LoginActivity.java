package com.dork.app.react.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

// swagger api
import com.dork.app.react.App;
import com.dork.app.react.R;
import com.dork.app.react.api.invoker.ApiCallback;
import com.dork.app.react.api.invoker.ApiException;
import com.dork.app.react.api.AuthApi;
import com.dork.app.react.api.invoker.Configuration;
import com.dork.app.react.api.invoker.Pair;
import com.dork.app.react.api.invoker.auth.Authentication;
import com.dork.app.react.api.model.LoginCredentials;
import com.dork.app.react.event.LoginMessageEvent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;

import org.greenrobot.eventbus.EventBus;

import java.util.List;
import java.util.Map;

public class LoginActivity extends AppCompatActivity implements GoogleApiClient.OnConnectionFailedListener {
    private static final String TAG = "LoginActivity";
    private static final int REQUEST_SIGNUP = 0;
    private static final int REQUEST_GOOGLEPLUS_SIGNIN = 1;

    @BindView(R.id.input_email) EditText _emailText;
    @BindView(R.id.input_password) EditText _passwordText;
    @BindView(R.id.btn_login) Button _loginButton;
    @BindView(R.id.link_signup) TextView _signupLink;
    @BindView(R.id.loginFacebookButton) Button _loginFacebookButton;
    @BindView(R.id.loginGooglePlusButton) Button _loginGooglePlusButton;

    private boolean mSignInClicked;
    private GoogleApiClient _googleApiClient;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        _loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
        _loginFacebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHandleLogin();
            }
        });
        _loginGooglePlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHandleGooglePlusLogin();
            }
        });
        _signupLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });

        configureGoogleApiClient(this);
    }

    public void login() {
        Log.d(TAG, "Validate login request");

        if (!validate()) {
            onLoginFailed();
            return;
        }

        _loginButton.setEnabled(false);
        onHandleLogin();
    }

    private void onHandleLogin() {
        final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        //final String email = _emailText.getText().toString();
        //final String password = _passwordText.getText().toString();

        final String email = "admin@dork.com";
        final String password = "4f21204dae3bffe3fa8869114d1cedcd";

        Log.d(TAG, "Handle login request");

        LoginCredentials loginCredentials = new LoginCredentials(); // LoginCredentials
        loginCredentials.setUsername(email);
        loginCredentials.setPasswordHash(password);

        AuthApi apiInstance = new AuthApi();

        try {
            apiInstance.apiAuthLoginPostAsync(loginCredentials, new ApiCallback<Void>() {
                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            // On complete call onLoginFailed
                            onLoginFailed();
                            // onLoginFailed();
                            progressDialog.dismiss();
                        }
                    });
                }

                @Override
                public void onSuccess(Void result, int statusCode, final Map<String, List<String>> responseHeaders) {
                    Log.d(TAG, "Login success!");
                    Configuration.getDefaultApiClient().getAuthentications().put("auth", new Authentication() {

                        @Override
                        public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
                            //headerParams.putAll(responseHeaders));
                        }
                    });
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            // On complete call onLoginSuccess
                            onLoginSuccess();
                            // onLoginFailed();
                            progressDialog.dismiss();
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
            System.err.println("Exception when calling AuthApi#apiAuthLoginPost");
            e.printStackTrace();
            onLoginFailed();
            return;
        }
    }

    /////////////////////////// GOOGLE PLUS

    public void configureGoogleApiClient(Context context) {
        // Configure sign-in to request the user's ID, email address, and basic profile. ID and
        // basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        // Build a GoogleApiClient with access to GoogleSignIn.API and the options above.
        _googleApiClient = new GoogleApiClient.Builder(context)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();
    }

    private void onHandleGooglePlusLogin() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(_googleApiClient);
        startActivityForResult(signInIntent, REQUEST_GOOGLEPLUS_SIGNIN);
    }



    /////////////////////////// ACTIVITY LOGIN LOGIC

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_SIGNUP) {
            if (resultCode == RESULT_OK) {
                // TODO: Implement successful signup logic here
                // By default we just finish the Activity and log them in automatically
                this.finish();
            }
        }
        if (requestCode == REQUEST_GOOGLEPLUS_SIGNIN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if (result.isSuccess()) {
                GoogleSignInAccount acct = result.getSignInAccount();
                String personEmail = acct.getEmail();
                App.log(getClass(), personEmail);

                // TODO: Implement successful signup logic here
                // By default we just finish the Activity and log them in automatically
                this.finish();
            } else {
                Toast.makeText(getBaseContext(), R.string.login_failed, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        onLoginFailed();
    }

    @Override
    public void onBackPressed() {
        // disable going back to the MainActivity
        moveTaskToBack(true);
    }

    public void onLoginSuccess() {
        _loginButton.setEnabled(true);
        EventBus.getDefault().post(new LoginMessageEvent());
        finish();
    }

    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), R.string.login_failed, Toast.LENGTH_LONG).show();
        _loginButton.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _emailText.setError("enter a valid email address");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            _passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        return valid;
    }

}