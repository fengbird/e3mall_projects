package cn.e3mall.mapper;

import cn.e3mall.domain.TbItemDesc;
import java.util.List;

public interface TbItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(TbItemDesc record);

    TbItemDesc selectByPrimaryKey(Long itemId);

    List<TbItemDesc> selectAll();

    int updateByPrimaryKey(TbItemDesc record);
}