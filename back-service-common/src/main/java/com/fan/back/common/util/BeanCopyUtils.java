package com.fan.back.common.util;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fan.back.common.ex.CommonException;
import com.fan.back.common.res.PageRes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BeanCopyUtils {
    public static <T> T commonCopy(Object source, Class<T> target) throws CommonException {
        T t;
        try {
            t = target.getConstructor().newInstance();
            BeanUtils.copyProperties(source, t, getNullProperty(source));
        } catch (Exception e) {
            throw new CommonException(e.getMessage());
        }
        return t;
    }

    public static <T> T commonCopy(Object source, Class<T> target, String... ingores) throws CommonException {
        T t;
        try {
            t = target.getConstructor().newInstance();
            BeanUtils.copyProperties(source, t, ingores);
        } catch (Exception e) {
            throw new CommonException(e.getMessage());
        }
        return t;
    }

    public static void commonCopy(Object source, Object target) throws CommonException {
        try {
            BeanUtils.copyProperties(source, target, getNullProperty(source));
        } catch (Exception e) {
            throw new CommonException(e.getMessage());
        }
    }

    public static <T> List<T> copyList(List<?> list, Class<T> target) {
        List<T> res = new ArrayList<>();
        try {
            for (Object o : list) {
                T t = target.getConstructor().newInstance();
                commonCopy(o, t);
                res.add(t);
            }
        } catch (Exception e) {
            throw new CommonException(e.getMessage());
        }
        return res;
    }


    public static <T> PageRes<T> copyIPageToPageRes(IPage<?> page, Class<T> target) {
        List<T> ts = copyList(page.getRecords(), target);
        PageRes<T> pageRes = new PageRes<>();
        pageRes.setRecords(ts);
        pageRes.setCurrentPage(page.getCurrent());
        pageRes.setPageSize(page.getSize());
        pageRes.setTotal(page.getTotal());
        return pageRes;
    }

    public static String[] getNullProperty(Object source) {
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(source);
        Set<String> nullValues = new HashSet<>();
        for (PropertyDescriptor propertyDescriptor : beanWrapper.getPropertyDescriptors()) {
            Object value = beanWrapper.getPropertyValue(propertyDescriptor.getName());
            if (value == null) {
                nullValues.add(propertyDescriptor.getName());
            }
        }

        return nullValues.toArray(new String[0]);
    }
    
}