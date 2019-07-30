package yin.deng.chengguang;

import java.io.Serializable;
import java.util.List;

public class ChangGuangInfo implements Serializable {

    /**
     * status : 1
     * msg : 获取成功
     * data : {"gindex":1454842,"name":"影视制作人2","title":"http://pic.cgyouxi.com/orange/title/37fd242cfa4fa190a1bdb094d71ca71c_24.jpg","update_time":1564412208,"guid":"37fd242cfa4fa190a1bdb094d71ca71c","version":24,"width":960,"height":540,"author_uid":36711576,"author_name":"飞奔的小黑猪","size":53965513,"description":"影视大学毕业的你，遭女友嫌弃没有上进心，面临突如其来的分手危机，你为了挽回女友证明自己的能力，与女友母亲打了个赌，在一年之内创立影视公司并将公司排名提升到世界榜前十名，你真的可以做到吗？\n\n-------------------------华丽的分割线----------------------\n\n更新：每周更新至少5000+\n字数：预计10w字\n福利：874982386（影视2专属群）\n新作：新作期间大礼包半价（15花）完结后恢复（30花）\n评论：评论游戏攻略相关内容有机会加精，可获得积分奖励。","score":100,"score_num":130,"entergame":1784,"word_num":14196,"complete_flag":0,"share_times":141,"fv_times":138,"buy_time":0,"flower_unlock":15,"flower_unlock_num":15,"flower":1413,"wild_flower_sum":0,"check_level":2,"invest":0,"thumb_list":["http://pic.cgyouxi.com/orange/title/37fd242cfa4fa190a1bdb094d71ca71c_24.jpg"],"ending_info":"","records":" \u2022 2019-07-29 修复世界赛无法降低对方支持率的bug\r\n \u2022 2019-07-29 增加艺人薪资发放，调整拍摄电影票房的随机性，调整工作赚钱的多少取决于艺人属性值。\r\n \u2022 2019-07-29 增加任务查看，增加月任务，周结算，增加艺人升阶功能，艺人送礼增加属性，修复世界赛比拼后增加公司经验公司不升级问题。\r\n \u2022 2019-07-27 修改世界赛选人bug，修改拍摄电影钱少的问题，增加工作收入，增加艺人比拼技能，增加艺人能力查看、艺人数量查看。\r\n \u2022 2019-07-25 增加一个初始福利礼包，礼包后面会随着功能变化而变化。\r\n \u2022 2019-07-25 世界赛系统开启，提高了工作和拍电影的收入（和艺人能力有关）。\r\n \u2022 2019-07-24 增加影视拍摄玩法。\r\n \u2022 2019-07-22 更新工作一小部分，增加商城。\r\n","book_info":{},"star_book_info":{},"rebate":{},"autopromo_level":1,"is_favorite":false,"author_type":1,"author_score":60,"author_warning":""}
     */

    private int status;
    private String msg;
    private DataBean data;

    @Override
    public String toString() {
        return "ChangGuangInfo{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "gindex=" + gindex +
                    ", name='" + name + '\'' +
                    ", title='" + title + '\'' +
                    ", update_time=" + update_time +
                    ", guid='" + guid + '\'' +
                    ", version=" + version +
                    ", width=" + width +
                    ", height=" + height +
                    ", author_uid=" + author_uid +
                    ", author_name='" + author_name + '\'' +
                    ", size=" + size +
                    ", description='" + description + '\'' +
                    ", score=" + score +
                    ", score_num=" + score_num +
                    ", entergame=" + entergame +
                    ", word_num=" + word_num +
                    ", complete_flag=" + complete_flag +
                    ", share_times=" + share_times +
                    ", fv_times=" + fv_times +
                    ", buy_time=" + buy_time +
                    ", flower_unlock=" + flower_unlock +
                    ", flower_unlock_num=" + flower_unlock_num +
                    ", flower=" + flower +
                    ", wild_flower_sum=" + wild_flower_sum +
                    ", check_level=" + check_level +
                    ", invest=" + invest +
                    ", ending_info='" + ending_info + '\'' +
                    ", records='" + records + '\'' +
                    ", book_info=" + book_info +
                    ", star_book_info=" + star_book_info +
                    ", rebate=" + rebate +
                    ", autopromo_level=" + autopromo_level +
                    ", is_favorite=" + is_favorite +
                    ", author_type=" + author_type +
                    ", author_score=" + author_score +
                    ", author_warning='" + author_warning + '\'' +
                    ", thumb_list=" + thumb_list +
                    '}';
        }

