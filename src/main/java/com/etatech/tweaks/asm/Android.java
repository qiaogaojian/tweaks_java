package com.etatech.tweaks.asm;


import com.etatech.tweaks.android.View;

public class Android
{
    View testView = null;

    public void main(String[] args) {
        testView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                traceClick(v);
            }
        });
    }

    public void clicker(View view) {
        traceClick(view);
    }

    public void traceClick(View view) {
        System.out.println("ASM 测试, 点击View：" + view.getId());
    }
}
