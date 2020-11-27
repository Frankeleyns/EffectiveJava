package com.effective.chapter2.artic2;

/**
 * 第2条 遇到很多构造器参数时要考虑使用构造器
 *
 *  我们经常遇到一个开发场景，就是一个实体类的参数很多，你要创建它的对象给它赋值，然后保存进数据库
 *
 *  第一种方法，使用类的构造方法
 *  public User(String id,String account,String password,String sex,String name,String phone){
 *      this.id        = id;
 *      this.account   = account;
 *      ...
 *  }
 *  然后你要创建实例
 *  User user = new User(UUID,"123456","123456","男","会飞的猪","10010");
 *  这样的话你在别的地方看见这些参数你就会不知道什么意思，可读性不好
 *
 *  第二种方法，就是使用JavaBeans模式，也就是Getter Setter
 *  public void setId(String id) {this.id = id;}
 *  public void setAccount(String account){this.account = account;}
 *  ....
 *  创建对象就是
 *  User user = new User();
 *  user.setId(UUID);
 *  user.setAccount("123456");
 *  ...
 *
 *  绝大部分人肯定用的都是这种，可惜的是这种方式其实是有缺点的。因为有很多set，所以构造过程被分成后几个调
 *  用在构造过程中会导致JavaBeans可能处于不一致状态，于是你就需要额外写代码来保持线程安全，比如在构造的时
 *  候加个 synchronized
 *
 *  还有第三种方法，既可以像构造器模式那样安全，也可以像JavaBeans模式那样可读性好。这就是建造者模式(Builder Pattern)
 *
 */
public class User {
    private String id;
    private String account;
    private String password;
    private String sex;
    private String name;
    private String phone;

    public static class Builder{
        private String id;
        private String account;
        private String password;
        private String sex;
        private String name;
        private String phone;

        public Builder id(String var){ id = var;    return this; }
        public Builder account(String var){ account = var;  return this; };
        public Builder password(String var){ password = var;  return this; };
        public Builder sex(String var){ sex = var;  return this; };
        public Builder name(String var){ name = var;  return this; };
        public Builder phone(String var){ phone = var;  return this; };

        public User build(){
            return new User(this);
        }
    }


    private User(Builder builder){
        this.id = builder.id;
        this.account = builder.account;
        this.password = builder.password;
        this.sex = builder.sex;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