        /**
         * gindex : 1454842
         * name : 影视制作人2
         * title : http://pic.cgyouxi.com/orange/title/37fd242cfa4fa190a1bdb094d71ca71c_24.jpg
         * update_time : 1564412208
         * guid : 37fd242cfa4fa190a1bdb094d71ca71c
         * version : 24
         * width : 960
         * height : 540
         * author_uid : 36711576
         * author_name : 飞奔的小黑猪
         * size : 53965513
         * description : 影视大学毕业的你，遭女友嫌弃没有上进心，面临突如其来的分手危机，你为了挽回女友证明自己的能力，与女友母亲打了个赌，在一年之内创立影视公司并将公司排名提升到世界榜前十名，你真的可以做到吗？

         -------------------------华丽的分割线----------------------

         更新：每周更新至少5000+
         字数：预计10w字
         福利：874982386（影视2专属群）
         新作：新作期间大礼包半价（15花）完结后恢复（30花）
         评论：评论游戏攻略相关内容有机会加精，可获得积分奖励。
         * score : 100
         * score_num : 130
         * entergame : 1784
         * word_num : 14196
         * complete_flag : 0
         * share_times : 141
         * fv_times : 138
         * buy_time : 0
         * flower_unlock : 15
         * flower_unlock_num : 15
         * flower : 1413
         * wild_flower_sum : 0
         * check_level : 2
         * invest : 0
         * thumb_list : ["http://pic.cgyouxi.com/orange/title/37fd242cfa4fa190a1bdb094d71ca71c_24.jpg"]
         * ending_info :
         * records :  • 2019-07-29 修复世界赛无法降低对方支持率的bug
         • 2019-07-29 增加艺人薪资发放，调整拍摄电影票房的随机性，调整工作赚钱的多少取决于艺人属性值。
         • 2019-07-29 增加任务查看，增加月任务，周结算，增加艺人升阶功能，艺人送礼增加属性，修复世界赛比拼后增加公司经验公司不升级问题。
         • 2019-07-27 修改世界赛选人bug，修改拍摄电影钱少的问题，增加工作收入，增加艺人比拼技能，增加艺人能力查看、艺人数量查看。
         • 2019-07-25 增加一个初始福利礼包，礼包后面会随着功能变化而变化。
         • 2019-07-25 世界赛系统开启，提高了工作和拍电影的收入（和艺人能力有关）。
         • 2019-07-24 增加影视拍摄玩法。
         • 2019-07-22 更新工作一小部分，增加商城。
         * book_info : {}
         * star_book_info : {}
         * rebate : {}
         * autopromo_level : 1
         * is_favorite : false
         * author_type : 1
         * author_score : 60
         * author_warning :
         */

        private int gindex;
        private String name;
        private String title;
        private int update_time;
        private String guid;
        private int version;
        private int width;
        private int height;
        private int author_uid;
        private String author_name;
        private int size;
        private String description;
        private int score;
        private int score_num;
        private int entergame;
        private int word_num;
        private int complete_flag;
        private int share_times;
        private int fv_times;
        private int buy_time;
        private int flower_unlock;
        private int flower_unlock_num;
        private int flower;
        private int wild_flower_sum;
        private int check_level;
        private int invest;
        private String ending_info;
        private String records;
        private BookInfoBean book_info;
        private StarBookInfoBean star_book_info;
        private RebateBean rebate;
        private int autopromo_level;
        private boolean is_favorite;
        private int author_type;
        private int author_score;
        private String author_warning;
        private List<String> thumb_list;

        public int getGindex() {
            return gindex;
        }

