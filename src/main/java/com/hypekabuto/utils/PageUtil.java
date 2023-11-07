package com.hypekabuto.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;

import lombok.Data;

import java.util.List;

@Data
public class PageUtil<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;
    public static <T> PageUtil<T> resultPage(IPage<T> list){
        PageUtil<T> result = new PageUtil<T>();
        int pages = (int)list.getPages();
        result.setTotalPage(pages);
        int current = (int)list.getCurrent();
        result.setPageNum(current);
        int pageSize = (int)list.getSize();
        result.setPageSize(pageSize);
        result.setTotal(list.getTotal());
        result.setList(list.getRecords());
        return result;
    }
}
