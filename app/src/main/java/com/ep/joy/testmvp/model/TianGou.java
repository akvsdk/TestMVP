package com.ep.joy.testmvp.model;

import com.ep.joy.testmvp.http.JsonResponseParser;

import org.xutils.http.annotation.HttpResponse;

import java.io.Serializable;
import java.util.List;

/**
 * author   Joy
 * Date:  2016/5/12.
 * version:  V1.0
 * Description:
 */
@HttpResponse(parser = JsonResponseParser.class)

public class TianGou implements Serializable {

    /**
     * status : true
     * total : 712
     * tngou : [{"count":1890,"fcount":0,"galleryclass":4,"id":5,"img":"/ext/150714/2badf623a0acf17ab93294891f67a9f7.jpg","rcount":0,"size":11,"time":1436875200000,"title":"靓丽美女模特兔女郎内衣秀"},{"count":1923,"fcount":0,"galleryclass":5,"id":6,"img":"/ext/150714/426262edf0f5975f41cf4abf8274b21b.jpg","rcount":0,"size":13,"time":1436875387000,"title":"知名嫩模莫露大尺度布条装写真"},{"count":1315,"fcount":0,"galleryclass":3,"id":7,"img":"/ext/150714/f821bc2cb8e0c09a7478be57dae4ed66.jpg","rcount":0,"size":12,"time":1436875874000,"title":"吊带黑丝极致诱惑"},{"count":1728,"fcount":0,"galleryclass":2,"id":8,"img":"/ext/150714/3e0d6e232d557afbfa905b987a7a2047.jpg","rcount":0,"size":10,"time":1436875935000,"title":"韩国美女极品丝袜秀"},{"count":1555,"fcount":0,"galleryclass":1,"id":9,"img":"/ext/150714/b32d42d218ebcdb85d39e93ffff390c3.jpg","rcount":0,"size":10,"time":1436876053000,"title":"办公室女郎的丝袜诱惑"},{"count":3665,"fcount":0,"galleryclass":1,"id":10,"img":"/ext/150714/832903f1079ad2a74867e5cbd9dcf1a2.jpg","rcount":0,"size":12,"time":1436876134000,"title":"美腿丝袜美女"},{"count":1314,"fcount":0,"galleryclass":3,"id":11,"img":"/ext/150714/1c50a2fabff28cd0b69b126eb4e05bf4.jpg","rcount":0,"size":10,"time":1436876343000,"title":"人美腿也更美"},{"count":1261,"fcount":0,"galleryclass":1,"id":12,"img":"/ext/150714/e4f3e179bf9be9845329a5e46a337c5b.jpg","rcount":0,"size":10,"time":1436876387000,"title":"嫩模高清私房性感寫真"},{"count":1463,"fcount":0,"galleryclass":7,"id":13,"img":"/ext/150714/33b7c4bff2c55619fe8270586204ee34.jpg","rcount":0,"size":8,"time":1436876483000,"title":"跑车车模精美壁纸"},{"count":1352,"fcount":0,"galleryclass":6,"id":14,"img":"/ext/150714/0572efb248d8b6ff0ae826b4bb2552ff.jpg","rcount":0,"size":11,"time":1436876619000,"title":"漂亮的长腿医生妹子"},{"count":1402,"fcount":0,"galleryclass":2,"id":15,"img":"/ext/150714/7c3089c662fcd2a85bddd2d9f4c8a0ec.jpg","rcount":0,"size":5,"time":1436878080000,"title":"非常抚媚性感诱惑的美女浴室水池秀白嫩大长腿"},{"count":1360,"fcount":0,"galleryclass":1,"id":16,"img":"/ext/150714/cf37a74a0b2b167e0d5d1bd7f429de8f.jpg","rcount":0,"size":8,"time":1436878222000,"title":"丰满少妇的性感内衣抠逼诱惑"},{"count":1039,"fcount":0,"galleryclass":4,"id":17,"img":"/ext/150714/4d78c21c95cff1dc0911d784539c653c.jpg","rcount":0,"size":9,"time":1436878360000,"title":"女神身材的美貌白嫩修长的肉丝美腿好性感诱人"},{"count":2066,"fcount":0,"galleryclass":1,"id":18,"img":"/ext/150714/e76407c9a23da57a0f30690aa7917f3e.jpg","rcount":0,"size":6,"time":1436878500000,"title":"MiStar苏小曼姿势性感诱人私房照"},{"count":1081,"fcount":0,"galleryclass":4,"id":19,"img":"/ext/150714/9e091ed491d9d5a6ba9ce6c161c77728.jpg","rcount":0,"size":7,"time":1436878683000,"title":"韵味旗袍短裙美貌加网洞黑丝长腿诱惑得你直流鼻血"},{"count":1208,"fcount":0,"galleryclass":3,"id":20,"img":"/ext/150714/28e5c65f7b76c645207ea792523163c1.jpg","rcount":0,"size":7,"time":1436878987000,"title":"开放少女内丝味十足脱光光"},{"count":1044,"fcount":0,"galleryclass":3,"id":21,"img":"/ext/150714/4aedf85a777bf030f84fb125299e4913.jpg","rcount":0,"size":6,"time":1436879265000,"title":"喷血诱惑的白嫩修长美腿这迷人的线条还有那翘臀真挺"},{"count":1572,"fcount":0,"galleryclass":5,"id":22,"img":"/ext/150714/d3172dcd9fef08ad2d6b249a63fccbc0.jpg","rcount":0,"size":14,"time":1436879367000,"title":"成熟美女内衣性感撩人写真"},{"count":997,"fcount":0,"galleryclass":3,"id":23,"img":"/ext/150715/8b526a6d5ff96aae0ec85d34fde7f0c7.jpg","rcount":0,"size":7,"time":1436974412000,"title":"气质黑丝美女极度诱惑,眼球的享受!"},{"count":1193,"fcount":0,"galleryclass":4,"id":24,"img":"/ext/150716/edeedc4c00ce2d02f9a78dec6c16170b.jpg","rcount":0,"size":10,"time":1437048332000,"title":"紅網襪的性感女教師"}]
     */

    private boolean status;
    private int total;
    /**
     * count : 1890
     * fcount : 0
     * galleryclass : 4
     * id : 5
     * img : /ext/150714/2badf623a0acf17ab93294891f67a9f7.jpg
     * rcount : 0
     * size : 11
     * time : 1436875200000
     * title : 靓丽美女模特兔女郎内衣秀
     */

    private List<TngouEntity> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TngouEntity> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouEntity> tngou) {
        this.tngou = tngou;
    }

    public static class TngouEntity {
        private int count;
        private int fcount;
        private int galleryclass;
        private int id;
        private String img;
        private int rcount;
        private int size;
        private long time;
        private String title;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getFcount() {
            return fcount;
        }

        public void setFcount(int fcount) {
            this.fcount = fcount;
        }

        public int getGalleryclass() {
            return galleryclass;
        }

        public void setGalleryclass(int galleryclass) {
            this.galleryclass = galleryclass;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getRcount() {
            return rcount;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    @Override
    public String toString() {
        return "TianGou{" +
                "status=" + status +
                ", total=" + total +
                ", tngou=" + tngou +
                '}';
    }
}
