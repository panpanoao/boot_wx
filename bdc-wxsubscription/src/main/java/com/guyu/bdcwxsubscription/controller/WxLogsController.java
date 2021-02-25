package com.guyu.bdcwxsubscription.controller;


import com.guyu.bdcwxsubscription.controller.base.BaseController;
import com.guyu.bdcwxsubscription.entity.WxLogsEntity;
import com.guyu.bdcwxsubscription.service.WxLogsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 日志表 前端控制器
 * </p>
 *
 * @author 黄盼
 * @since 2020-12-06
 */
@RestController
@RequestMapping("/wxlogs")
@Slf4j
public class WxLogsController extends BaseController<WxLogsService, WxLogsEntity> {

}

