

public class DataInfo {

    //1.导叶开度
    private String guideVane;
    //2.上游水库水位
    private String upWaterLevel;
    //3.下游水库水位
    private String downWaterLevel;
    //4.上游延伸段水压力
    private String upPressureExtend;
    //5.蜗壳进口流量
    private String inFlowVolute;
    //6.蜗壳进口压力
    private String inPressureVolute;
    //7.主进水阀开闭时间
    private String openCloseTimeValve;
    //8.主进水阀开度
    private String openDegreeValve;
    //9.检修密封内漏
    private String leakOverhaul;
    //10.枢轴X向位移
    private String shiftPivotX;
    //11.枢轴Y向位移
    private String shiftPivotY;
    //12.伸缩节Y向位移
    private String shiftExpanJointY;
    //13.伸缩节Z向位移
    private String shiftExpanJointZ;
    //14.伸缩节X向位移
    private String shiftExpanJointX;
    //15.阀体左侧X向位移
    private String shiftValveLeftX;
    //16.阀体左侧Y向位移
    private String shiftValveLeftY;
    //17.阀体右侧X向位移
    private String shiftValveRightX;
    //18.阀体右侧Y向位移
    private String shiftValveRightY;
    //19.检修密封投入腔压力
    private String inPressureOverhaul;
    //20.检修密封退出腔压力
    private String outPressureOverhaul;
    //21.工作密封投入腔压力
    private String inPressureWork;
    //22.工作密封退出腔压力
    private String outPressureWork;
    //23.枢轴漏水量
    private String leakPivot;
    //24.伸缩节漏水量
    private String leakExpanJoint;
    //25.工作密封内漏
    private String leakWork;
    //26.环境噪声
    private String noise;
    //27.阀体左侧X向振动
    private String vibraValveLeftX;
    //28.阀体左侧Y向振动
    private String vibraValveLeftY;
    //29.阀体左侧Z向振动
    private String vibraValveLeftZ;
    //30.阀体右侧X向振动
    private String vibraValveRightX;
    //31.阀体右侧Y向振动
    private String vibraValveRightY;
    //32.阀体右侧Z向振动
    private String vibraValveRightZ;
    //33.密封环投退状态
    private String statusSeal;
    //34.水泵水轮机工况状态
    private String statusTurbin;
    //35.主进水阀开闭次数
    private String openCloseValveNum;


    @Override
    public String toString() {
        return "DataInfo{" +
                "guideVane='" + guideVane + '\'' +
                ", upWaterLevel='" + upWaterLevel + '\'' +
                ", downWaterLevel='" + downWaterLevel + '\'' +
                ", upPressureExtend='" + upPressureExtend + '\'' +
                ", inFlowVolute='" + inFlowVolute + '\'' +
                ", inPressureVolute='" + inPressureVolute + '\'' +
                ", openCloseTimeValve='" + openCloseTimeValve + '\'' +
                ", openDegreeValve='" + openDegreeValve + '\'' +
                ", leakOverhaul='" + leakOverhaul + '\'' +
                ", shiftPivotX='" + shiftPivotX + '\'' +
                ", shiftPivotY='" + shiftPivotY + '\'' +
                ", shiftExpanJointY='" + shiftExpanJointY + '\'' +
                ", shiftExpanJointZ='" + shiftExpanJointZ + '\'' +
                ", shiftExpanJointX='" + shiftExpanJointX + '\'' +
                ", shiftValveLeftX='" + shiftValveLeftX + '\'' +
                ", shiftValveLeftY='" + shiftValveLeftY + '\'' +
                ", shiftValveRightX='" + shiftValveRightX + '\'' +
                ", shiftValveRightY='" + shiftValveRightY + '\'' +
                ", inPressureOverhaul='" + inPressureOverhaul + '\'' +
                ", outPressureOverhaul='" + outPressureOverhaul + '\'' +
                ", inPressureWork='" + inPressureWork + '\'' +
                ", outPressureWork='" + outPressureWork + '\'' +
                ", leakPivot='" + leakPivot + '\'' +
                ", leakExpanJoint='" + leakExpanJoint + '\'' +
                ", leakWork='" + leakWork + '\'' +
                ", noise='" + noise + '\'' +
                ", vibraValveLeftX='" + vibraValveLeftX + '\'' +
                ", vibraValveLeftY='" + vibraValveLeftY + '\'' +
                ", vibraValveLeftZ='" + vibraValveLeftZ + '\'' +
                ", vibraValveRightX='" + vibraValveRightX + '\'' +
                ", vibraValveRightY='" + vibraValveRightY + '\'' +
                ", vibraValveRightZ='" + vibraValveRightZ + '\'' +
                ", statusSeal='" + statusSeal + '\'' +
                ", statusTurbin='" + statusTurbin + '\'' +
                ", openCloseValveNum='" + openCloseValveNum + '\'' +
                '}';
    }

    public String getGuideVane() {
        return guideVane;
    }

    public void setGuideVane(String guideVane) {
        this.guideVane = guideVane;
    }

    public String getUpWaterLevel() {
        return upWaterLevel;
    }

    public void setUpWaterLevel(String upWaterLevel) {
        this.upWaterLevel = upWaterLevel;
    }

    public String getDownWaterLevel() {
        return downWaterLevel;
    }

    public void setDownWaterLevel(String downWaterLevel) {
        this.downWaterLevel = downWaterLevel;
    }

    public String getUpPressureExtend() {
        return upPressureExtend;
    }

    public void setUpPressureExtend(String upPressureExtend) {
        this.upPressureExtend = upPressureExtend;
    }

    public String getInFlowVolute() {
        return inFlowVolute;
    }

    public void setInFlowVolute(String inFlowVolute) {
        this.inFlowVolute = inFlowVolute;
    }

