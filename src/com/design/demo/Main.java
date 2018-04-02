package com.design.demo;


public class Main {

    public static void main(String[] args) {

        //创建型： 单例 工厂 抽象 建造者 原型
        //结构型： 桥接 装饰 外观 代理 适配器 组合 享元
        //行为型： 中介 策略 命令 状态 职责链 观察者 访问者 模板 迭代 备忘录

        com.design.demo.decorator_装饰.Client.m();

        com.design.demo.strategy_策略.Client.m();

        com.design.demo.mediator_中介.Client.m();

        com.design.demo.bridge_桥接.Client.m();

        //----------------------------------------
        com.design.demo.observer_观察者.Client.m();

        com.design.demo.command_命令.Client.m();


        //责任链 代理 状态 组合 访问
        com.design.demo.responsibility_责任.Client.m();

        com.design.demo.proxy_代理.Client.m();

        com.design.demo.state_状态.Client.m();

        //----------------------------------------
        com.design.demo.template_模板.Client.m();

        com.design.demo.facade_门面外观.Client.m();

        com.design.demo.adapter_适配器.Client.m();

        com.design.demo.composite_组合.Client.m();

        com.design.demo.visitor_访问.Client.m();




        //创建型 单例  工厂 抽象  建造者
        com.design.demo.single_单例.Client.m();
        com.design.demo.factory_工厂.Client.m();
        com.design.demo.abstract_factory_抽像工厂.Client.m();
        com.design.demo.builder_建造.Client.m();

        //迭代 原型 享元 备忘录

    }

}
