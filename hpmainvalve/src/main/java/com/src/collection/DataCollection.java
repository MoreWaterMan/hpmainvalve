package com.src.collection;

/**
 * Created by Asus on 2019/1/2.
 */

public interface DataCollection {

    /**开始通信**/
    void startCollection();

    /**停止通信**/
    void stopCollection();

    /**前端展示采集数据**/
    void showCollection();

    /**确认并存储数据**/
    void confirmCollection();

}
