package com.allcoolboys.flyweight.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 新增加不共享的子类也就是组合的享元子类
 * 内部使用list 维护单纯享元模式对象，提供add方法进行添加
 * 组合享元：颜色 （里面引用了一享元对象所以叫复合享元）
 * @author coolboy
 */
public class ColorCharacter extends Character{
    private String colorString;
    private List<Character> list = new ArrayList<>();

    public ColorCharacter(String colorString) {
        this.colorString = colorString;
    }

    public String getColorString() {
        return this.colorString;
    }

    public void addCharacte(Character character) {
        list.add(character);
    }

    @Override
    void display(String outerState) {
        for (Character character : list) {
            character.display(outerState);
        }
    }
}
