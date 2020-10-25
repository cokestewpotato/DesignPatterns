package com.allcoolboys.Decorator;

/**
 * 测试购买
 * @author coolboy
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("张三");
        CoolBoyHandPancake coolBoyHandPancake = new CoolBoyHandPancake();
        // 购买了一份普通手抓饼
        customer.buy(coolBoyHandPancake);

        Bacon baconHandPancake = new Bacon(coolBoyHandPancake);
        // 购买了一份添加培根的手抓饼
        customer.buy(baconHandPancake);

        Egg eggHandPancake = new Egg(coolBoyHandPancake);
        // 购买了一份添加鸡蛋的手抓饼
        customer.buy(eggHandPancake);

        Sausage sausageHandPancake = new Sausage(new Egg(baconHandPancake));
        // 购买了一份添加了培根、鸡蛋、烤肠的手抓饼
        customer.buy(sausageHandPancake);
    }
}
