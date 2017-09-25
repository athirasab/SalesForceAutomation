package com.oracle.demo.view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.nav.RichCommandNavigationItem;
import oracle.adf.view.rich.component.rich.nav.RichNavigationPane;

public class Employees {
    private RichForm f1;
    private RichDocument d1;
    private RichNavigationPane np1;
    private RichCommandNavigationItem ni1;
    private RichCommandNavigationItem cni1;
    private RichCommandNavigationItem cni2;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setNp1(RichNavigationPane np1) {
        this.np1 = np1;
    }

    public RichNavigationPane getNp1() {
        return np1;
    }

    public void setNi1(RichCommandNavigationItem ni1) {
        this.ni1 = ni1;
    }

    public RichCommandNavigationItem getNi1() {
        return ni1;
    }

    public void setCni1(RichCommandNavigationItem cni1) {
        this.cni1 = cni1;
    }

    public RichCommandNavigationItem getCni1() {
        return cni1;
    }

    public void setCni2(RichCommandNavigationItem cni2) {
        this.cni2 = cni2;
    }

    public RichCommandNavigationItem getCni2() {
        return cni2;
    }
}
