package com.src.collection.impl;

import com.src.collection.DataCollection;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 驱动加载，开始采集
 * Created by Asus on 2019/1/2.
 */
@Service
public class DataCollectionImpl implements DataCollection{

  /*  @Autowired
    private RedisLock redisLock;
*/

  /**模拟单线采集功能，数据标准化
     * 开启线程每隔一秒生成随机数写入map对象
     */
    @Override
    public void startCollection() {
        ArrayList<Long> StreamData =new ArrayList<>();
        Timer executeSchedule=new Timer();
        executeSchedule.schedule(new TimerTask() {
            @Override
            public void run() {
                StreamData.add(System.currentTimeMillis());
            }
        },0,500);
    }

    /**停止采集**/
    @Override
    public void stopCollection() {

    }

    /**展示数据**/
    @Override
    public void showCollection() {

    }

    /**完成数据采集并储存数据**/
    @Override
    public void confirmCollection() {

    }

    public HashMap<String,Double>  createRandData(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dataTime=df.format(new Date());// new Date()为获取当前系统时间
        double dataValue=(int)(Math.random()*100);

        HashMap<String,Double> map=new HashMap<>();
        map.put(dataTime,dataValue);
        return map;
    }




}
