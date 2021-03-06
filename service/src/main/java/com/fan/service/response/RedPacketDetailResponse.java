package com.fan.service.response;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * 类描述：
 * 作者： YinJin
 * 创建时间：2017/9/10.0:11
 */

public class RedPacketDetailResponse implements Parcelable {


    /**
     * err : 0
     * msg : 正常
     * data : {"rid":86,"merchant":"刘博闻","address":"南充市顺庆区西南石油大学","tel":"13551344263","money":1,"pCount":10,"remainCount":7,"userPic":"http://hb.huidang2105.com:8900/public/uploads/user_pic/11/20170908190200NklRU.jpeg","merchant_des":"我叫刘博闻","question":"我是谁","answer":"1","answer0":"王勇","answer1":"刘博闻","answer2":"王滨","status":1,"status_user":true,"isgot":2,"iscollect":false,"getter":[{"userPic":"http://hb.huidang2105.com:8900/public/uploads/user_pic/6/20170907202159YEPl9.jpeg","userName":"在一家店在哪里","address":"四川省成都市","money":"0.07","getTime":"17/09/09 08:33:21"},{"userPic":"http://hb.huidang2105.com:8900/public/uploads/user_pic/3/20170825180250yn3nl.jpeg","userName":"刘博闻","address":"四川省成都市","money":"0.04","getTime":"17/09/08 19:12:49"},{"userPic":"http://hb.huidang2105.com:8900/public/uploads/default/mer.png","userName":"刘博闻","address":"四川省成都市","money":"0.19","getTime":"17/09/08 19:07:16"}],"gotter_count":3}
     */

    private int err;
    private String msg;
    private DataBean data;

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
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

    public static class DataBean implements Parcelable {
        /**
         * rid : 86
         * merchant : 刘博闻
         * address : 南充市顺庆区西南石油大学
         * tel : 13551344263
         * money : 1
         * pCount : 10
         * remainCount : 7
         * userPic : http://hb.huidang2105.com:8900/public/uploads/user_pic/11/20170908190200NklRU.jpeg
         * merchant_des : 我叫刘博闻
         * question : 我是谁
         * answer : 1
         * answer0 : 王勇
         * answer1 : 刘博闻
         * answer2 : 王滨
         * status : 1
         * status_user : true
         * isgot : 2
         * iscollect : false
         * getter : [{"userPic":"http://hb.huidang2105.com:8900/public/uploads/user_pic/6/20170907202159YEPl9.jpeg","userName":"在一家店在哪里","address":"四川省成都市","money":"0.07","getTime":"17/09/09 08:33:21"},{"userPic":"http://hb.huidang2105.com:8900/public/uploads/user_pic/3/20170825180250yn3nl.jpeg","userName":"刘博闻","address":"四川省成都市","money":"0.04","getTime":"17/09/08 19:12:49"},{"userPic":"http://hb.huidang2105.com:8900/public/uploads/default/mer.png","userName":"刘博闻","address":"四川省成都市","money":"0.19","getTime":"17/09/08 19:07:16"}]
         * gotter_count : 3
         */

        private int rid;
        private String merchant;
        private String address;
        private String tel;
        private int money;
        private int pCount;
        private int remainCount;
        private String userPic;
        private String merchant_des;
        private String question;
        private String answer;
        private String answer0;
        private String answer1;
        private String answer2;
        private int status;
        private boolean status_user;
        private int isgot;
        private boolean iscollect;
        private int gotter_count;
        private List<GetterBean> getter;

        public int getRid() {
            return rid;
        }

        public void setRid(int rid) {
            this.rid = rid;
        }

        public String getMerchant() {
            return merchant;
        }

