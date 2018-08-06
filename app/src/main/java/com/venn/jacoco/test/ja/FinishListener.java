package com.venn.jacoco.test.ja;

public interface FinishListener {
    void onActivityFinished();
    void dumpIntermediateCoverage(String filePath);
}