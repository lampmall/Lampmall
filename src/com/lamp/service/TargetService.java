package com.lamp.service;

import com.lamp.dao.TargetDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
@Service
public class TargetService {
    @Resource
    private TargetDao tgd;
}