        public void setMerchant(String merchant) {
            this.merchant = merchant;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int getPCount() {
            return pCount;
        }

        public void setPCount(int pCount) {
            this.pCount = pCount;
        }

        public int getRemainCount() {
            return remainCount;
        }

        public void setRemainCount(int remainCount) {
            this.remainCount = remainCount;
        }

        public String getUserPic() {
            return userPic;
        }

        public void setUserPic(String userPic) {
            this.userPic = userPic;
        }

        public String getMerchant_des() {
            return merchant_des;
        }

        public void setMerchant_des(String merchant_des) {
            this.merchant_des = merchant_des;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public String getAnswer0() {
            return answer0;
        }

        public void setAnswer0(String answer0) {
            this.answer0 = answer0;
        }

        public String getAnswer1() {
            return answer1;
        }

        public void setAnswer1(String answer1) {
            this.answer1 = answer1;
        }

        public String getAnswer2() {
            return answer2;
        }

        public void setAnswer2(String answer2) {
            this.answer2 = answer2;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public boolean isStatus_user() {
            return status_user;
        }

        public void setStatus_user(boolean status_user) {
            this.status_user = status_user;
        }

        public int getIsgot() {
            return isgot;
        }

        public void setIsgot(int isgot) {
            this.isgot = isgot;
        }

        public boolean isIscollect() {
            return iscollect;
        }

        public void setIscollect(boolean iscollect) {
            this.iscollect = iscollect;
        }

        public int getGotter_count() {
            return gotter_count;
        }

        public void setGotter_count(int gotter_count) {
            this.gotter_count = gotter_count;
        }

        public List<GetterBean> getGetter() {
            return getter;
        }

        public void setGetter(List<GetterBean> getter) {
            this.getter = getter;
        }

        public static class GetterBean implements Parcelable {
            /**
             * userPic : http://hb.huidang2105.com:8900/public/uploads/user_pic/6/20170907202159YEPl9.jpeg
             * userName : 在一家店在哪里
             * address : 四川省成都市
             * money : 0.07
             * getTime : 17/09/09 08:33:21
             */

            private String userPic;
            private String userName;
            private String address;
            private String money;
            private String getTime;

            public String getUserPic() {
                return userPic;
            }

            public void setUserPic(String userPic) {
                this.userPic = userPic;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getMoney() {
                return money;
            }

            public void setMoney(String money) {
                this.money = money;
            }

            public String getGetTime() {
                return getTime;
            }

            public void setGetTime(String getTime) {
                this.getTime = getTime;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.userPic);
                dest.writeString(this.userName);
                dest.writeString(this.address);
                dest.writeString(this.money);
                dest.writeString(this.getTime);
            }

            public GetterBean() {
            }

            protected GetterBean(Parcel in) {
                this.userPic = in.readString();
                this.userName = in.readString();
                this.address = in.readString();
                this.money = in.readString();
                this.getTime = in.readString();
            }

            public static final Parcelable.Creator<GetterBean> CREATOR = new Parcelable.Creator<GetterBean>() {
                @Override
                public GetterBean createFromParcel(Parcel source) {
                    return new GetterBean(source);
                }

                @Override
                public GetterBean[] newArray(int size) {
                    return new GetterBean[size];
                }
            };
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.rid);
            dest.writeString(this.merchant);
            dest.writeString(this.address);
            dest.writeString(this.tel);
            dest.writeInt(this.money);
            dest.writeInt(this.pCount);
            dest.writeInt(this.remainCount);
            dest.writeString(this.userPic);
            dest.writeString(this.merchant_des);
            dest.writeString(this.question);
            dest.writeString(this.answer);
            dest.writeString(this.answer0);
            dest.writeString(this.answer1);
            dest.writeString(this.answer2);
            dest.writeInt(this.status);
            dest.writeByte(this.status_user ? (byte) 1 : (byte) 0);
            dest.writeInt(this.isgot);
            dest.writeByte(this.iscollect ? (byte) 1 : (byte) 0);
            dest.writeInt(this.gotter_count);
            dest.writeTypedList(this.getter);
        }

        public DataBean() {
        }

        protected DataBean(Parcel in) {
            this.rid = in.readInt();
            this.merchant = in.readString();
            this.address = in.readString();
            this.tel = in.readString();
            this.money = in.readInt();
            this.pCount = in.readInt();
            this.remainCount = in.readInt();
            this.userPic = in.readString();
            this.merchant_des = in.readString();
            this.question = in.readString();
            this.answer = in.readString();
            this.answer0 = in.readString();
            this.answer1 = in.readString();
            this.answer2 = in.readString();
            this.status = in.readInt();
            this.status_user = in.readByte() != 0;
            this.isgot = in.readInt();
            this.iscollect = in.readByte() != 0;
            this.gotter_count = in.readInt();
            this.getter = in.createTypedArrayList(GetterBean.CREATOR);
        }

        public static final Parcelable.Creator<DataBean> CREATOR = new Parcelable.Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.err);
        dest.writeString(this.msg);
        dest.writeParcelable(this.data, flags);
    }

    public RedPacketDetailResponse() {
    }

    protected RedPacketDetailResponse(Parcel in) {
        this.err = in.readInt();
        this.msg = in.readString();
        this.data = in.readParcelable(DataBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<RedPacketDetailResponse> CREATOR = new Parcelable.Creator<RedPacketDetailResponse>() {
        @Override
        public RedPacketDetailResponse createFromParcel(Parcel source) {
            return new RedPacketDetailResponse(source);
        }

        @Override
        public RedPacketDetailResponse[] newArray(int size) {
            return new RedPacketDetailResponse[size];
        }
    };
}
