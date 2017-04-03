package com.github.lishunxing.tag;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by guoke on 2017/4/3.
 */
public class MyDateFormatFunction {

    public static String format(Date date,String partten){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(partten);
        String format = simpleDateFormat.format(date);
        return format;
    }
}
