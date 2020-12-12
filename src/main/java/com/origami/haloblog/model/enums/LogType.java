package com.origami.haloblog.model.enums;

/**
 * @author origami1203
 * @date 2020-12-10 15:49
 * @description 日志类型
 */

public enum LogType {
    /**
     * 博客初始化
     */
    BLOG_INITIALIZED(0),

    /**
     * 文章发布
     */
    POST_PUBLISHED(5),

    /**
     * 文章编辑
     */
    POST_EDITED(15),

    /**
     * 文章删除
     */
    POST_DELETED(20),

    /**
     * 登录
     */
    LOGGED_IN(25),

    /**
     * 登出
     */
    LOGGED_OUT(30),

    /**
     * 日志记录失败
     */
    LOGIN_FAILED(35),

    /**
     * 密码更改
     */
    PASSWORD_UPDATED(40),

    /**
     * 配置文件更改
     */
    PROFILE_UPDATED(45),

    /**
     * 工作表已发布
     */
    SHEET_PUBLISHED(50),

    /**
     * 工作表编辑
     */
    SHEET_EDITED(55),

    /**
     * 工作表删除
     */
    SHEET_DELETED(60),

    /**
     * MFA更新
     */
    MFA_UPDATED(65),

    /**
     * 日志预检查
     */
    LOGGED_PRE_CHECK(70);

    LogType(Integer value) {
    }
}
