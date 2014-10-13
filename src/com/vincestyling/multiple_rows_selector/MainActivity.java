package com.vincestyling.multiple_rows_selector;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        FinderListView lsvFinder = (FinderListView) findViewById(R.id.lsvFinder);

        List<Book> bookList = new LinkedList<Book>();
        bookList.add(new Book("乱盛夏倾光年", 3445264, "一直都相信着：在这个世界上，有很多和我一样的女孩。她们看《热血高校》、看《艋舺》、看《古惑仔》、看《", "2014-06-12 08:34:25"));
        bookList.add(new Book("至尊特工：狂凤逆九天", 1477680, "我要翻手为云覆手为雨我要那些废物匍匐在我的脚下我要站在顶端漠望天下聚散离合转逆九天间引我为王为父母为", "2014-09-12 07:31:01"));
        bookList.add(new Book("美人殇之彼岸花开", 82990, "当仇恨蒙蔽你的双眼，不知你何时才能想起儿时的我，就算你不记得，那又如何，由我来守护你的快乐。江山再美", "2014-03-19 06:45:17"));
        bookList.add(new Book("杂乱的羁绊", 190778, "迪达拉和蝎意外的穿越，意外的穿越却给迪达拉和蝎带来意外的成长。CP：迪达拉和蝎。世界：猎人，网王，恶", "2014-10-13 06:31:38"));
        bookList.add(new Book("灵幻", 6869980, "墨羽，一个名不见经传的高中生，生活在一颗蔚蓝色的星球中！没钱、没车、没房、没背景，总结起来就是个“四", "2014-10-11 06:20:12"));
        bookList.add(new Book("狐如不爱", 440825, "五百年是什么？是她追着他的脚步，是他等着她的季节。是她，宁可灵魂寂灭也不变的信仰，是他，化骨成尘也不", "2014-09-29 06:00:16"));
        bookList.add(new Book("缘起烟尘", 943193, "虚无裂缝出现的巨蛋，经历世界的破灭。流落凡尘，化身为人。其在凡人手中长大，千魔万险，一步一步走向巅峰", "2014-05-26 05:32:53"));
        bookList.add(new Book("驻足", 26576, "是不是每一个人，都可以为你驻足？是不是每一个人，都可以明知道你是在欺骗他，却甘之若饴？是不是每一个人", "2014-04-24 05:32:39"));
        bookList.add(new Book("栀子梦", 6098005, "文案：一直认为人生是一条平平的直线，却莫名其妙穿越到了对那段历史基本白痴的五代——于是命运开始改变：", "2014-02-18 04:29:57"));
        bookList.add(new Book("旖梦泪", 6908550, "旖梦泪，旖梦泪……她多么希望这是一场梦，然而真实的发生却不容许她去质疑。转世的轮回里，她因自杀、还情", "2014-10-13 02:41:27"));
        bookList.add(new Book("剩女重生女警花：缉拿花花大少", 7993431, "她是交警，查酒驾是她职责，让你用嘴含住使劲吹，你就吹，哪来那么多废话？可他偏偏不配合，不就是查酒精浓", "2014-08-11 01:20:33"));
        bookList.add(new Book("惊醒一袭清梦", 41022, "本是豪门千金，梦中穿越，一个个看似完美的男人从她的眼前出现。本以为自己坐拥美男却不料上天赋予自己的使", "2014-09-21 01:11:30"));
        bookList.add(new Book("穿越之风沁", 8402359, "她的前生被未婚夫和亲人背叛，这次她重生而来，不想再活得如此窝囊，不想再受人欺骗。今生，她遇到了视自己", "2014-02-23 00:58:37"));
        bookList.add(new Book("风华绝代红颜决", 2514514, "一朝穿越当小姐，回首再顾成皇后。只因微微回眸，却再难割舍。也许这就是现实，不论身在何方，仍是挣扎的生", "2014-05-13 00:08:17"));
        bookList.add(new Book("顾事了", 430000, "顾云嘉：我曾经好像喜欢过你。穆良朝：天气不错，我那个时候那么纯情。江洲：那时候那么小，我都不记得谁跟", "2014-02-28 20:13:55"));
        bookList.add(new Book("美男就是奴才", 2858968, "她楠枫静是个孤儿，从小就被父母遗弃。后来被几个混混捡去养大。在她十八岁的那天发生了天大的变化，她居然", "2014-09-09 20:03:49"));
        bookList.add(new Book("两年后的爱情", 189670, "拒绝表白三步曲（单身适用）第一：打断他的表白‘同学，我认识你吗？不，应该说，你认识我吗？’第二：反问", "2014-07-10 19:40:54"));
        bookList.add(new Book("丞相公子，哪里跑", 1273508, "土灵珠什么美男没见过，偏偏看上他国丞相公子。看上了也就算了，他还不领情。说什么女子麻烦，他的兄弟一个", "2014-09-29 18:24:31"));
        bookList.add(new Book("尚古谪仙传：谪仙囧囧谈", 4542726, "虫眼看天下：一只飞天小仙萤火虫——“囧囧”笔下的三界------------------------", "2014-10-02 17:51:49"));


        lsvFinder.setAdapter(new ArrayAdapter<Book>(this, 0, bookList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                Holder holder;
                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(R.layout.finder_book_list_item, null);

                    holder = new Holder();
                    holder.lotDivider = convertView.findViewById(R.id.lotDivider);

                    holder.txvBookName = (TextView) convertView.findViewById(R.id.txvBookName);
                    holder.txvBookSummary = (TextView) convertView.findViewById(R.id.txvBookSummary);

                    holder.txvBookTips = (TextView) convertView.findViewById(R.id.txvBookTips);
                    holder.txvBookCapacity = (TextView) convertView.findViewById(R.id.txvBookCapacity);

                    convertView.setTag(holder);
                } else {
                    holder = (Holder) convertView.getTag();
                }

                Book book = getItem(position);

                holder.txvBookName.setText(book.name);
                holder.txvBookTips.setText(getDiffWithNow(book.lastUpdateTime));

                holder.txvBookSummary.setText(book.summary);
                holder.txvBookCapacity.setText(formatWordsCount(book.capacity));

                holder.lotDivider.setVisibility(getCount() - position == 1 ? View.GONE : View.VISIBLE);

                return convertView;
            }
        });
    }

    private class Book {
        String name;
        int capacity;
        String summary;
        String lastUpdateTime;

        private Book(String name, int capacity, String summary, String lastUpdateTime) {
            this.name = name;
            this.capacity = capacity;
            this.summary = summary;
            this.lastUpdateTime = lastUpdateTime;
        }
    }

    private SimpleDateFormat dfDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private CharSequence getDiffWithNow(String datetime) {
        try {
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(dfDateTime.parse(datetime));

            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(new Date());

            cal1.add(Calendar.HOUR, 1);
            if (cal1.after(cal2)) {
                cal1.add(Calendar.HOUR, -1);
                long diffInSecond = (cal2.getTimeInMillis() - cal1.getTimeInMillis()) / 1000;
                long diffInMinute = diffInSecond / 60;
                return diffInMinute == 0 ? diffInSecond + "秒前" : diffInMinute + "分钟前";
            }

            cal1.add(Calendar.HOUR, 23);
            if (cal1.after(cal2)) {
                cal1.add(Calendar.HOUR, -24);
                return ((cal2.getTimeInMillis() - cal1.getTimeInMillis()) / 3600000) + "小时前";
            }

            cal1.add(Calendar.DAY_OF_YEAR, 30);
            if (cal1.after(cal2)) {
                cal1.add(Calendar.DAY_OF_YEAR, -31);
                return ((cal2.getTimeInMillis() - cal1.getTimeInMillis()) / 86400000) + "天前";
            }

            return datetime.subSequence(5, 10);
        } catch (Exception ex) {}
        return "";
    }

    private DecimalFormat ONE_DECIMAL_POINT_DF = new DecimalFormat("0.0");
    private String formatWordsCount(long capacity) {
        String countStr;
        if (capacity < 1000) {
            countStr = String.valueOf(capacity);
        } else if (capacity < 10000) {
            countStr = (capacity / 1000) + "千";
        } else {
            countStr = ONE_DECIMAL_POINT_DF.format((double) capacity / 10000) + '万';
        }
        return countStr + '字';
    }

    private class Holder {
        TextView txvBookName;
        TextView txvBookSummary;
        TextView txvBookCapacity;
        TextView txvBookTips;
        View lotDivider;
    }
}
