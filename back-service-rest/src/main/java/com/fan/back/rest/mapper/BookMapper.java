package com.fan.back.rest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fan.back.rest.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
