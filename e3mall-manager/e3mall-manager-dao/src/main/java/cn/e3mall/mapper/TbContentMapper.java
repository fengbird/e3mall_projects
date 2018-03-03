package cn.e3mall.mapper;

import cn.e3mall.domain.TbContent;
import java.util.List;

public interface TbContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    TbContent selectByPrimaryKey(Long id);

    List<TbContent> selectAll();

    int updateByPrimaryKey(TbContent record);
}