/*
 * Copyright (c) 2017. <a href="http://www.lufengc.com">lufengc</a> All rights reserved.
 */

package com.bdfint.backend.modules.gen.mapper;

import com.bdfint.backend.framework.common.CommonMapper;
import com.bdfint.backend.modules.gen.bean.GenTable;
import com.bdfint.backend.modules.gen.bean.GenTableColumn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Mapper
@Repository
public interface GenTableMapper extends CommonMapper<GenTable> {

    List<GenTable> findTableList(@Param("name") String name);

    List<GenTableColumn> findTableColumnList(@Param("name") String name);

    List<String> findTablePK(@Param("name") String name);
}
