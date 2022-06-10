package com.example.proyecto_spring_html_th;

public class EoiCalendar {
    private String actionText;

    // CONSTRUCTOR

    public EoiCalendar(String action) {
        this.actionText = action;
    }

    // GETTER & SETTER

    public String getActionText() {
        return actionText;
    }

    public void setActionText(String action) {
        this.actionText = action;
    }
}
