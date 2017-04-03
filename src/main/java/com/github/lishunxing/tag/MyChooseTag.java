package com.github.lishunxing.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by guoke on 2017/3/30.
 */
public class MyChooseTag extends SimpleTagSupport {

    private boolean flag=true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(null);
    }
}
