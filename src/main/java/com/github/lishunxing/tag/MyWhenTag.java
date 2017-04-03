package com.github.lishunxing.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by guoke on 2017/3/30.
 */
public class MyWhenTag extends SimpleTagSupport{

    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void doTag() throws JspException, IOException {
        //判断此标签的flag是否为true
        if(isFlag()){
            //获取父标签,并强制转换为ChooseTag
            MyChooseTag parent = (MyChooseTag) getParent();
            System.out.println(parent.isFlag());
            //获取父标签中的flag,为true就执行标签体中的内容
            if(parent.isFlag()){
                getJspBody().invoke(null);
                //执行完毕设置ChooseTag中的flag为false,让以后的标签不再执行
                parent.setFlag(false);
            }
        }

    }
}