        public void setGindex(int gindex) {
            this.gindex = gindex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(int update_time) {
            this.update_time = update_time;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public int getVersion() {
            return version;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getAuthor_uid() {
            return author_uid;
        }

        public void setAuthor_uid(int author_uid) {
            this.author_uid = author_uid;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getScore_num() {
            return score_num;
        }

        public void setScore_num(int score_num) {
            this.score_num = score_num;
        }

        public int getEntergame() {
            return entergame;
        }

        public void setEntergame(int entergame) {
            this.entergame = entergame;
        }

        public int getWord_num() {
            return word_num;
        }

        public void setWord_num(int word_num) {
            this.word_num = word_num;
        }

        public int getComplete_flag() {
            return complete_flag;
        }

        public void setComplete_flag(int complete_flag) {
            this.complete_flag = complete_flag;
        }

        public int getShare_times() {
            return share_times;
        }

        public void setShare_times(int share_times) {
            this.share_times = share_times;
        }

        public int getFv_times() {
            return fv_times;
        }

        public void setFv_times(int fv_times) {
            this.fv_times = fv_times;
        }

        public int getBuy_time() {
            return buy_time;
        }

        public void setBuy_time(int buy_time) {
            this.buy_time = buy_time;
        }

        public int getFlower_unlock() {
            return flower_unlock;
        }

        public void setFlower_unlock(int flower_unlock) {
            this.flower_unlock = flower_unlock;
        }

        public int getFlower_unlock_num() {
            return flower_unlock_num;
        }

        public void setFlower_unlock_num(int flower_unlock_num) {
            this.flower_unlock_num = flower_unlock_num;
        }

        public int getFlower() {
            return flower;
        }

        public void setFlower(int flower) {
            this.flower = flower;
        }

        public int getWild_flower_sum() {
            return wild_flower_sum;
        }

        public void setWild_flower_sum(int wild_flower_sum) {
            this.wild_flower_sum = wild_flower_sum;
        }

        public int getCheck_level() {
            return check_level;
        }

        public void setCheck_level(int check_level) {
            this.check_level = check_level;
        }

        public int getInvest() {
            return invest;
        }

        public void setInvest(int invest) {
            this.invest = invest;
        }

        public String getEnding_info() {
            return ending_info;
        }

        public void setEnding_info(String ending_info) {
            this.ending_info = ending_info;
        }

        public String getRecords() {
            return records;
        }

        public void setRecords(String records) {
            this.records = records;
        }

        public BookInfoBean getBook_info() {
            return book_info;
        }

        public void setBook_info(BookInfoBean book_info) {
            this.book_info = book_info;
        }

        public StarBookInfoBean getStar_book_info() {
            return star_book_info;
        }

        public void setStar_book_info(StarBookInfoBean star_book_info) {
            this.star_book_info = star_book_info;
        }

        public RebateBean getRebate() {
            return rebate;
        }

        public void setRebate(RebateBean rebate) {
            this.rebate = rebate;
        }

        public int getAutopromo_level() {
            return autopromo_level;
        }

        public void setAutopromo_level(int autopromo_level) {
            this.autopromo_level = autopromo_level;
        }

        public boolean isIs_favorite() {
            return is_favorite;
        }

        public void setIs_favorite(boolean is_favorite) {
            this.is_favorite = is_favorite;
        }

        public int getAuthor_type() {
            return author_type;
        }

        public void setAuthor_type(int author_type) {
            this.author_type = author_type;
        }

        public int getAuthor_score() {
            return author_score;
        }

        public void setAuthor_score(int author_score) {
            this.author_score = author_score;
        }

        public String getAuthor_warning() {
            return author_warning;
        }

        public void setAuthor_warning(String author_warning) {
            this.author_warning = author_warning;
        }

        public List<String> getThumb_list() {
            return thumb_list;
        }

        public void setThumb_list(List<String> thumb_list) {
            this.thumb_list = thumb_list;
        }

        public static class BookInfoBean {
        }

        public static class StarBookInfoBean {
        }

        public static class RebateBean {
        }
    }
}
