package controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import pojo.users;
import pojo.users_type;

import service.usersService;
import service.users_typeService;
import tools.PageSupport;

@Controller
@RequestMapping("invsys")
public class MemberShipMsController {
    
	@Resource
	private users_typeService service;
	public users_typeService getService() {
		return service;
	}

	public void setService(users_typeService service) {
		this.service = service;
	}

	@Resource
	private usersService usersService;
	public usersService getUsersService() {
		return usersService;
	}

	public void setUsersService(usersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/login.html")
	public String s(){
		return "login";		
	}
	@ResponseBody
	@RequestMapping("/user.json")
	public Object login(@RequestParam(value="userName",required=false) String userName,
			@RequestParam(value="password",required=false)  String password,HttpSession session){
		System.out.println("用户名"+userName);
		System.out.println(password);
	users user=	usersService.slectUser(userName, password);
	 session.setAttribute(tools.Constants.user, user);
	HashMap<String, String> map=new HashMap<String, String>();
		if (user!=null) {
			if (user.getSTATUS()==0) {
				map.put("delResult", "emm");
			} else {
				map.put("delResult", "true");			
			}		
		} else {
			map.put("delResult", "false");
            
		} 
	return JSON.toJSONString(map);
    }
	
	@RequestMapping("/usermodify.html")
	public String ss(HttpSession s,Model model){
		users u=new users();
		  u.setTypeid(((users)s.getAttribute(tools.Constants.user)).getTypeid());
		   u.setNAME(((users)s.getAttribute(tools.Constants.user)).getNAME());
		   u.setPassword(((users)s.getAttribute(tools.Constants.user)).getPassword());
		   int id=((users)s.getAttribute(tools.Constants.user)).getTypeid();
		  users_type user=  service.u(id);
		   model.addAttribute("users_type", user);
		return "user";		
	}
	
	@RequestMapping("/userlist")
	   public String select(@RequestParam(value="NAME",required=false) String NAME,
			   @RequestParam(value="pageIndex",required=false) String pageIndex,Model model){
		   
		 //创建page对象
		   PageSupport page = new PageSupport();
		   //1、设置页面大小
		   page.setPageSize(5);
		   		
		   //2、设置当前页
		   int pageIndexId = 1;
	       if (pageIndex!=null && !pageIndex.equals("")) {
			page.setCurrentPageNo(Integer.parseInt(pageIndex));
		   } else {
			   page.setCurrentPageNo(pageIndexId);
		   }
		  
		   		
		   //3、设置总条数/设置总页数
	         int totalCount=  usersService.usercount(NAME);
		     page.setTotalCount(totalCount);
		   		
		   //4、设置集合列表
		   		List<users> list=usersService.userselect
		   				(NAME, page.getCurrentPageNo(),page.getPageSize() );
	        page.setUserlist(list);
	        model.addAttribute("list", list);
	        model.addAttribute("page", page);
		    return "userlist";
		   
	   }
	
	@RequestMapping("/updata1.html")
	public String ss(Model model,HttpSession s){

		   String pa=((users)s.getAttribute(tools.Constants.user)).getPassword();
		
		   model.addAttribute("userss", pa);
		return "updata";		
	}
	@ResponseBody
	@RequestMapping("/updata.json")
	public Object updata(@RequestParam(value="password",required=false) String password,HttpSession session){
		  int id=((users)session.getAttribute(tools.Constants.user)).getId();
		int i=usersService.updata(id, password);
		HashMap<String, String> map=new HashMap<String, String>();
			if (i>0) {			
					map.put("delResult", "true");				
			} else {
				map.put("delResult", "false");
	            
			} 
		return JSON.toJSONString(map);
	}
}
