package com.fan.back.common.res;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class PageRes<T> {

    /**
     * 查询数据列表
     */
    protected List<T> records = Collections.emptyList();

    /**
     * 总数
     */
    protected long total = 0;
    /**
     * 每页显示条数，默认 10
     */
    protected long pageSize = 10;

    /**
     * 当前页
     */
    protected long currentPage = 1;
}