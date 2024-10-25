package ru.nnov.nntu.vst.demo.models;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Discipline {
    private String name;
    private int hours;
    private List<KSS> kssInputList;
    private List<KSS> kssOutputList;
    private Map<TypeOfWork, Integer> amountOfWork;
    private Control control;

    public Discipline(String name, int hours, List<KSS> kssInputList, List<KSS> kssOutputList, Map<TypeOfWork, Integer> amountOfWork, Control control) {
        this.name = name;
        this.hours = hours;
        this.kssInputList = kssInputList;
        this.kssOutputList = kssOutputList;
        this.amountOfWork = amountOfWork;
        this.control = control;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public List<KSS> getKssInputList() {
        return kssInputList;
    }

    public void setKssInputList(List<KSS> kssInputList) {
        this.kssInputList = kssInputList;
    }

    public List<KSS> getKssOutputList() {
        return kssOutputList;
    }

    public void setKssOutputList(List<KSS> kssOutputList) {
        this.kssOutputList = kssOutputList;
    }

    public Map<TypeOfWork, Integer> getAmountOfWork() {
        return amountOfWork;
    }

    public void setAmountOfWork(Map<TypeOfWork, Integer> amountOfWork) {
        this.amountOfWork = amountOfWork;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                ", kssInputList=" + kssInputList +
                ", kssOutputList=" + kssOutputList +
                ", amountOfWork=" + amountOfWork +
                ", control=" + control +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return hours == that.hours && Objects.equals(name, that.name) && Objects.equals(kssInputList, that.kssInputList) && Objects.equals(kssOutputList, that.kssOutputList) && Objects.equals(amountOfWork, that.amountOfWork) && Objects.equals(control, that.control);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hours, kssInputList, kssOutputList, amountOfWork, control);
    }
}
