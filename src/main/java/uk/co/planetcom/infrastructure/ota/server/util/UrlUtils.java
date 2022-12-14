package uk.co.planetcom.infrastructure.ota.server.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UrlUtils {
    private UrlUtils() {}

    public static String getUrlFileName(String url) throws MalformedURLException {
        try {
            return Paths.get(new URL(url).getPath()).getFileName().toString();
        } catch (MalformedURLException e) {
            throw new MalformedURLException("Error getting filename from path.");
        }
    }
}
