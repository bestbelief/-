package homework.weather;

import java.util.List;

public class SearchData {

    /**
     * date : 20171214
     * message : Success !
     * status : 200
     * city : 武汉
     * count : 98
     * data : {"shidu":"92%","pm25":55,"pm10":0,"quality":"良","wendu":"3","ganmao":"极少数敏感人群应减少户外活动","yesterday":{"date":"13日星期三","sunrise":"07:10","high":"高温 8.0℃","low":"低温 4.0℃","sunset":"17:22","aqi":105,"fx":"无持续风向","fl":"<3级","type":"小雨","notice":"雾蒙蒙的雨天，最喜欢一个人听音乐"},"forecast":[{"date":"14日星期四","sunrise":"07:11","high":"高温 6.0℃","low":"低温 3.0℃","sunset":"17:23","aqi":92,"fx":"无持续风向","fl":"3-4级","type":"阴","notice":"阴天没有晴天的明朗，却依然明亮"},{"date":"15日星期五","sunrise":"07:12","high":"高温 7.0℃","low":"低温 2.0℃","sunset":"17:23","aqi":120,"fx":"无持续风向","fl":"3-4级","type":"小雨","notice":"外出时请注意关好门窗，防止雨水飘入"},{"date":"16日星期六","sunrise":"07:12","high":"高温 9.0℃","low":"低温 0.0℃","sunset":"17:23","aqi":101,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"17日星期日","sunrise":"07:13","high":"高温 8.0℃","low":"低温 -2.0℃","sunset":"17:24","aqi":78,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"晴空万里，去沐浴阳光吧"},{"date":"18日星期一","sunrise":"07:14","high":"高温 11.0℃","low":"低温 -1.0℃","sunset":"17:24","aqi":97,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"}]}
     */

    private String date;
    private String message;
    private int status;
    private String city;
    private int count;
    private DataBean data;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * shidu : 92%
         * pm25 : 55.0
         * pm10 : 0.0
         * quality : 良
         * wendu : 3
         * ganmao : 极少数敏感人群应减少户外活动
         * yesterday : {"date":"13日星期三","sunrise":"07:10","high":"高温 8.0℃","low":"低温 4.0℃","sunset":"17:22","aqi":105,"fx":"无持续风向","fl":"<3级","type":"小雨","notice":"雾蒙蒙的雨天，最喜欢一个人听音乐"}
         * forecast : [{"date":"14日星期四","sunrise":"07:11","high":"高温 6.0℃","low":"低温 3.0℃","sunset":"17:23","aqi":92,"fx":"无持续风向","fl":"3-4级","type":"阴","notice":"阴天没有晴天的明朗，却依然明亮"},{"date":"15日星期五","sunrise":"07:12","high":"高温 7.0℃","low":"低温 2.0℃","sunset":"17:23","aqi":120,"fx":"无持续风向","fl":"3-4级","type":"小雨","notice":"外出时请注意关好门窗，防止雨水飘入"},{"date":"16日星期六","sunrise":"07:12","high":"高温 9.0℃","low":"低温 0.0℃","sunset":"17:23","aqi":101,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"17日星期日","sunrise":"07:13","high":"高温 8.0℃","low":"低温 -2.0℃","sunset":"17:24","aqi":78,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"晴空万里，去沐浴阳光吧"},{"date":"18日星期一","sunrise":"07:14","high":"高温 11.0℃","low":"低温 -1.0℃","sunset":"17:24","aqi":97,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"}]
         */

        private String shidu;
        private double pm25;
        private double pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public double getPm25() {
            return pm25;
        }

        public void setPm25(double pm25) {
            this.pm25 = pm25;
        }

        public double getPm10() {
            return pm10;
        }

        public void setPm10(double pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 13日星期三
             * sunrise : 07:10
             * high : 高温 8.0℃
             * low : 低温 4.0℃
             * sunset : 17:22
             * aqi : 105.0
             * fx : 无持续风向
             * fl : <3级
             * type : 小雨
             * notice : 雾蒙蒙的雨天，最喜欢一个人听音乐
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }

        public static class ForecastBean {
            /**
             * date : 14日星期四
             * sunrise : 07:11
             * high : 高温 6.0℃
             * low : 低温 3.0℃
             * sunset : 17:23
             * aqi : 92.0
             * fx : 无持续风向
             * fl : 3-4级
             * type : 阴
             * notice : 阴天没有晴天的明朗，却依然明亮
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private double aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public double getAqi() {
                return aqi;
            }

            public void setAqi(double aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }
}
