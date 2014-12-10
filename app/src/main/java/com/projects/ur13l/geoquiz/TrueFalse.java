package com.projects.ur13l.geoquiz;

/**
 * Created by ur13l on 8/12/14.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion(){
        return mQuestion;
    }

    public boolean isTrueQuestion(){
        return mTrueQuestion;
    }

    public void setQuestion(int question){
        mQuestion=question;
    }

    public void setmTrueQuestion(boolean trueQuestion){
        mTrueQuestion=trueQuestion;
    }
}
