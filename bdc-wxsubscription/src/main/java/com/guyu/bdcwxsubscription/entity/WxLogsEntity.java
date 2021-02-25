package com.guyu.bdcwxsubscription.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.guyu.bdcwxsubscription.config.annotation.TableReMarks;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 日志表
 * </p>
 *
 * @author 黄盼
 * @since 2020-12-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("wx_logs")
@TableReMarks("日志表")
public class WxLogsEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 日志类型(0记录日志 1异常日志)
     */
    private Integer logType;

    /**
     * 日志内容
     */
    private String logContent;

    /**
     * 请求ip
     */
    private String requestIp;

    /**
     * 请求地址
     */
    private String requestUrl;

    /**
     * 浏览器
     */
    private String requestWeb;


}
