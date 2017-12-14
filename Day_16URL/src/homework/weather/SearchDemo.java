package homework.weather;

import homework.weather.SearchData;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class SearchDemo {

    public static void main(String[] args) throws IOException {
//        searchcity();
//        searchPhone();
    }

   public static void searchcity() throws IOException {
        Scanner input  = new Scanner(System.in);
        System.out.println("请输入你选择的城市");
        String city = input.nextLine();
        URL url = new URL("http://www.sojson.com/open/api/weather/json.shtml?city=" + city);
        URLConnection conn = url.openConnection();

        InputStream is = conn.getInputStream();

        byte[] buff = new byte[1024];
        int len ;

        StringBuffer sb = new StringBuffer();

        while((len= is.read(buff)) !=-1) {
            String result = new String(buff, 0, len);

            sb.append(result);
        }
        System.out.println(sb);
        JSONObject jsonObject = JSONObject.fromObject(new String(sb));
        SearchData data = (SearchData) JSONObject.toBean(jsonObject, SearchData.class);

        System.out.println("Id为："+data.getData().getYesterday().getType());
    }

    public static void searchPhone() throws IOException {
        Scanner input =new Scanner(System.in);
        System.out.println("输入你想查询的电话号码");
        String phoneNumber= input.nextLine();

        String a = "http://api.k780.com/?app=phone.get&phone=" +
                phoneNumber + "&appkey=29836&sign=4fe58a60443a900a251f8b05763d4622&format=json";

        URL url = new URL(a);
        URLConnection coon = url.openConnection();
        InputStream is =coon.getInputStream();
        byte[] buff = new byte[1024];
        int len;
        StringBuffer sb = new StringBuffer();
        while ((len=is.read(buff)) != -1) {
            String result = new String(buff, 0, len);
            sb.append(result);
        }
        System.out.println(sb);
        JSONObject jsonObject = JSONObject.fromObject(new String(sb));
        searchPhone data =(searchPhone) JSONObject.toBean(jsonObject,searchPhone.class);

        System.out.println(data.getResult().getStyle_citynm());
    }

    }


