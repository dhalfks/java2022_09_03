package new02;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx02 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://n.news.naver.com/article/417/0000871006?cds=news_media_pc&type=editn");
		System.out.println("getAuthority :"+ url.getAuthority());
		System.out.println("getContent : " + url.getContent());
		System.out.println("getPort : " + url.getPort());
		System.out.println("getProtocal : " + url.getProtocol());
		System.out.println("------------------");
		System.out.println("getHost : " + url.getHost());
		System.out.println("getQuery : " + url.getQuery());
		System.out.println("getPath : " + url.getPath());
		
	}

}
