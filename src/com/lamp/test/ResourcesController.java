package com.lamp.test;

import com.lamp.service.ResourcesService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/20 0020.
 */
@Controller
public class ResourcesController {
    @Resource
    private ResourcesService rs;
}
