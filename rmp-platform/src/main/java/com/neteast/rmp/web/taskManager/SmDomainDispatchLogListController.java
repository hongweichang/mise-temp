/**
 * 
 */
package com.neteast.rmp.web.taskManager;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.seraph.bi.suite.support.web.base.BaseHelper;

/**
 * 类说明:<br>
 * 创建时间: <br>
 * @author <br>
 * @email:<br>
 */
 
@Controller
@RequestMapping("/smDomainDispatchLogList.do")
public class SmDomainDispatchLogListController extends AbstractController {

	@RequestMapping(method = { RequestMethod.POST })
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("uxParams",request.getParameter("uxParams"));
		
		return new ModelAndView("/platform/taskManager/smDomainDispatchLogList", map);
	}
}