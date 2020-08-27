package app.evs.com.evs2;

import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quiz1b extends AppCompatActivity implements View.OnTouchListener, View.OnDragListener {
    TextView dest1,dest2,dest3,dest4,dest5,dest12;
    TextView op2,op3,op4,op5,op6;
    Button op1;
    MediaPlayer mp1,mp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1b);
        getSupportActionBar().hide();
        getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN, android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);

        dest1 = findViewById(R.id.dest1);
        dest12 = findViewById(R.id.dest12);
        dest2 = findViewById(R.id.dest2);
        dest3 = findViewById(R.id.dest3);
        dest4 = findViewById(R.id.dest4);
        dest5 = findViewById(R.id.dest5);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);
        op5 = findViewById(R.id.op5);
        op6 = findViewById(R.id.op6);

        op1.setOnTouchListener(this);
        op2.setOnTouchListener(this);
        op3.setOnTouchListener(this);
        op4.setOnTouchListener(this);
        op5.setOnTouchListener(this);
        op6.setOnTouchListener(this);

        dest1.setOnDragListener(this);
        dest12.setOnDragListener(this);
        dest2.setOnDragListener(this);
        dest3.setOnDragListener(this);
        dest4.setOnDragListener(this);
        dest5.setOnDragListener(this);




    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {


        View.DragShadowBuilder mShadow = new View.DragShadowBuilder(v);
        ClipData.Item item = new ClipData.Item(v.getTag().toString());
        String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
        ClipData data = new ClipData(v.getTag().toString(), mimeTypes, item);

        switch (v.getId()) {
            case R.id.op1:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }

                break;
            case R.id.op2:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }
                break;

            case R.id.op3:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }
                break;

            case R.id.op4:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }
                break;
            case R.id.op5:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }
                break;
            case R.id.op6:

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    v.startDragAndDrop(data, mShadow, null, 0);
                } else {
                    v.startDrag(data, mShadow, null, 0);
                }
                break;


        }

        return false;
    }

    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:
                if(v.getTag().toString().equals("destination2")) {
                    // ((TextView) v).setText("_____");
                }
                else  if(v.getTag().toString().equals("destination1")) {
                    // Toast.makeText(getApplicationContext(), v.getTag().toString(), Toast.LENGTH_SHORT).show();
                }

                v.invalidate();
                return true;

            case DragEvent.ACTION_DROP:

                String clipData = event.getClipDescription().getLabel().toString();
                switch (clipData) {
                    case "op1":
                        ((TextView) v).setText(" functions ");
                        if(dest5.getText().toString().equals("functions"))
                        {
                            op1.setOnTouchListener(null);
                            dest5.setOnDragListener(null);
                            ((TextView) v).setTextColor(Color.parseColor("#009900"));
                            stopPlaying();
                            mp1.start();
                        }
                        else
                        {
                            ((TextView) v).setText(" _______________ ");
                            stopPlaying();
                            mp2.start();
                        }
                        break;
                    case "op2":
                        ((TextView) v).setText(" lower ");
                        if(dest12.getText().toString().equals("lower"))
                        {
                            op2.setOnTouchListener(null);
                            dest12.setOnDragListener(null);
                            ((TextView) v).setTextColor(Color.parseColor("#009900"));
                            stopPlaying();
                            mp1.start();
                        }
                        else
                        {
                            ((TextView) v).setText(" _______________ ");
                            stopPlaying();
                            mp2.start();
                        }

                        break;
                    case "op3":
                        ((TextView) v).setText(" nervous ");
                        if(dest4.getText().toString().equals("nervous"))
                        {
                            op3.setOnTouchListener(null);
                            dest4.setOnDragListener(null);
                            ((TextView) v).setTextColor(Color.parseColor("#009900"));
                            stopPlaying();
                            mp1.start();
                        }
                        else
                        {
                            ((TextView) v).setText(" _______________ ");
                            stopPlaying();
                            mp2.start();
                        }
                        break;
                    case "op4":
                        ((TextView) v).setText(" eyelids ");
                        if(dest3.getText().toString().equals("eyelids"))
                        {
                            op4.setOnTouchListener(null);
                            dest3.setOnDragListener(null);
                            ((TextView) v).setTextColor(Color.parseColor("#009900"));
                            stopPlaying();
                            mp1.start();
                        }
                        else
                        {
                            ((TextView) v).setText(" _______________ ");
                            stopPlaying();
                            mp2.start();
                        }
                        break;
                    case "op5":
                        ((TextView) v).setText(" upper ");
                        if(dest1.getText().toString().equals("upper"))
                        {
                            op5.setOnTouchListener(null);
                            dest1.setOnDragListener(null);
                            ((TextView) v).setTextColor(Color.parseColor("#009900"));
                            stopPlaying();
                            mp1.start();
                        }
                        else
                        {
                            ((TextView) v).setText(" _______________ ");
                            stopPlaying();
                            mp2.start();
                        }
                        break;

                    case "op6":
                        ((TextView) v).setText(" nostrils ");
                        if(dest2.getText().toString().equals("nostrils"))
                        {
                            op6.setOnTouchListener(null);
                            dest2.setOnDragListener(null);
                            ((TextView) v).setTextColor(Color.parseColor("#009900"));
                            stopPlaying();
                            mp1.start();
                        }
                        else
                        {
                            ((TextView) v).setText(" _______________ ");
                            stopPlaying();
                            mp2.start();
                        }
                        break;

                }

                v.invalidate();
                return true;


            case DragEvent.ACTION_DRAG_ENTERED:


                // clipData = event.getClipDescription().getLabel().toString();
                //Toast.makeText(getApplicationContext(),clipData, Toast.LENGTH_SHORT).show();

                //v.invalidate();
                return true;


            default:
                return false;
        }
    }
    private void stopPlaying() {
        if (mp1 != null) {
            mp1.stop();
            mp1.release();
            mp1 = null;
        }

        if (mp2 != null) {
            mp2.stop();
            mp2.release();
            mp2 = null;
        }

        mp1= MediaPlayer.create(this, R.raw.right);
        mp2=MediaPlayer.create(this, R.raw.wrong);

    }
}
