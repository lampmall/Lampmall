package com.lamp.service;

import com.lamp.dao.RoleDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
@Service
public class RoleService {
    @Resource
    private RoleDao rd;
}
