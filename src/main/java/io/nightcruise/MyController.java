package io.nightcruise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    public static final String HOME_PAGE_TITLE = "Night Cruise";
    public static final String ABOUT_PAGE_TITLE = "About";
    public static final String DEV_PAGE_TITLE = "Developments";
    public static final String SUPER_3_PAGE_TITLE = "SUPER_3";
    public static final String TAR_PAGE_TITLE = "TAR";

    public static final String ABOUT_MENU_LABEL = "About";
    public static final String DEV_MENU_LABEL = "Developments";
    public static final String TAR_MENU_LABEL = "Tar";
    public static final String SUPER_3_MENU_LABEL = "SUPER_3";
    public static final String HOME_MENU_LABEL = "Home";
    public static final String THEME_MENU_LABEL = "Theme";
    public static final String LANGUAGE_MENU_LABEL = "Language";

    public static final String[] MENU_LABELS = {ABOUT_MENU_LABEL, DEV_MENU_LABEL, SUPER_3_MENU_LABEL, TAR_MENU_LABEL, THEME_MENU_LABEL, LANGUAGE_MENU_LABEL};

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("menu", new String[][]{{HOME_PAGE_TITLE}, MENU_LABELS});
        model.addAttribute("current", "home");
        return "home";
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        model.addAttribute("menu", new String[][]{{ABOUT_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        model.addAttribute("current", "about");
        model.addAttribute("aboutCreated", "25.10.2019");
        model.addAttribute("aboutUpdated", "25.10.2019");
        model.addAttribute("cvUpdated", "21.08.2015");
        return "about";
    }

    @GetMapping("/developments")
    public String getDevelopments(Model model) {
        model.addAttribute("menu", new String[][]{{DEV_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        model.addAttribute("current", "developments");
        model.addAttribute("sporexCreated", "12.12.2008");
        model.addAttribute("sporexUpdated", "21.03.2014");
        model.addAttribute("mbfCreated", "12.12.2008");
        model.addAttribute("mbfUpdated", "21.03.2014");
        return "developments";
    }

    @GetMapping("/tar")
    public String getTar(Model model) {
        model.addAttribute("menu", new String[][]{{TAR_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        model.addAttribute("current", "tar");
        model.addAttribute("towatchedUpdated", "12.12.2008");
        model.addAttribute("toreadUpdated", "21.03.2014");
        model.addAttribute("toplayedUpdated", "12.12.2008");
        model.addAttribute("tolearnedUpdated", "21.03.2014");
        model.addAttribute("xxxtarUpdated", "21.03.2014");
        return "tar";
    }

    @GetMapping("/super_3")
    public String getSuper3(Model model) {
        model.addAttribute("menu", new String[][]{{SUPER_3_PAGE_TITLE}, MENU_LABELS, {HOME_MENU_LABEL}});
        model.addAttribute("current", "super_3");
        return "super_3";
    }
}
