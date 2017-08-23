package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TBItemService;

/****************************************
 * @2017年8月23日
 * @author lyl
 * @describe
 * 商品类的表现层
 ********************/
@Controller
public class TBItemController {

	@Autowired
	private TBItemService tBItemService;
	
	@RequestMapping("findById/{itemId}")
	@ResponseBody
	public TbItem findById(@PathVariable long itemId){
		TbItem tbItem = tBItemService.selectById(itemId);
		return tbItem;
	}
}
