/*
 * Copyright (c) 2017. <a href="http://www.lufengc.com">lufengc</a> All rights reserved.
 */
package com.bdfint.backend.modules.sys.service;


import com.bdfint.backend.framework.common.BaseService;
import com.bdfint.backend.modules.sys.bean.Area;

import java.util.List;

/**
 * 区域Service
 *
 * @author fengcheng
 * @version 2016/7/28
 */
public interface AreaService extends BaseService<Area> {

    /**
     * 根据parentId查询子节点列表
     *
     * @param id parentId
     * @return 子节点集合
     */
    List<Area> findChildList(String id);
}
