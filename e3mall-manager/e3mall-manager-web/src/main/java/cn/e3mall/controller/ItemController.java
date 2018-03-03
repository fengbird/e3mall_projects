package cn.e3mall.controller;

import cn.e3mall.domain.TbItem;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tengchao
 * @create 2018-03-03-19:22.
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("findItemById/{itemId}")
    @ResponseBody
    public TbItem findItemById(@PathVariable Long itemId) {
        TbItem item = itemService.findItemById(itemId);
        return item;
    }
}
