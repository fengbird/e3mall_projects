package cn.e3mall.mapper;

import cn.e3mall.domain.TbUser;
import java.util.List;

public interface TbUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    TbUser selectByPrimaryKey(Long id);

    List<TbUser> selectAll();

    int updateByPrimaryKey(TbUser record);
}