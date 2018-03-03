package cn.e3mall.mapper;

import cn.e3mall.domain.TbOrder;
import java.util.List;

public interface TbOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrder record);

    TbOrder selectByPrimaryKey(String orderId);

    List<TbOrder> selectAll();

    int updateByPrimaryKey(TbOrder record);
}