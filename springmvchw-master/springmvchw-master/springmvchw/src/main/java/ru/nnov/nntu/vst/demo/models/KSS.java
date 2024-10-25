package ru.nnov.nntu.vst.demo.models;

import java.util.Objects;

public class KSS {
    private String nameOfSkill;
    private TypeOfSkill typeOfSkill;

    public KSS(String nameOfSkill, TypeOfSkill typeOfSkill) {
        this.nameOfSkill = nameOfSkill;
        this.typeOfSkill = typeOfSkill;
    }

    public String getNameOfSkill() {
        return nameOfSkill;
    }

    public void setNameOfSkill(String nameOfSkill) {
        this.nameOfSkill = nameOfSkill;
    }

    public TypeOfSkill getTypeOfSkill() {
        return typeOfSkill;
    }

    public void setTypeOfSkill(TypeOfSkill typeOfSkill) {
        this.typeOfSkill = typeOfSkill;
    }

    @Override
    public String toString() {
        return "KSS{" +
                "nameOfSkill='" + nameOfSkill + '\'' +
                ", typeOfSkill=" + typeOfSkill +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KSS kss = (KSS) o;
        return Objects.equals(nameOfSkill, kss.nameOfSkill) && typeOfSkill == kss.typeOfSkill;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSkill, typeOfSkill);
    }
}
