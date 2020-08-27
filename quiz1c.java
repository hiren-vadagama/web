package app.evs.com.evs2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class quiz1c extends AppCompatActivity {
    ImageView b1,b2,b3,b4,b5;
    int ans1=0,ans2=0,ans3=0,ans4=0,ans5=0;
    int cur=0;

    private Button mButton;
    private ImageView mImageView;
    Canvas canvas;
    Paint paint1;
    Bitmap bitmap;
    MediaPlayer mp1,mp2;
    TextView p1,p2,p3,p4,p41,p5,p6,p7,p8,p81;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1c);
        getSupportActionBar().hide();
        getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN, android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);


        mImageView = (ImageView) findViewById(R.id.iv);
        bitmap = Bitmap.createBitmap(
                500, // Width
                300, // Height
                Bitmap.Config.ARGB_8888 // Config
        );

        canvas = new Canvas(bitmap);
        paint1 = new Paint();
        paint1.setColor(Color.GREEN);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(8);
        paint1.setAntiAlias(true);





        p1 = findViewById(R.id.pair1);
        p2 = findViewById(R.id.pair2);
        p3 = findViewById(R.id.pair3);
        p4 = findViewById(R.id.pair4);
        p41 = findViewById(R.id.pair41);
        p5 = findViewById(R.id.pair5);
        p6 = findViewById(R.id.pair6);
        p7 = findViewById(R.id.pair7);
        p8 = findViewById(R.id.pair8);
        p81 = findViewById(R.id.pair81);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur=1;
                select_current();
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur=2;
                select_current();
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur=3;
                select_current();
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur=4;
                select_current();
            }
        });
        p41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur=41;
                select_current();
            }
        });


        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cur==41)
                {
                    ans5=1;
                    draw_canvas();
                    stopPlaying();
                    mp1.start();
                    p41 .setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else
                {
                    stopPlaying();
                    mp2.start();
                }
            }
        });

        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cur==1)
                {
                    ans1=1;
                    draw_canvas();
                    stopPlaying();
                    mp1.start();
                    p1.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else
                {
                    stopPlaying();
                    mp2.start();
                }
            }
        });

        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cur==4)
                {
                    ans3=1;
                    draw_canvas();
                    stopPlaying();
                    mp1.start();
                    p4.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else
                {
                    stopPlaying();
                    mp2.start();
                }
            }
        });

        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cur==2)
                {
                    ans2=1;
                    draw_canvas();
                    stopPlaying();
                    mp1.start();
                    p2.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else
                {
                    stopPlaying();
                    mp2.start();
                }
            }
        });

        p81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cur==3)
                {
                    ans3=1;
                    draw_canvas();
                    stopPlaying();
                    mp1.start();
                    p3.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                else
                {
                    stopPlaying();
                    mp2.start();
                }
            }
        });

    }

    private  void select_current()
    {
        if(cur==1)
        {
            p1.setBackgroundColor(Color.parseColor("#ccddff"));
            p2.setBackgroundColor(Color.parseColor("#ffffff"));
            p3.setBackgroundColor(Color.parseColor("#ffffff"));
            p4.setBackgroundColor(Color.parseColor("#ffffff"));
            p41.setBackgroundColor(Color.parseColor("#ffffff"));
        }

        if(cur==2)
        {
            p1.setBackgroundColor(Color.parseColor("#ffffff"));
            p2.setBackgroundColor(Color.parseColor("#ccddff"));
            p3.setBackgroundColor(Color.parseColor("#ffffff"));
            p4.setBackgroundColor(Color.parseColor("#ffffff"));
            p41.setBackgroundColor(Color.parseColor("#ffffff"));
        }

        if(cur==3)
        {
            p1.setBackgroundColor(Color.parseColor("#ffffff"));
            p2.setBackgroundColor(Color.parseColor("#ffffff"));
            p3.setBackgroundColor(Color.parseColor("#ccddff"));
            p4.setBackgroundColor(Color.parseColor("#ffffff"));
            p41.setBackgroundColor(Color.parseColor("#ffffff"));
        }

        if(cur==4)
        {
            p1.setBackgroundColor(Color.parseColor("#ffffff"));
            p2.setBackgroundColor(Color.parseColor("#ffffff"));
            p3.setBackgroundColor(Color.parseColor("#ffffff"));
            p4.setBackgroundColor(Color.parseColor("#ccddff"));
            p41.setBackgroundColor(Color.parseColor("#ccddff"));
        }
    }

    private void draw_canvas() {

        if(ans1==1)
        {
            paint1.setColor(Color.GREEN);
            canvas.drawLine(0, 10, 600, 100, paint1);
        }
        if(ans2==1)
        {
            paint1.setColor(Color.RED);
            canvas.drawLine(0, 110, 600, 350, paint1);
        }
        if(ans3==1)
        {
            paint1.setColor(Color.BLUE);
            canvas.drawLine(0, 210, 600, 210, paint1);
        }
        if(ans4==1)
        {
            paint1.setColor(Color.CYAN);
            canvas.drawLine(0, 310, 600, -50, paint1);
        }
        if(ans5==1)
        {
            paint1.setColor(Color.CYAN);
            canvas.drawLine(0, 310, 600, -50, paint1);
        }


        mImageView.setImageBitmap(bitmap);
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