/*
 * package mvc.ajax.filter;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.Filter; import javax.servlet.FilterChain; import
 * javax.servlet.FilterConfig; import javax.servlet.ServletException; import
 * javax.servlet.ServletRequest; import javax.servlet.ServletResponse; import
 * javax.servlet.annotation.WebFilter; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * @WebFilter("/*") public class CorsFilter implements Filter {
 * 
 * 
 * @Override public void init(FilterConfig filterConfig) throws
 * ServletException{ System.out.println("필터작동되나요 +CorsFilter"); }
 * 
 * @Override public void doFilter(ServletRequest req, ServletResponse res,
 * FilterChain chain) throws IOException, ServletException {
 * System.out.println(111111); HttpServletRequest request = (HttpServletRequest)
 * req; HttpServletResponse response = (HttpServletResponse) res;
 * response.setHeader("Access-Control-Allow-Origin", "*");
 * response.setHeader("Access-Control-Allow-Methods",
 * "POST, GET,  , DELETE, PUT"); response.setHeader("Access-Control-Max-Age",
 * "3600"); response.setHeader("Access-Control-Allow-Headers",
 * "Content-Type, Accept, X-Requested-With, remember-me, Authorization"); // 필요한
 * 헤더를 여기에 추가
 * 
 * chain.doFilter(req, res); }
 * 
 * 
 * 
 * }
 */
