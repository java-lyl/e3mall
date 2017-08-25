package cn.e3mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.Obj2EUdata;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/****************************************
 * @2017年8月23日
 * @author lyl
 * @describe
 * 商品类的表现层
 ********************/
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**
	 * ****************************************
	 * @author lyl
	 * 下午3:02:46
	 * @describe
	 * 根据ID查询
	 * @param itemId
	 * @return
	 *******************
	 */
	@RequestMapping("findById/{itemId}")
	@ResponseBody
	public TbItem findById(@PathVariable long itemId){
		TbItem tbItem = itemService.selectById(itemId);
		return tbItem;
	}
	
	/**
	 * ****************************************
	 * @author lyl
	 * 下午3:14:41
	 * @describe
	 * 跳转首页
	 * @param model
	 * @return
	 *******************
	 */
	@RequestMapping(value="/")
	public String toList( Model model ){
		return "index";
	}
	
	/**
	 * ****************************************
	 * @author lyl
	 * 下午3:16:31
	 * @describe
	 * 跳转指定页面
	 * @param model
	 * @return
	 *******************
	 */
	@RequestMapping(value="/{page}")
	public String showPage(@PathVariable String page, Model model) {
		return page;
	}
	
	/**
	 * ****************************************
	 * @author lyl
	 * 下午4:28:41
	 * @describe
	 * 查询所有,没有分页
	 * @param page
	 * @param rows
	 * @return
	 *******************
	 */
	@RequestMapping(value="/list")
	@ResponseBody
	public List<TbItem> itemList(Integer page, Integer rows) {
		
		return itemService.selectAll();
	}
	
	/**
	 * ****************************************
	 * @author lyl
	 * 下午4:29:23
	 * @describe
	 * 分页查询
	 * @param page
	 * @param rows
	 * @return
	 *******************
	 */
	@RequestMapping(value="/pageList")
	@ResponseBody
	public Obj2EUdata<TbItem> pageList(Integer page, Integer rows) {
		Obj2EUdata<TbItem> items = itemService.selectPageList(page, rows);
		return items;
	}
}
