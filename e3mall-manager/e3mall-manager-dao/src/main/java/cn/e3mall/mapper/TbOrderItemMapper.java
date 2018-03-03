package cn.e3mall.mapper;

import cn.e3mall.domain.TbOrderItem;
import java.util.List;

public interface TbOrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbOrderItem record);

    TbOrderItem selectByPrimaryKey(String id);

    List<TbOrderItem> selectAll();

    int updateByPrimaryKey(TbOrderItem record);
}