package com.example.myapplication;

import androidx.lifecycle.MutableLiveData;

public interface HandleAdpater {
    void judgeAction(Music music, int pos);
    void forwardMusic();
    void rewindMusic();
}
