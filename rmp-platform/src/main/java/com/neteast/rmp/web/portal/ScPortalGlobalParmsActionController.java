/**
 * 
 */
package com.neteast.rmp.web.portal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seraph.bi.suite.support.util.json.JsonUtils;
import com.seraph.bi.suite.support.util.BeanUtils;
import com.seraph.bi.suite.support.web.base.BaseResponse;
import com.seraph.bi.suite.support.web.json.JsonActionProviderController;

import com.neteast.rmp.dao.ScPortalGlobalParmsDAO;
import com.neteast.rmp.dao.domain.ScPortalGlobalParms;
/**
 * 类说明:<br>
 * 创建时间: 2011-01-12<br>
 * @author <br>
 * @email:<br>
 */
@Controller
@RequestMapping("/scPortalGlobalParmsAction.do")
public class ScPortalGlobalParmsActionController extends JsonActionProviderController {


	private static final Logger log = Logger.getLogger(ScPortalGlobalParmsActionController.class);
	
	@Autowired
	private ScPortalGlobalParmsDAO scPortalGlobalParmsDAO;

	public void setScPortalGlobalParmsDAO(ScPortalGlobalParmsDAO scPortalGlobalParmsDAO) {
		this.scPortalGlobalParmsDAO = scPortalGlobalParmsDAO;
	}

	/**
	 * 功能说明: 查询单条记录<br>
	 * 创建时间: 2011-1-12 <br>
	 * @author: 徐信信<br>
	 */
	public Object onRetrieve(String[] keyNames, Object entity) {		
		ScPortalGlobalParms scPortalGlobalParms=null;

		try{		
		   		scPortalGlobalParms= scPortalGlobalParmsDAO.selectByPrimaryKey(Integer.parseInt(BeanUtils.getProperty(entity, keyNames[0])));
		} catch(Exception e){
			Throwable t = e.getCause();
			if (t.getMessage() == null || "".endsWith(t.getMessage())) {
				t = t.getCause();
			}
			String message = "查询失败！异常信息：[" + t.getMessage() + "]";
			log.debug(message);
			return new BaseResponse(BaseResponse.FALSE, message);
		}
		return scPortalGlobalParms;
	}

	/**
	 * 
	 */
	public Object onCreate(String[] keyNames, Object entity) {
		//添加信息
		BaseResponse baseResponse = null;
		try {
			scPortalGlobalParmsDAO.insert((ScPortalGlobalParms)entity);
			baseResponse = new BaseResponse(BaseResponse.TRUE, "添加成功！");
		} catch (Exception e) {
			Throwable t = e.getCause();
			if (t.getMessage() == null || "".endsWith(t.getMessage())) {
				t = t.getCause();
			}
			String message = "操作失败！异常信息：[" + t.getMessage() + "]";
			log.debug(message);
			baseResponse = new BaseResponse(BaseResponse.FALSE, message);
		}
		return baseResponse;
	}

	/**
	 * 
	 */
	public Object onUpdate(String[] keyNames, Object entity) {

		//修改信息
		BaseResponse baseResponse = null;
		try {
			scPortalGlobalParmsDAO.updateByPrimaryKeyForCgs((ScPortalGlobalParms)entity);
			baseResponse = new BaseResponse(BaseResponse.TRUE, "修改成功！");
		} catch (Exception e) {
			Throwable t = e.getCause();
			if (t.getMessage() == null || "".endsWith(t.getMessage())) {
				t = t.getCause();
			}
			String message = "修改失败！异常信息：[" + t.getMessage() + "]";
			log.debug(message);
			baseResponse = new BaseResponse(BaseResponse.FALSE, message);
		}
		return baseResponse;
	}

	/**
	 * 
	 */
	public Object onDelete(String[] keyNames, Object entity) {

		BaseResponse baseResponse=null;
		try{		
		   		scPortalGlobalParmsDAO.deleteByPrimaryKey(Integer.parseInt(BeanUtils.getProperty(entity, keyNames[0])));
		   baseResponse = new BaseResponse(BaseResponse.TRUE, "删除成功！");						
		} catch(Exception e){
			Throwable t = e.getCause();
			if (t.getMessage() == null || "".endsWith(t.getMessage())) {
				t = t.getCause();
			}
			String message = "删除失败！异常信息：[" + t.getMessage() + "]";
			log.debug(message);
			baseResponse = new BaseResponse(BaseResponse.FALSE, message);	
		}
		return baseResponse;		
	}

	@Override
	protected Object onBind(HttpServletRequest request,
			HttpServletResponse response) {
		
		String record = request.getParameter("record");	
		return JsonUtils.toBean(record, ScPortalGlobalParms.class);
	}

}
