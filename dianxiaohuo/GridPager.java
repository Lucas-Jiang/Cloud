package com.migr.common.util.base;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class GridPager implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer length = Integer.valueOf(15);//页面显示条数
    private Integer currentPage = Integer.valueOf(1);//当前页面
    private Integer totalPages = Integer.valueOf(0);//共计页面数
    private Integer start = Integer.valueOf(0);//开始数据
    private Integer total = Integer.valueOf(0);//共计数据条数

    private String sortBy = "1";//排序字段
    private String sortType = "desc";//排序方式

    public GridPager() {
      if (length.intValue() < 1) {
          length = Integer.valueOf(1);
      }
      if (currentPage.intValue() < 1) {
          currentPage = Integer.valueOf(1);
      }
      this.start = (this.currentPage.intValue() - 1) * this.length.intValue();
      this.totalPages = this.total.intValue() / this.length.intValue();
    }
}
