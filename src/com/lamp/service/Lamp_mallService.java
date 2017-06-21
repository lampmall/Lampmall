package com.lamp.service;

import com.lamp.dao.Lamp_knowledgeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
@Service
public class Lamp_mallService {
    @Resource
    private Lamp_knowledgeDao lkld;
}
