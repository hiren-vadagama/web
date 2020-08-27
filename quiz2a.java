package app.evs.com.evs2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class quiz2a extends AppCompatActivity {

    TextView q1a,q1b,q1c,q2a,q2b,q2c,q3a,q3b,q3c,q4a,q4b,q4c;
    ImageView imgq1a,imgq1b,imgq1c,imgq2a,imgq2b,imgq2c,imgq3a,imgq3b,imgq3c,imgq4a,imgq4b,imgq4c;
    int status1=0,status2=0,status3=0;

    MediaPlayer mp1,mp2;
    ImageView b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2a);
        getSupportActionBar().hide();
        getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN, android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);


        b1 = (ImageView) findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),quiz2a2.class);
                startActivity(i);

            }
        });


        mp1=MediaPlayer.create(this, R.raw.right);
        mp2=MediaPlayer.create(this, R.raw.wrong);


        imgq1a = findViewById(R.id.img_op1a);
        imgq1b = findViewById(R.id.img_op1b);
        imgq1c = findViewById(R.id.img_op1c);

        imgq2a = findViewById(R.id.img_op2a);
        imgq2b = findViewById(R.id.img_op2b);
        imgq2c = findViewById(R.id.img_op2c);

        imgq3a = findViewById(R.id.img_op3a);
        imgq3b = findViewById(R.id.img_op3b);
        imgq3c = findViewById(R.id.img_op3c);



        q1a = findViewById(R.id.op1a);
        q1b = findViewById(R.id.op1b);
        q1c = findViewById(R.id.op1c);

        q2a = findViewById(R.id.op2a);
        q2b = findViewById(R.id.op2b);
        q2c = findViewById(R.id.op2c);

        q3a = findViewById(R.id.op3a);
        q3b = findViewById(R.id.op3b);
        q3c = findViewById(R.id.op3c);



        /* for question one*/

        q1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status1==0) {
                    stopPlaying();
                    imgq1a.setImageResource(R.drawable.right_ans);
                    status1 = 1;
                    mp1.start();
                }
            }
        });
        imgq1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status1==0) {
                    stopPlaying();
                    imgq1a.setImageResource(R.drawable.right_ans);
                    status1 = 1;
                    mp1.start();
                }
            }
        });

        q1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status1==0) {
                    stopPlaying();
                    imgq1c.setImageResource(R.drawable.wrong_ans);
                    status1 = 0;
                    mp2.start();
                }
            }
        });
        imgq1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status1==0) {
                    stopPlaying();
                    imgq1c.setImageResource(R.drawable.wrong_ans);
                    status1 = 0;
                    mp2.start();
                }
            }
        });

        q1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status1==0) {
                    stopPlaying();
                    imgq1b.setImageResource(R.drawable.wrong_ans);
                    status1 = 0;
                    mp2.start();
                }
            }
        });
        imgq1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status1==0) {
                    stopPlaying();
                    imgq1b.setImageResource(R.drawable.wrong_ans);
                    status1 = 0;
                    mp2.start();
                }
            }
        });

        /*for question two*/

        q2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status2==0) {
                    stopPlaying();
                    imgq2a.setImageResource(R.drawable.wrong_ans);
                    status2 = 0;
                    mp2.start();
                }
            }
        });
        imgq2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status2==0) {
                    stopPlaying();
                    imgq2a.setImageResource(R.drawable.wrong_ans);
                    status2 = 0;
                    mp2.start();
                }
            }
        });

        q2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status2==0) {
                    stopPlaying();
                    imgq2b.setImageResource(R.drawable.wrong_ans);
                    mp2.start();
                }
            }
        });
        imgq2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status2==0) {
                    stopPlaying();
                    imgq2b.setImageResource(R.drawable.wrong_ans);
                    status2=0;
                    mp2.start();
                }
            }
        });

        q2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status2==0) {
                    stopPlaying();
                    imgq2c.setImageResource(R.drawable.right_ans);
                    status2=1;
                    mp1.start();
                }
            }
        });
        imgq2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status2==0) {
                    stopPlaying();
                    imgq2c.setImageResource(R.drawable.right_ans);
                    status2=1;
                    mp1.start();
                }
            }
        });

        /*for question three*/

        q3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status3==0) {
                    stopPlaying();
                    imgq3b.setImageResource(R.drawable.wrong_ans);
                    status3 = 0;
                    mp2.start();
                }
            }
        });
        imgq3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status3==0) {
                    stopPlaying();
                    imgq3b.setImageResource(R.drawable.wrong_ans);
                    status3 = 0;
                    mp2.start();
                }
            }
        });

        q3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status3==0) {
                    stopPlaying();
                    imgq3a.setImageResource(R.drawable.wrong_ans);
                    mp2.start();
                }
            }
        });
        imgq3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status3==0) {
                    stopPlaying();
                    imgq3a.setImageResource(R.drawable.wrong_ans);
                    mp2.start();
                }
            }
        });

        q3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status3==0) {
                    stopPlaying();
                    imgq3c.setImageResource(R.drawable.right_ans);
                    status3=1;
                    mp1.start();
                }
            }
        });
        imgq3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status3==0) {
                    stopPlaying();
                    imgq3c.setImageResource(R.drawable.right_ans);
                    status3=1;
                    mp1.start();
                }
            }
        });
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
