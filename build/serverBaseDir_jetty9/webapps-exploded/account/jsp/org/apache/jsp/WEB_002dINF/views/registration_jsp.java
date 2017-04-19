package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_placeholder_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_type_placeholder_path_class_autofocus_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_method_class;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_placeholder_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_type_placeholder_path_class_autofocus_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_method_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_spring_bind_path.release();
    _jspx_tagPool_form_errors_path_nobody.release();
    _jspx_tagPool_form_input_type_placeholder_path_class_nobody.release();
    _jspx_tagPool_form_input_type_placeholder_path_class_autofocus_nobody.release();
    _jspx_tagPool_form_form_modelAttribute_method_class.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Create an account</title>\n");
      out.write("\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/common.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_method_class.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_0.setPageContext(_jspx_page_context);
      _jspx_th_form_form_0.setParent(null);
      _jspx_th_form_form_0.setMethod("POST");
      _jspx_th_form_form_0.setModelAttribute("userForm");
      _jspx_th_form_form_0.setDynamicAttribute(null, "class", new String("form-signin"));
      int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
        if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("        <h2 class=\"form-signin-heading\">Create your account</h2>\n");
            out.write("        ");
            //  spring:bind
            org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
            _jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
            _jspx_th_spring_bind_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_spring_bind_0.setPath("username");
            int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
            try {
              int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
              if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <div class=\"form-group ");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error ? 'has-error' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\n");
                  out.write("                ");
                  if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_0, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
                    return;
                  out.write("\n");
                  out.write("                ");
                  //  form:errors
                  org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
                  _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
                  _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
                  _jspx_th_form_errors_0.setPath("username");
                  int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
                    if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_errors_0[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_errors_0.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_errors_0.doFinally();
                    _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_0);
                  }
                  out.write("\n");
                  out.write("            </div>\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_spring_bind_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_spring_bind_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_bind_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_bind_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_bind_0.doFinally();
              _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_0);
            }
            out.write("\n");
            out.write("\n");
            out.write("        ");
            //  spring:bind
            org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
            _jspx_th_spring_bind_1.setPageContext(_jspx_page_context);
            _jspx_th_spring_bind_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_spring_bind_1.setPath("password");
            int[] _jspx_push_body_count_spring_bind_1 = new int[] { 0 };
            try {
              int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
              if (_jspx_eval_spring_bind_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <div class=\"form-group ");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error ? 'has-error' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\n");
                  out.write("                ");
                  if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_1, _jspx_page_context, _jspx_push_body_count_spring_bind_1))
                    return;
                  out.write("\n");
                  out.write("                ");
                  //  form:errors
                  org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
                  _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
                  _jspx_th_form_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_1);
                  _jspx_th_form_errors_1.setPath("password");
                  int[] _jspx_push_body_count_form_errors_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_errors_1 = _jspx_th_form_errors_1.doStartTag();
                    if (_jspx_th_form_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_errors_1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_errors_1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_errors_1.doFinally();
                    _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_1);
                  }
                  out.write("\n");
                  out.write("            </div>\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_spring_bind_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_spring_bind_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_bind_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_bind_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_bind_1.doFinally();
              _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_1);
            }
            out.write("\n");
            out.write("\n");
            out.write("        ");
            //  spring:bind
            org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
            _jspx_th_spring_bind_2.setPageContext(_jspx_page_context);
            _jspx_th_spring_bind_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_spring_bind_2.setPath("passwordConfirm");
            int[] _jspx_push_body_count_spring_bind_2 = new int[] { 0 };
            try {
              int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
              if (_jspx_eval_spring_bind_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <div class=\"form-group ");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error ? 'has-error' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\n");
                  out.write("                ");
                  if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_2, _jspx_page_context, _jspx_push_body_count_spring_bind_2))
                    return;
                  out.write("\n");
                  out.write("                ");
                  //  form:errors
                  org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
                  _jspx_th_form_errors_2.setPageContext(_jspx_page_context);
                  _jspx_th_form_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_2);
                  _jspx_th_form_errors_2.setPath("passwordConfirm");
                  int[] _jspx_push_body_count_form_errors_2 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_errors_2 = _jspx_th_form_errors_2.doStartTag();
                    if (_jspx_th_form_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_errors_2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_errors_2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_errors_2.doFinally();
                    _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_2);
                  }
                  out.write("\n");
                  out.write("            </div>\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_spring_bind_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_spring_bind_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_bind_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_bind_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_bind_2.doFinally();
              _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_2);
            }
            out.write("\n");
            out.write("\n");
            out.write("\t\t");
            //  spring:bind
            org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
            _jspx_th_spring_bind_3.setPageContext(_jspx_page_context);
            _jspx_th_spring_bind_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
            _jspx_th_spring_bind_3.setPath("email");
            int[] _jspx_push_body_count_spring_bind_3 = new int[] { 0 };
            try {
              int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
              if (_jspx_eval_spring_bind_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("            <div class=\"form-group ");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error ? 'has-error' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
                  out.write("\">\n");
                  out.write("                ");
                  if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_3, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
                    return;
                  out.write("\n");
                  out.write("                ");
                  //  form:errors
                  org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
                  _jspx_th_form_errors_3.setPageContext(_jspx_page_context);
                  _jspx_th_form_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_3);
                  _jspx_th_form_errors_3.setPath("email");
                  int[] _jspx_push_body_count_form_errors_3 = new int[] { 0 };
                  try {
                    int _jspx_eval_form_errors_3 = _jspx_th_form_errors_3.doStartTag();
                    if (_jspx_th_form_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_form_errors_3[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_form_errors_3.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_form_errors_3.doFinally();
                    _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_3);
                  }
                  out.write("\n");
                  out.write("            </div>\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_spring_bind_3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_spring_bind_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_bind_3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_bind_3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_bind_3.doFinally();
              _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_3);
            }
            out.write("\n");
            out.write("        \n");
            out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Submit</button>\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_0.doFinally();
        _jspx_tagPool_form_form_modelAttribute_method_class.reuse(_jspx_th_form_form_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- /container -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("contextPath");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_placeholder_path_class_autofocus_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
    _jspx_th_form_input_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_0.setPath("username");
    _jspx_th_form_input_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_0.setDynamicAttribute(null, "placeholder", new String("Username"));
    _jspx_th_form_input_0.setDynamicAttribute(null, "autofocus", new String("true"));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_type_placeholder_path_class_autofocus_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_placeholder_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_1);
    _jspx_th_form_input_1.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_form_input_1.setPath("password");
    _jspx_th_form_input_1.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_1.setDynamicAttribute(null, "placeholder", new String("Password"));
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_type_placeholder_path_class_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_placeholder_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_2);
    _jspx_th_form_input_2.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_form_input_2.setPath("passwordConfirm");
    _jspx_th_form_input_2.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_2.setDynamicAttribute(null, "placeholder", new String("Confirm your password"));
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_type_placeholder_path_class_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_type_placeholder_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_3);
    _jspx_th_form_input_3.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_form_input_3.setPath("email");
    _jspx_th_form_input_3.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_3.setDynamicAttribute(null, "placeholder", new String("Email"));
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_type_placeholder_path_class_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }
}
