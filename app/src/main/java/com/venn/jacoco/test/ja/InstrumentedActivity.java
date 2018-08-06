package com.venn.jacoco.test.ja;

import com.venn.jacoco.test.MainActivity;

public class InstrumentedActivity extends MainActivity {
    public FinishListener finishListener ;
    public void  setFinishListener(FinishListener finishListener){
        this.finishListener = finishListener;
    }

    @Override
    public void onDestroy() {
        if (this.finishListener !=null){
            finishListener.onActivityFinished();
        }
        super.onDestroy();
    }

}