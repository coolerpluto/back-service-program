package com.fan.back.rest.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fan.back.common.req.BookReq;
import com.fan.back.common.req.PageReq;
import com.fan.back.common.res.PageRes;
import com.fan.back.common.res.BookRes;
import com.fan.back.common.util.BeanCopyUtils;
import com.fan.back.rest.entity.Book;
import com.fan.back.rest.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    //获取某一个种类,价格高于某个数的所有书籍，使用分页
    public PageRes<BookRes> getAllBooksByCategory(BookReq bookReq, PageReq pageReq) {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.lambda().like(StringUtils.isNotBlank(bookReq.getCategory()), Book::getCategory, bookReq.getCategory())
                .gt(ObjectUtils.isNotEmpty(bookReq.getBookPrice()), Book::getBookPrice, bookReq.getBookPrice());
        IPage<Book> bookPage = bookMapper.selectPage(new Page<>(pageReq.getCurrentPage(), pageReq.getPageSize()), wrapper);
        PageRes<BookRes> bookResPageRes = BeanCopyUtils.copyIPageToPageRes(bookPage, BookRes.class);
        return bookResPageRes;
    }
}