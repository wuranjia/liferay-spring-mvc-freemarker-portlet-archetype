package ${package}.common.web.freemarker.utils;

import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import ${package}.common.web.freemarker.keys.FreemarkerKeys;

import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;

/**
 * Created by nobrelee on 2/19/14.
 */
public class FreemarkerValueUtil {
    @Autowired
    private LanguageUtil languageUtil;

    /**
     * Adds needed Liferay language utils for retrieving internationalized string from Liferay in freemarker
     *
     * @param request request to retrieve portletconfig from
     * @param model model to add needed utils to
     */
    public void addLanguageUtils(RenderRequest request, Model model) {
        PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
        model.addAttribute(FreemarkerKeys.PORTLETCONFIG, portletConfig);
        model.addAttribute(FreemarkerKeys.LANGUAGEUTIL, languageUtil);
        model.addAttribute(FreemarkerKeys.LOCALE, request.getLocale());
    }
}