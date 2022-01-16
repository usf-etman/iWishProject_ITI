/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import View.ServerUI;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Youssef
 */
public class ItemScraper {

    private static WebClient client;

    private static String scrapeName(HtmlPage page) {
        String prodName = "";
        HtmlSpan htmlName = page.getFirstByXPath("//*[@id=\"productTitle\"]");
        if(htmlName != null){prodName = htmlName.getTextContent().trim();}
        client.waitForBackgroundJavaScript(10000);
        return prodName;
    }

    private static String scrapePrice(HtmlPage page) {
        String prodPrice = "";
        HtmlSpan htmlPrice = page.getFirstByXPath("//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span/span[2]/span[2]");
        if(htmlPrice != null){ prodPrice = htmlPrice.getTextContent().replace(".",""); }
        client.waitForBackgroundJavaScript(10000);
        return prodPrice;
    }

    private static String scrapeDesc(HtmlPage page) {
        String prodDesc = "";
        HtmlSpan htmlDesc = page.getFirstByXPath("//*[@id=\"productDescription\"]/p/span");
        if(htmlDesc != null){prodDesc = htmlDesc.getTextContent().trim();}
        client.waitForBackgroundJavaScript(10000);
        return prodDesc;
    }
    
    public static Vector<Item> scrapeItems(String searchUrl){
        client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        Vector<Item> itemsVector = new Vector<Item>();
        try {
            HtmlPage page = client.getPage(searchUrl);
            client.waitForBackgroundJavaScript(10000);

            List<DomAttr> prodLinks = page.getByXPath("//*[@id=\"gridItemRoot\"]/div/div[2]/div/a[2]/@href");
            client.waitForBackgroundJavaScript(10000);

            for (int i = 0; i < prodLinks.size(); i++) {
                page = client.getPage("https://www.amazon.eg" + prodLinks.get(i).getNodeValue());
                client.waitForBackgroundJavaScript(10000);
                itemsVector.add(new Item(scrapeDesc(page), scrapeName(page), scrapePrice(page)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemsVector;
    }
}
