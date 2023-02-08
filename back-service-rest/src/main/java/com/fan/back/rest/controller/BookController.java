package com.fan.back.rest.controller;

import com.fan.back.common.req.BookReq;
import com.fan.back.common.req.PageReq;
import com.fan.back.common.res.BookRes;
import com.fan.back.common.res.PageRes;
import com.fan.back.common.res.ResultBody;
import com.fan.back.rest.entity.Book;
import com.fan.back.rest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @Autowired
    private BookService bookService;
    
    @GetMapping("/booksByCategory")
    public ResultBody<PageRes<BookRes>> getAllBooksByCategory(BookReq bookReq, PageReq pageReq){
        PageRes<BookRes> allBooksByCategory = bookService.getAllBooksByCategory(bookReq, pageReq);
        return ResultBody.success(allBooksByCategory);
    }
}
