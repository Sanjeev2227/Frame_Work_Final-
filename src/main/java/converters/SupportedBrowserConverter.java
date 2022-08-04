package converters;

import enumeration.SupportedBrowsers;

public final class SupportedBrowserConverter {

    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {
//    return switch (webBrowser)
//            {
//        case "local_chrome" -> SupportedBrowsers.LOCAL_CHROME;
//        case "local_firefox" -> SupportedBrowsers.LOCAL_FIREFOX;
//        case "remote_chrome" -> SupportedBrowsers.REMOTE_CHROME;
//        default -> throw new IllegalArgumentException("No appropriate browser found");
        if (webBrowser.equals("local_chrome"))
            return SupportedBrowsers.LOCAL_CHROME;
        else if (webBrowser.equals("local_firefox"))

            return SupportedBrowsers.LOCAL_FIREFOX;
        else if (webBrowser.equals("remote_chrome"))
            return SupportedBrowsers.REMOTE_CHROME;
        else
            throw new IllegalArgumentException("No appropriate browser found");

    }
}

