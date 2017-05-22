package com.bdfint.backend.modules.cms.mapper;

import com.bdfint.backend.framework.common.CommonMapper;
import com.bdfint.backend.modules.cms.bean.Guestbook;
import com.bdfint.backend.modules.cms.bean.Link;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author fengcheng
 * @version 2017/2/28
 */
@Mapper
@Repository
public interface LinkMapper extends CommonMapper<Link> {

}
