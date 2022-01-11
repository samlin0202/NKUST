import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class sammmmmmmmmmmmmmmmm{
    public static void main(String[] args) throws IOException {
        try {
            int j = 1;
            String URL_1 = "";  //控制串
            String URL_2 = "https://movie.douban.com/chart";
            String URL_3 = "";
            Document index_3 = Jsoup.connect(URL_2).get();
            Element ououo = index_3.select("#douban-top250 div.douban-top250-hd h2 span a").first();
            System.out.println(index_3.title());
            System.out.println();
            URL_3 = ououo.attr("href");
            Document document = Jsoup.connect(URL_3).get();
            Elements index_1 = document.select("div.article ol li div.pic a");

            System.out.println(document.title());
            System.out.println(ououo.attr("href"));
            System.out.println();

            for (Element item : index_1)
            {
                URL_1 = item.attr("href");
                System.out.println("================================================");
                System.out.println(item.attr("href"));
                Document index_2 = Jsoup.connect(URL_1).get();

                System.out.println("<電影名稱:"+index_2.title()+">");
                Elements items = index_2.select("#info span");
                System.out.println();
                System.out.println(items.text());
                Element USER = index_2.select("div.tab-bd div.comment-item ").first();
                System.out.println();
                Element USERs = index_2.select("div.review-list ").first();
                System.out.println("=====>TOP1熱門評語:"+USERs.text()+"<======");
                System.out.println();
                System.out.println("=====>留言評語:"+USER.text()+"<======");
                System.out.println();

            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}
