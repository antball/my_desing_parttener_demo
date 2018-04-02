package com.design.demo.composite_组合;

public class Client {

    public static void main(String[] args) {
        m();
    }


    public static void m() {
        System.out.println("*********************");
        System.out.println("*   组合模式调用");
        System.out.println("*********************");

        Branch root = new Branch("刘经理", "经理");
        Branch zj = new Branch("王总监", "总监");
        Crop yg = new Leaf("李员工", "员工");
        Crop yg1 = new Leaf("勤员工", "员工");
        root.add(zj);
        zj.add(yg);
        zj.add(yg1);

        zj = new Branch("王总监1", "总监");
        yg = new Leaf("李员工1", "员工");
        yg1 = new Leaf("勤员工1", "员工");
        root.add(zj);
        zj.add(yg);
        zj.add(yg1);

        System.out.println("显示所有的构件：");
        display(root);

        System.out.println("显示parent:");
        getParent(yg);

        System.out.println();
    }

    public static void getParent(Crop crop) {

        crop.doSomething();

        if (crop.getParent() != null) {
            getParent(crop.getParent());
        }

    }

    public static void display(Branch root) {

        root.doSomething();

        for (Crop crop : root.getChilden()) {
            if (crop instanceof Branch) {
                display((Branch) crop);//这里也可以不用转换，需Crop中加入添加删除子构件的方法
            } else {
                crop.doSomething();
            }
        }
    }
}
