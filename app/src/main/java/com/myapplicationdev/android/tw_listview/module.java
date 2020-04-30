package com.myapplicationdev.android.tw_listview;

public class module {

    private String moduleCode;
    private boolean prog;

    module(String moduleCode, boolean prog) {
        this.moduleCode = moduleCode;
        this.prog = prog;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public boolean isProg() {
        return prog;
    }

    public void setProg(boolean prog) {
        prog = prog;
    }
}
