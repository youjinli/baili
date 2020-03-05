package com.chenbaili.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateForYaerSQL {
    public static void main(String[] args) throws ParseException {
        Map<Long,Integer> map = getEveryDayTimestamp();
        String sql ="INSERT INTO `config_work_day` (`date`, `week`, `work_flag`,`vacation_desc`) VALUES ('%s', '%s', '%s','%s');";
        for (Map.Entry<Long,Integer> entry : map.entrySet()){
            String date = String.valueOf(entry.getKey());
            String week = String.valueOf(entry.getValue());
            String workFlag = entry.getValue() ==6 || entry.getValue()==7 ? "0" : "1";
            String vacationDesc = "";
            String realSql = String.format(sql,date,week,workFlag,vacationDesc);
            System.out.println(realSql);
        }
    }

    /**
     * 获取每天零点时间戳
     * @return
     */
    public static Map<Long,Integer> getEveryDayTimestamp() {
        Map<Long,Integer> map = new LinkedHashMap<>();
        // 获取当前时间
        Calendar cal = Calendar.getInstance();
        // 下面可以设置月份，注：月份设置要减1，所以设置1月就是1-1，设置2月就是2-1，如此类推
        cal.set(Calendar.MONTH, 1 - 1);

        for (int i = 0; i < 365; i++) {
            // 按你的要求设置时间
            cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH) + 1, 00, 00, 00);
            // 按年月日时分秒格式输出
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //System.out.println(sdf.format(cal.getTime()));
            // 按时间戳
            long getEveryDayZeroTimestamp = cal.getTime().getTime() / 1000;
            Integer week = cal.get(Calendar.DAY_OF_WEEK) -1;
            map.put(getEveryDayZeroTimestamp,week == 0 ? 7: week);
            //System.out.println(map);

        }
        System.out.println(map);
        return map;
    }

}


