
package com.dxh.base.common;

import java.io.Serializable;

/**
 * 前台操作提示类
 */
public class  OpResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private int status;//1 成功  0失败
    private String message;//提示信息
    private Object dataValue;//数据值

    public OpResult(int status, String message) {
    this.status = status;
    this.message = message;
    }

    public static final int OP_SUCCESS = 1;
    public static final int OP_FAILED = 0;
    public static final class OP_Msg {
        public static final String OP_SUCCESS = "操作成功";
        public static final String OP_FAIL = "操作失败";
        public static final String SAVE_SUCCESS = "保存成功";
        public static final String SAVE_FAIL = "保存失败";
        public static final String MODIFY_SUCCESS = "修改成功";
        public static final String MODIFY_FAIL = "修改失败";
        public static final String DELETE_SUCCESS = "删除成功";
        public static final String DELETE_FAIL = "删除失败";
        public static final String SEARCH_SUCCESS = "查询成功";
        public static final String SEARCH_FAILED = "查询失败,请刷新后重试！";
    }
}
