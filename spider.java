import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class spider {
    public static void main(String[] args) throws IOException {
        try {
            int j = 1;
            for (int i = 0; i < 10; i++) {
                int page = i * 25;

                Document document = Jsoup.connect("https://movie.douban.com/top250"+ page).get();
                Elements items = document.getElementsByClass("item");
                for (Element item : items) {
                    Elements story = document.select("#content > div > div.article > ol > li:nth-child(" + 1 + ") > div > div.info > div.hd > a");
                    Element str = story.get(0);
                    System.out.println(str.absUrl("href"));
                    String num = item.getElementsByTag("em").get(0).text();
                    String title = item.getElementsByClass("hd").get(0).getElementsByTag("span").get(0).text();
                    String bd = item.getElementsByClass("bd").get(0).getElementsByTag("p").get(0).html();
                    String actor = bd.split("<br>")[0].replaceAll("&nbsp;", " ");
                    String info = bd.split("<br>")[1].replaceAll("&nbsp;", " ");
                    String[] infos = info.split("/");
                    String year = infos[0].trim();
                    String quote = "";
                    if (item.getElementsByClass("quote").size() > 0) {
                        quote = item.getElementsByClass("quote").get(0).text();
                    }

                    Elements pic = document.select("#content > div > div.article > ol > li:nth-child("+j+") > div > div.pic > a > img");
                    Element pic2 = pic.get(0);
                    Document doc2 = Jsoup.connect(str.absUrl("href")).get();
                    j++;

                    System.out.println(pic2.absUrl("src"));

                    System.out.println("電影名次: " + num);
                    System.out.println("電影標題: " + title);
                    System.out.println("電影演員: " + actor);
                    System.out.println("電影年份: " + year);
                    System.out.println("電影簡評: " + quote);
                    System.out.println("============================================");

                }

            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}