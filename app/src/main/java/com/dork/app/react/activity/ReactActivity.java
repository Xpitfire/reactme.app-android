package com.dork.app.react.activity;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;

import com.dork.app.react.R;
import com.dork.app.react.util.CameraPreview;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class ReactActivity extends AppCompatActivity {

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;

    private final Handler _hideHandler = new Handler();
    private final Handler _recordingHandler = new Handler();

    private View _contentView;
    private final Runnable _hidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar

            // Note that some of these constants are new as of API 16 (Jelly Bean)
            // and API 19 (KitKat). It is safe to use them, as they are inlined
            // at compile-time and do nothing on earlier devices.
            _contentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };

    private View _controlsView;

    private CameraPreview _cameraPreview;

    private final Runnable _showPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            _controlsView.setVisibility(View.VISIBLE);
        }
    };
    private boolean _visible;
    private final Runnable _hideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };

    private final Runnable _startRecordingRunnable = new Runnable() {
        @Override
        public void run() {
            //_cameraPreview.startRecording();
        }
    };

    private final Runnable _stopRecordingRunnable = new Runnable() {
        @Override
        public void run() {
            //_cameraPreview.stopRecording();
            finish();
        }
    };



    @BindView(R.id.camera_preview) FrameLayout _frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_react);
        ButterKnife.bind(this);

        _visible = true;
        _controlsView = findViewById(R.id.fullscreen_content_controls);
        _contentView = findViewById(R.id.fullscreen_content);

        // Create our Preview view and set it as the content of our activity.
        _cameraPreview = new CameraPreview(this);

        // Set up the user interaction to manually show or hide the system UI.
        _contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggle();
            }
        });

        _frameLayout.addView(_cameraPreview);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(200);

        delayedRecordingStart(100);
        delayedRecordingStop(6000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        _cameraPreview.releaseMediaRecorder();
        _cameraPreview.releaseCamera();
    }

    private void toggle() {
        if (_visible) {
            hide();
        } else {
            show();
        }
    }

    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        _controlsView.setVisibility(View.GONE);
        _visible = false;

        // Schedule a runnable to remove the status and navigation bar after a delay
        _hideHandler.removeCallbacks(_showPart2Runnable);
        _hideHandler.postDelayed(_hidePart2Runnable, UI_ANIMATION_DELAY);
    }

    @SuppressLint("InlinedApi")
    private void show() {
        // Show the system bar
        _contentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        _visible = true;

        // Schedule a runnable to display UI elements after a delay
        _hideHandler.removeCallbacks(_hidePart2Runnable);
        _hideHandler.postDelayed(_showPart2Runnable, UI_ANIMATION_DELAY);
    }

    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        _hideHandler.removeCallbacks(_hideRunnable);
        _hideHandler.postDelayed(_hideRunnable, delayMillis);
    }

    private void delayedRecordingStop(int delayMillis) {
        _recordingHandler.removeCallbacks(_stopRecordingRunnable);
        _recordingHandler.postDelayed(_stopRecordingRunnable, delayMillis);
    }

    private void delayedRecordingStart(int delayMillis) {
        _recordingHandler.removeCallbacks(_startRecordingRunnable, delayMillis);
        _recordingHandler.postDelayed(_startRecordingRunnable, delayMillis);
    }

}
