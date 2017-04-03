package com.github.lishunxing.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by guoke on 2017/3/30.
 */
public class MyForEachTag extends SimpleTagSupport {

    //声明要接受的参数,设置set方法,容器会自动注入
    private Collection items;

    private String var;

    public void setItems(Collection items) {
        this.items = items;
    }

    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public void doTag() throws JspException, IOException {
        //1.获取当前JSP页面的PAGE对象
        PageContext pageContext= (PageContext) getJspContext();
        //2.获取迭代器
        Iterator iterator = items.iterator();
        while (iterator.hasNext()){
            //3.迭代过程中把var对应的值设置到attribute中,使得el表达式可以获取
            pageContext.setAttribute(var,iterator.next());
            //4.执行标签中的代码
            getJspBody().invoke(null);
        }
    }
}