    public String getInPressureVolute() {
        return inPressureVolute;
    }

    public void setInPressureVolute(String inPressureVolute) {
        this.inPressureVolute = inPressureVolute;
    }

    public String getOpenCloseTimeValve() {
        return openCloseTimeValve;
    }

    public void setOpenCloseTimeValve(String openCloseTimeValve) {
        this.openCloseTimeValve = openCloseTimeValve;
    }

    public String getOpenDegreeValve() {
        return openDegreeValve;
    }

    public void setOpenDegreeValve(String openDegreeValve) {
        this.openDegreeValve = openDegreeValve;
    }

    public String getLeakOverhaul() {
        return leakOverhaul;
    }

    public void setLeakOverhaul(String leakOverhaul) {
        this.leakOverhaul = leakOverhaul;
    }

    public String getShiftPivotX() {
        return shiftPivotX;
    }

    public void setShiftPivotX(String shiftPivotX) {
        this.shiftPivotX = shiftPivotX;
    }

    public String getShiftPivotY() {
        return shiftPivotY;
    }

    public void setShiftPivotY(String shiftPivotY) {
        this.shiftPivotY = shiftPivotY;
    }

    public String getShiftExpanJointY() {
        return shiftExpanJointY;
    }

    public void setShiftExpanJointY(String shiftExpanJointY) {
        this.shiftExpanJointY = shiftExpanJointY;
    }

    public String getShiftExpanJointZ() {
        return shiftExpanJointZ;
    }

    public void setShiftExpanJointZ(String shiftExpanJointZ) {
        this.shiftExpanJointZ = shiftExpanJointZ;
    }

    public String getShiftExpanJointX() {
        return shiftExpanJointX;
    }

    public void setShiftExpanJointX(String shiftExpanJointX) {
        this.shiftExpanJointX = shiftExpanJointX;
    }

    public String getShiftValveLeftX() {
        return shiftValveLeftX;
    }

    public void setShiftValveLeftX(String shiftValveLeftX) {
        this.shiftValveLeftX = shiftValveLeftX;
    }

    public String getShiftValveLeftY() {
        return shiftValveLeftY;
    }

    public void setShiftValveLeftY(String shiftValveLeftY) {
        this.shiftValveLeftY = shiftValveLeftY;
    }

    public String getShiftValveRightX() {
        return shiftValveRightX;
    }

    public void setShiftValveRightX(String shiftValveRightX) {
        this.shiftValveRightX = shiftValveRightX;
    }

    public String getShiftValveRightY() {
        return shiftValveRightY;
    }

    public void setShiftValveRightY(String shiftValveRightY) {
        this.shiftValveRightY = shiftValveRightY;
    }

    public String getInPressureOverhaul() {
        return inPressureOverhaul;
    }

    public void setInPressureOverhaul(String inPressureOverhaul) {
        this.inPressureOverhaul = inPressureOverhaul;
    }

    public String getOutPressureOverhaul() {
        return outPressureOverhaul;
    }

    public void setOutPressureOverhaul(String outPressureOverhaul) {
        this.outPressureOverhaul = outPressureOverhaul;
    }

    public String getInPressureWork() {
        return inPressureWork;
    }

    public void setInPressureWork(String inPressureWork) {
        this.inPressureWork = inPressureWork;
    }

    public String getOutPressureWork() {
        return outPressureWork;
    }

    public void setOutPressureWork(String outPressureWork) {
        this.outPressureWork = outPressureWork;
    }

    public String getLeakPivot() {
        return leakPivot;
    }

    public void setLeakPivot(String leakPivot) {
        this.leakPivot = leakPivot;
    }

    public String getLeakExpanJoint() {
        return leakExpanJoint;
    }

    public void setLeakExpanJoint(String leakExpanJoint) {
        this.leakExpanJoint = leakExpanJoint;
    }

    public String getLeakWork() {
        return leakWork;
    }

    public void setLeakWork(String leakWork) {
        this.leakWork = leakWork;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getVibraValveLeftX() {
        return vibraValveLeftX;
    }

    public void setVibraValveLeftX(String vibraValveLeftX) {
        this.vibraValveLeftX = vibraValveLeftX;
    }

    public String getVibraValveLeftY() {
        return vibraValveLeftY;
    }

    public void setVibraValveLeftY(String vibraValveLeftY) {
        this.vibraValveLeftY = vibraValveLeftY;
    }

    public String getVibraValveLeftZ() {
        return vibraValveLeftZ;
    }

    public void setVibraValveLeftZ(String vibraValveLeftZ) {
        this.vibraValveLeftZ = vibraValveLeftZ;
    }

    public String getVibraValveRightX() {
        return vibraValveRightX;
    }

    public void setVibraValveRightX(String vibraValveRightX) {
        this.vibraValveRightX = vibraValveRightX;
    }

    public String getVibraValveRightY() {
        return vibraValveRightY;
    }

    public void setVibraValveRightY(String vibraValveRightY) {
        this.vibraValveRightY = vibraValveRightY;
    }

    public String getVibraValveRightZ() {
        return vibraValveRightZ;
    }

    public void setVibraValveRightZ(String vibraValveRightZ) {
        this.vibraValveRightZ = vibraValveRightZ;
    }

    public String getStatusSeal() {
        return statusSeal;
    }

    public void setStatusSeal(String statusSeal) {
        this.statusSeal = statusSeal;
    }

    public String getStatusTurbin() {
        return statusTurbin;
    }

    public void setStatusTurbin(String statusTurbin) {
        this.statusTurbin = statusTurbin;
    }

    public String getOpenCloseValveNum() {
        return openCloseValveNum;
    }

    public void setOpenCloseValveNum(String openCloseValveNum) {
        this.openCloseValveNum = openCloseValveNum;
    }
}
