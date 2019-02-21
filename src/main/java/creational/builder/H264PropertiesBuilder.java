package creational.builder;

public class H264PropertiesBuilder {
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

    public H264PropertiesBuilder keyInt(int keyInt) {
        this.keyInt = keyInt;
        return this;
    }

    public H264PropertiesBuilder minKeyInt(int minKeyInt) {
        this.minKeyInt = minKeyInt;
        return this;
    }

    public H264PropertiesBuilder sceneCut(int sceneCut) {
        this.sceneCut = sceneCut;
        return this;
    }

    public H264PropertiesBuilder bFrames(int bFrames) {
        this.bFrames = bFrames;
        return this;
    }

    public H264PropertiesBuilder bAdapt(int bAdapt) {
        this.bAdapt = bAdapt;
        return this;
    }

    public H264PropertiesBuilder qp(int qp) {
        this.qp = qp;
        return this;
    }

    public H264PropertiesBuilder bitrate(int bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    public H264PropertiesBuilder bFrameBias(boolean bFrameBias) {
        this.bFrameBias = bFrameBias;
        return this;
    }

    public H264PropertiesBuilder crf(int crf) {
        this.crf = crf;
        return this;
    }

    public H264PropertiesBuilder qpStep(int qpStep) {
        this.qpStep = qpStep;
        return this;
    }

    public H264PropertiesBuilder pbRatio(int pbRatio) {
        this.pbRatio = pbRatio;
        return this;
    }

    public H264PropertiesBuilder chromaOffset(int chromaOffset) {
        this.chromaOffset = chromaOffset;
        return this;
    }

    public H264PropertiesBuilder tateTol(float tateTol) {
        this.tateTol = tateTol;
        return this;
    }

    public H264PropertiesBuilder pass(byte pass) {
        this.pass = pass;
        return this;
    }

    public H264PropertiesBuilder stats(boolean stats) {
        this.stats = stats;
        return this;
    }

    public H264PropertiesBuilder direct(int direct) {
        this.direct = direct;
        return this;
    }

    public H264PropertiesBuilder meRange(int meRange) {
        this.meRange = meRange;
        return this;
    }

    public H264PropertiesBuilder weighB(boolean weighB) {
        this.weighB = weighB;
        return this;
    }

    public H264PropertiesBuilder noFastPSkip(boolean noFastPSkip) {
        this.noFastPSkip = noFastPSkip;
        return this;
    }

    public H264Properties build() {
        H264Properties h264Properties = new H264Properties();

        h264Properties.setKeyInt(keyInt);
        h264Properties.setMinKeyInt(minKeyInt);
        h264Properties.setSceneCut(sceneCut);
        h264Properties.setbFrameBias(bFrameBias);
        h264Properties.setbAdapt(bAdapt);
        h264Properties.setQp(qp);
        h264Properties.setBitrate(bitrate);
        h264Properties.setbFrameBias(bFrameBias);
        h264Properties.setCrf(crf);
        h264Properties.setQpStep(qpStep);
        h264Properties.setPbRatio(pbRatio);
        h264Properties.setChromaOffset(chromaOffset);
        h264Properties.setTateTol(tateTol);
        h264Properties.setPass(pass);
        h264Properties.setStats(stats);
        h264Properties.setDirect(direct);
        h264Properties.setMeRange(meRange);
        h264Properties.setWeighB(weighB);
        h264Properties.setNoFastPSkip(noFastPSkip);

        return h264Properties;
    }
}
