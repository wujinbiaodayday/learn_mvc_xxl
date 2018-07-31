package web.com.controller;

//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import org.springframework.web.bind.annotation.ModelAttribute;
@Controller("baseController")
public class BaseController {

//	protected HttpServletRequest request;
//	protected HttpServletResponse response;
//	protected HttpSession session;

//	@ModelAttribute
//	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
//
//		String scheme = request.getHeader("X-Forwarded-Proto");
////		String baseUrl = (null == scheme ? "http" : scheme) + "://" + request.getServerName()
////				+ request.getContextPath();
//		String baseUrl = (null == scheme ? "http" : scheme) + "://" + request.getServerName() + ":" + request.getServerPort() + "/"
//				+ request.getContextPath() ;
//		this.request = request;
//		this.request.setAttribute("baseUrl",baseUrl);
//		this.response = response;
//		this.session = request.getSession();
//	}

	public String getBaseUrl() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String scheme = request.getHeader("X-Forwarded-Proto");
		String baseUrl = (null == scheme ? "http" : scheme) + "://" + request.getServerName() + ":" + request.getServerPort() + "/"
				+ request.getContextPath() ;
		return baseUrl;
	}


}
