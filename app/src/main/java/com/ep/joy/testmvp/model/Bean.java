package com.ep.joy.testmvp.model;

import com.ep.joy.testmvp.http.JsonResponseParser;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;

/**
 * author   Joy
 * Date:  2016/5/3.
 * version:  V1.0
 * Description:
 */

@HttpResponse(parser = JsonResponseParser.class)

public class Bean implements Serializable {

    /**
     * error : false
     * results : [{"_id":"5722c77567765974f5e27e53","createdAt":"2016-04-29T10:31:17.87Z","desc":"Android中Enum分析使用","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"http://www.jianshu.com/p/6052cd4ea9ae","used":true,"who":"AndWang"},{"_id":"5722c61767765974f5e27e51","createdAt":"2016-04-29T10:25:27.959Z","desc":"使用Swift为Android构建代码","publishedAt":"2016-04-29T11:36:42.906Z","source":"web","type":"Android","url":"https://www.sdk.cn/news/3268","used":true,"who":null},{"_id":"5722a88a67765974fbfcf9b8","createdAt":"2016-04-29T08:19:22.33Z","desc":"一个切割时间的表盘","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"https://github.com/DuanTzXavier/conciseclock","used":true,"who":"蒋朋"},{"_id":"572232ab67765974fca830b8","createdAt":"2016-04-28T23:56:27.136Z","desc":"SearchView源码解析","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"https://github.com/nukc/SearchViewAnalysis","used":true,"who":"Jason"},{"_id":"57222ded67765974fbfcf9b7","createdAt":"2016-04-28T23:36:13.245Z","desc":"这是一个专用于解决Android中网络请求及图片加载的缓存处理框架","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"https://github.com/LittleFriendsGroup/KakaCache","used":true,"who":"Jason"},{"_id":"57222d4f67765974fbfcf9b6","createdAt":"2016-04-28T23:33:35.223Z","desc":"FloatingActionButton变种的工具栏","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"https://github.com/rubensousa/FloatingToolbar","used":true,"who":"Jason"},{"_id":"57222abf67765974fbfcf9b5","createdAt":"2016-04-28T23:22:39.267Z","desc":"文本与图片混排","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"https://github.com/Bilibili/drawee-text-view","used":true,"who":"Jason"},{"_id":"5722172c67765974f5e27e4b","createdAt":"2016-04-28T21:59:08.826Z","desc":"Depth 终于开源啦～","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"https://github.com/danielzeller/Depth-LIB-Android-","used":true,"who":"mthli"},{"_id":"5721dab067765974fca830b4","createdAt":"2016-04-28T17:41:04.289Z","desc":"Linux下/proc目录简介","publishedAt":"2016-04-29T11:36:42.906Z","source":"chrome","type":"Android","url":"http://blog.csdn.net/zdwzzu2006/article/details/7747977","used":true,"who":"LHF"},{"_id":"5721916567765974fbfcf9ad","createdAt":"2016-04-28T12:28:21.470Z","desc":"依赖注入及dagger2的学习指南","publishedAt":"2016-04-28T13:07:51.7Z","source":"chrome","type":"Android","url":"https://lber19535.github.io/2016/04/22/%E4%BE%9D%E8%B5%96%E6%B3%A8%E5%85%A5%E5%AD%A6%E4%B9%A0%E6%8C%87%E5%8D%97/","used":true,"who":"bill"},{"_id":"572170d867765974f885bfbd","createdAt":"2016-04-28T10:09:28.212Z","desc":" Android drawable微技巧，你所不知道的drawable的那些细节","publishedAt":"2016-04-28T13:07:51.7Z","source":"chrome","type":"Android","url":"http://blog.csdn.net/guolin_blog/article/details/50727753","used":true,"who":"vincgao"},{"_id":"5721684a67765974f885bfbb","createdAt":"2016-04-28T09:32:58.363Z","desc":"Android drawable微技巧，你所不知道的drawable的那些细节","publishedAt":"2016-04-28T13:07:51.7Z","source":"chrome","type":"Android","url":"http://blog.csdn.net/guolin_blog/article/details/50727753#java","used":true,"who":"蒋朋"},{"_id":"5720d4fe67765974f5e27e38","createdAt":"2016-04-27T23:04:30.136Z","desc":"AndFix从入门到放弃\n","publishedAt":"2016-04-28T13:07:51.7Z","source":"chrome","type":"Android","url":"http://mp.weixin.qq.com/s?__biz=MzIxNDE1NjQ2Mw==&mid=2649872253&idx=1&sn=3990dc075f31ac2d63ee5a96fc483f73#rd","used":true,"who":"程序亦非猿"},{"_id":"5720a44867765974f885bfb2","createdAt":"2016-04-27T19:36:40.787Z","desc":"Awesome Audio Widget for any Android Music App","publishedAt":"2016-04-28T13:07:51.7Z","source":"chrome","type":"Android","url":"https://github.com/Cleveroad/MusicBobber","used":true,"who":"蒋朋"},{"_id":"5720975967765974f5e27e31","createdAt":"2016-04-27T18:41:29.159Z","desc":"Live Audio Equalizer with wave effect","publishedAt":"2016-04-28T13:07:51.7Z","source":"chrome","type":"Android","url":"https://github.com/Cleveroad/WaveInApp","used":true,"who":"Masayuki Suda"},{"_id":"5720592667765974f885bfa8","createdAt":"2016-04-27T14:16:06.865Z","desc":"Multidex解决方法数越界","publishedAt":"2016-04-28T13:07:51.7Z","source":"web","type":"Android","url":"http://xybcoder.github.io/2016/04/27/Multidex%E8%A7%A3%E5%86%B3%E6%96%B9%E6%B3%95%E6%95%B0%E8%B6%8A%E7%95%8C/","used":true,"who":null},{"_id":"5720370967765974fbfcf992","createdAt":"2016-04-27T11:50:33.254Z","desc":"在线 JSON 转 POJO ，超简单实用","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/joelittlejohn/jsonschema2pojo","used":true,"who":"mthli"},{"_id":"571f76e967765974fca8308e","createdAt":"2016-04-26T22:10:49.704Z","desc":"Android平台室内地图控件MapView","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/onlylemi/MapView","used":true,"who":"onlylemi"},{"_id":"571f769a67765974fbfcf985","createdAt":"2016-04-26T22:09:30.446Z","desc":"CursorWheelLayout","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/BCsl/CursorWheelLayout","used":true,"who":"onlylemi"},{"_id":"571f764967765974fca8308d","createdAt":"2016-04-26T22:08:09.994Z","desc":"A list of useful Java frameworks","publishedAt":"2016-04-27T12:04:15.19Z","source":"chrome","type":"Android","url":"https://github.com/Vedenin/useful-java-links","used":true,"who":"onlylemi"},{"_id":"571f728167765974fbfcf982","createdAt":"2016-04-26T21:52:01.759Z","desc":"详细的介绍了git和github的使用和git工作流的分类。","publishedAt":"2016-04-27T12:04:15.19Z","source":"web","type":"Android","url":"http://blog.jobbole.com/76843/","used":true,"who":null},{"_id":"571ed93567765974f5e27e14","createdAt":"2016-04-26T10:57:57.79Z","desc":"Android App的设计架构：MVC,MVP,MVVM与架构经验谈","publishedAt":"2016-04-26T11:58:55.460Z","source":"web","type":"Android","url":"https://www.sdk.cn/news/2501","used":true,"who":null},{"_id":"571e396f67765974fbfcf979","createdAt":"2016-04-25T23:36:15.705Z","desc":"FragmentAnimation","publishedAt":"2016-04-26T11:58:55.460Z","source":"chrome","type":"Android","url":"https://github.com/kakajika/FragmentAnimations","used":true,"who":"Jason"},{"_id":"571e158467765974fbfcf975","createdAt":"2016-04-25T21:03:00.108Z","desc":"RxJoke:RxJava+MVP的开源项目-幼苗项目","publishedAt":"2016-04-26T11:58:55.460Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/9430eca553a5","used":true,"who":null},{"_id":"571dbc6c67765974f5e27e06","createdAt":"2016-04-25T14:42:52.739Z","desc":"A collections of tips in Android developing","publishedAt":"2016-04-26T11:58:55.460Z","source":"chrome","type":"Android","url":"https://github.com/JohnTsaiAndroid/AndroidTips#genymotion","used":true,"who":"蒋朋"},{"_id":"571db47067765974fca8307b","createdAt":"2016-04-25T14:08:48.71Z","desc":"An event bus designed to allowing your application to communicate efficiently.","publishedAt":"2016-04-26T11:58:55.460Z","source":"web","type":"Android","url":"https://github.com/AndroidKnife/RxBus","used":true,"who":"HwangJR"},{"_id":"571d9f3c67765974fca8307a","createdAt":"2016-04-25T12:38:20.182Z","desc":"上下拉缩小放大图片的View","publishedAt":"2016-04-26T11:58:55.460Z","source":"chrome","type":"Android","url":"https://github.com/matrixxun/PullToZoomInListView","used":true,"who":"有时放纵"},{"_id":"571d8a3a67765974f5e27dfc","createdAt":"2016-04-25T11:08:42.127Z","desc":"底部导航栏（Bottom navigation）规范指南","publishedAt":"2016-04-25T11:24:01.704Z","source":"chrome","type":"Android","url":"https://github.com/LittleFriendsGroup/BottomNavigation","used":true,"who":"onlylemi"},{"_id":"571d896a67765974fca83075","createdAt":"2016-04-25T11:05:14.390Z","desc":"Android sdk 源码解析","publishedAt":"2016-04-25T11:24:01.704Z","source":"chrome","type":"Android","url":"https://github.com/LittleFriendsGroup/AndroidSdkSourceAnalysis","used":true,"who":"onlylemi"},{"_id":"571d7dcc67765974f5e27df9","createdAt":"2016-04-25T10:15:40.431Z","desc":"A Custom TextView with trim text","publishedAt":"2016-04-25T11:24:01.704Z","source":"web","type":"Android","url":"https://github.com/borjabravo10/ReadMoreTextView","used":true,"who":"liuzheng"}]
     */

    private boolean error;
    /**
     * _id : 5722c77567765974f5e27e53
     * createdAt : 2016-04-29T10:31:17.87Z
     * desc : Android中Enum分析使用
     * publishedAt : 2016-04-29T11:36:42.906Z
     * source : chrome
     * type : Android
     * url : http://www.jianshu.com/p/6052cd4ea9ae
     * used : true
     * who : AndWang
     */

    private List<ResultsEntity> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public static class ResultsEntity {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        @Override
        public String toString() {
            return "ResultsEntity{" +
                    "_id='" + _id + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    ", desc='" + desc + '\'' +
                    ", publishedAt='" + publishedAt + '\'' +
                    ", source='" + source + '\'' +
                    ", type='" + type + '\'' +
                    ", url='" + url + '\'' +
                    ", used=" + used +
                    ", who='" + who + '\'' +
                    '}';
        }
    }
}
