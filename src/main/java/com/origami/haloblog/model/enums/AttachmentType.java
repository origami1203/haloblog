package com.origami.haloblog.model.enums;

public enum AttachmentType {
    /**
     * 服务器
     */
    LOCAL(0),

    /**
     * 又拍云
     */
    UPOSS(1),

    /**
     * 七牛云
     */
    QINIUOSS(2),

    /**
     * sm.ms
     */
    SMMS(3),

    /**
     * 阿里云
     */
    ALIOSS(4),

    /**
     * 百度云
     */
    BAIDUBOS(5),

    /**
     * 腾讯云
     */
    TENCENTCOS(6),

    /**
     * 华为云
     */
    HUAWEIOBS(7),

    /**
     * MINIO
     */
    MINIO(8);

    AttachmentType(Integer value) {
    }
}
