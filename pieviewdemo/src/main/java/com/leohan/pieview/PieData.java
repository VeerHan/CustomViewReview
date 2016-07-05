package com.leohan.pieview;

/**
 * Created by Leo on 16/7/5.
 */
public class PieData {
    //用户关心数据
    private String name;//名字
    private float value;//数值
    private float percentagle;//百分比

    //非用户关心数据
    private int color = 0;//颜色
    private float angle = 0;//角度


    public PieData(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getPercentagle() {
        return percentagle;
    }

    public void setPercentagle(float percentagle) {
        this.percentagle = percentagle;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}

