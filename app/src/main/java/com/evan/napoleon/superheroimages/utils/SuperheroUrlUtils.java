package com.evan.napoleon.superheroimages.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by michaelnapoleon on 6/8/15.
 */
public class SuperheroUrlUtils {

    static Map<String, String> dcUrls = new HashMap<String, String>();

    static {
        dcUrls.put("A", "http://vignette2.wikia.nocookie.net/aquaman/images/4/48/Aquaman_Orin.jpg/revision/latest?cb=20110817210323");
        dcUrls.put("B", "http://static.comicvine.com/uploads/original/11111/111112793/3031477-nealadamsbatman.jpg");
        dcUrls.put("C", "http://img3.wikia.nocookie.net/__cb20120310202141/powerlisting/images/b/bc/Cyborg_DC.jpg");
        dcUrls.put("D", "http://img03.deviantart.net/c28f/i/2012/064/2/d/deadman_prestige_series_commission_by_thuddleston-d4rv5it.jpg");
        dcUrls.put("E", "http://static.comicvine.com/uploads/original/12/128686/2705526-y1.1.jpg");
        dcUrls.put("F", "http://static.comicvine.com/uploads/original/11/118004/2241712-the_flash_artwork_18.jpg");
        dcUrls.put("G", "http://www.moviecricket.com/wp-content/uploads/2014/04/Warner-Bros-Green-Lantern-Movie-Justice-League-Batman-Vs-Superman.jpg");
        dcUrls.put("H", "");
        dcUrls.put("I", "");
        dcUrls.put("J", "");
        dcUrls.put("K", "");
        dcUrls.put("L", "");
        dcUrls.put("M", "");
        dcUrls.put("N", "");
        dcUrls.put("O", "");
        dcUrls.put("P", "");
        dcUrls.put("Q", "");
        dcUrls.put("R", "");
        dcUrls.put("S", "http://cdn.bigissue.com/sites/bigissue/files/superman_flight.jpg");
        dcUrls.put("T", "");
        dcUrls.put("U", "");
        dcUrls.put("V", "");
        dcUrls.put("W", "");
        dcUrls.put("X", "");
        dcUrls.put("Y", "");
        dcUrls.put("Z", "");
    }

    public static String getUrlForLetter(String letter) {
        return dcUrls.get(letter);
    }

}
