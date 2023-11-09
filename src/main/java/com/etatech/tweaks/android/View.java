package com.etatech.tweaks.android;

public class View
{
    private String          id;
    private OnClickListener listener;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    public interface OnClickListener
    {
        void onClick(View view);
    }
}
