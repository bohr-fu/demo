//package com.bohr.systemgatewayzuul.filter;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 网关异常处理过滤器
// * @author Bohr
// */
//public class ZuulErrorFilter extends ZuulFilter {
//
//    Logger log = LoggerFactory.getLogger(ZuulErrorFilter.class);
//
//
//    /**
//     * 过滤器类型（pre route post error）
//     * @return
//     */
//    @Override
//    public String filterType() {
//        return "error";
//    }
//
//    /**
//     *  过滤顺序
//     * @return
//     */
//    @Override
//    public int filterOrder() {
//        return 10;
//    }
//
//    /**
//     *  过滤策略
//     * @return
//     */
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    /**
//     *  执行动作
//     * @return
//     * @throws ZuulException
//     */
//    @Override
//    public Object run() throws ZuulException {
//        // 获取请求上下文
//        RequestContext context = RequestContext.getCurrentContext();
//        Throwable throwable = context.getThrowable();
//        log.error("This is ZuulErrorFilter : {}",throwable.getCause().getMessage());
//        context.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
//        context.set("error.exception",throwable.getCause());
//        return null;
//    }
//}
