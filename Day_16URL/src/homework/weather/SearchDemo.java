package homework.weather;

import homework.weather.SearchData;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class SearchDemo {
    public static void main(String[] args) throws IOException {
        Scanner  input  = new Scanner(System.in);
        System.out.println("请输入你选择的城市");
        String    city  =input.nextLine();
        URL url   = new URL("\thttps://www.nowapi.com/api\n");
        java.net.URLConnection conn =  url.openConnection();

        InputStream   is  = conn.getInputStream();

        byte[] buff = new byte[1024*1024];
        int len = is.read(buff);
        String result = new String(buff,0,len);
        System.out.println(result);

        JSONObject jsonObject =JSONObject.fromObject(result);
        SearchData data =(SearchData)JSONObject.toBean(jsonObject,SearchData.class);

       // System.out.println("Id为："+data.getId());

    }

}
