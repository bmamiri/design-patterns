package creational.builder;

public class H264Properties {
    private int keyInt;
    private int minKeyInt;
    private int sceneCut;
    private int bFrames;
    private int bAdapt;
    private int qp;
    private int bitrate;
    private boolean bFrameBias;
    private int crf;
    private int qpStep;
    private int pbRatio;
    private int chromaOffset;
    private float tateTol;
    private byte pass;
    private boolean stats;
    private int direct;
    private int meRange;
    private boolean weighB;
    private boolean noFastPSkip;

    public int getKeyInt() {
        return keyInt;
    }

    public void setKeyInt(int keyInt) {
        this.keyInt = keyInt;
    }

    public int getMinKeyInt() {
        return minKeyInt;
    }

    public void setMinKeyInt(int minKeyInt) {
        this.minKeyInt = minKeyInt;
    }

    public int getSceneCut() {
        return sceneCut;
    }

    public void setSceneCut(int sceneCut) {
        this.sceneCut = sceneCut;
    }

    public int getbFrames() {
        return bFrames;
    }

    public void setbFrames(int bFrames) {
        this.bFrames = bFrames;
    }

    public int getbAdapt() {
        return bAdapt;
    }

    public void setbAdapt(int bAdapt) {
        this.bAdapt = bAdapt;
    }

    public int getQp() {
        return qp;
    }

    public void setQp(int qp) {
        this.qp = qp;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    public boolean isbFrameBias() {
        return bFrameBias;
    }

    public void setbFrameBias(boolean bFrameBias) {
        this.bFrameBias = bFrameBias;
    }

    public int getCrf() {
        return crf;
    }

    public void setCrf(int crf) {
        this.crf = crf;
    }

    public int getQpStep() {
        return qpStep;
    }

    public void setQpStep(int qpStep) {
        this.qpStep = qpStep;
    }

    public int getPbRatio() {
        return pbRatio;
    }

    public void setPbRatio(int pbRatio) {
        this.pbRatio = pbRatio;
    }

    public int getChromaOffset() {
        return chromaOffset;
    }

    public void setChromaOffset(int chromaOffset) {
        this.chromaOffset = chromaOffset;
    }

    public float getTateTol() {
        return tateTol;
    }

    public void setTateTol(float tateTol) {
        this.tateTol = tateTol;
    }

    public byte getPass() {
        return pass;
    }

    public void setPass(byte pass) {
        this.pass = pass;
    }

    public boolean isStats() {
        return stats;
    }

    public void setStats(boolean stats) {
        this.stats = stats;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getMeRange() {
        return meRange;
    }

    public void setMeRange(int meRange) {
        this.meRange = meRange;
    }

    public boolean isWeighB() {
        return weighB;
    }

    public void setWeighB(boolean weighB) {
        this.weighB = weighB;
    }

    public boolean isNoFastPSkip() {
        return noFastPSkip;
    }

    public void setNoFastPSkip(boolean noFastPSkip) {
        this.noFastPSkip = noFastPSkip;
    }
}
