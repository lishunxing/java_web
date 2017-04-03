package com.github.lishunxing.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by guoke on 2017/3/30.
 */
public class MyOtherTag extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        MyChooseTag parent = (MyChooseTag) getParent();
        if(parent.isFlag()){
            //判断父标签flag为true就执行
            getJspBody().invoke(null);
        }
    }
}
