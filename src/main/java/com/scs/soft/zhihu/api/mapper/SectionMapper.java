package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author CRQ
 */
public interface SectionMapper {
    /**
     * 根据专题ID查询标签列表
     * @param specialId
     * @return
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId}")
    List<Section> getSectionBySpecialId(String specialId);
}
