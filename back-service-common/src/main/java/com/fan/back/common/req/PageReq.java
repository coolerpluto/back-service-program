package com.fan.back.common.req;

import lombok.Data;

@Data
public class PageReq {
    private Integer currentPage = 1;
    private Integer pageSize = 10;
}
