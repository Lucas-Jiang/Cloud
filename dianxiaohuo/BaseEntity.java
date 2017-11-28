package com.dxh.base.common;

import com.migr.common.util.base.Lable;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类
 * 1.放置共用字段
 * 2.进行共用操作
 * create by lucas on 2017/11/20
 */
 @Getter
 @Setter
public class BaseEntity extends GridPager {

    private Long id;//记录ID
    private Integer version;//数据版本
    private String memo;//备注
    private Integer df;//是否已删除1删除 0正常

    private String creator;//创建人
    private Date createDate;//创建日期
    private String mender;//最后修改人
    private Date modifyDate;//修改日期

    private Date startDate;//开始时间
    private Date endDate;//结束时间
    private String searchValue;//模糊查询
}
