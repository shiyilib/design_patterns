package com.shiyilib.builder;

import javafx.scene.Parent;

import javax.swing.*;
import java.awt.*;

public class ParlourDecorator {

    public static void main(String[] args) {

    }
}

class Parlour{
    private String wall;
    private String TV;
    private String sofa;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show(){
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = wall + TV + sofa;
        JLabel l = new JLabel(new ImageIcon("src/" + parlour + ".jpg"));
        p.setLayout(new GridLayout(1,1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp,BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//抽象建造者
abstract class Decorator{
    protected Parlour parlour = new Parlour();

    public abstract void buildWall();

    public abstract void buildTV();

    public abstract void buildSofa();

    public Parlour getResult(){
        return parlour;
    }
}

//具体建造者
class ConcreteDecorator extends Decorator{

    @Override
    public void buildWall() {
        parlour.setWall("wall");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sofa");
    }
}

//指挥者
class ProjectManager{
    private Decorator decorator;

    public ProjectManager(Decorator decorator){
        this.decorator = decorator;
    }

    public Parlour construct(){
        decorator.buildWall();
        decorator.buildTV();
        decorator.buildSofa();
        return decorator.getResult();
    }
}