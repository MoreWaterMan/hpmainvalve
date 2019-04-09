package com.src.collection.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Asus on 2019/1/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DataCollectionImplTest {

    @Autowired
    private DataCollectionImpl dataCollection;

    @Test
    public void startCollection() throws Exception {
    }

}