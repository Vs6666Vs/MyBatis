package com.example.entity;

public class SalGrade {
    private Integer GRADE;
    private Integer LOSAL;
    private Integer HISAL;

    @Override
    public String toString() {
        return "SalGrade{" +
                "GRADE=" + GRADE +
                ", LOSAL=" + LOSAL +
                ", HISAL=" + HISAL +
                '}';
    }

    public Integer getGRADE() {
        return GRADE;
    }

    public void setGRADE(Integer GRADE) {
        this.GRADE = GRADE;
    }

    public Integer getLOSAL() {
        return LOSAL;
    }

    public void setLOSAL(Integer LOSAL) {
        this.LOSAL = LOSAL;
    }

    public Integer getHISAL() {
        return HISAL;
    }

    public void setHISAL(Integer HISAL) {
        this.HISAL = HISAL;
    }
}
