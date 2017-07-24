package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;

    private int mIndex;
    private int mStory[] = {
            R.string.T1_Story,
            R.string.T2_Story,
            R.string.T3_Story,
            R.string.T4_End,
            R.string.T5_End,
            R.string.T6_End
    };
    private int mButtonText[][] = {
            {R.string.T1_Ans1, R.string.T1_Ans2},
            {R.string.T2_Ans1, R.string.T2_Ans2},
            {R.string.T3_Ans1, R.string.T3_Ans2}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button)findViewById(R.id.buttonBottom);

        update();



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mIndex){
                    case 0:
                        mIndex = 2;
                        break;
                    case 1:
                        mIndex = 2;
                        break;
                    case 2:
                        mIndex = 5;
                        break;
                }
                update();
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mIndex){
                    case 0:
                        mIndex = 1;
                        break;
                    case 1:
                        mIndex = 3;
                        break;
                    case 2:
                        mIndex = 4;
                        break;
                }
                update();
            }
        });

    }

    private void update(){
        mStoryTextView.setText(mStory[mIndex]);
        if(mIndex < 3){
            mButtonTop.setText(mButtonText[mIndex][0]);
            mButtonBottom.setText(mButtonText[mIndex][1]);
            mButtonTop.setVisibility(View.VISIBLE);
            mButtonBottom.setVisibility(View.VISIBLE);
        }else{
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
    }
}
