package com.company.demo3;

import org.junit.Test;

public class MainClass {

    @Test
    public void testFun() {
        //创建抽奖器对象
        ProductGetter<String> productGetter = new ProductGetter<>();
        //奖品
        String [] strProducts = {"苹果手机","华为手机","扫地机器人","咖啡机"};
        //将奖品放入到奖品池中
        for (String product : strProducts) {
            productGetter.addProduct(product);
        }
        //获取随机奖品
        String product = productGetter.getProduct();
        System.err.println("恭喜您,您抽中了："+product);

        System.err.println("==================>> 区分 <<==================");

        ProductGetter<Integer> intProductGetter = new ProductGetter<>();
        int[] intProducts = {10000,5000,3000,500,30000};
        for (int intProduct : intProducts) {
            intProductGetter.addProduct(intProduct);
        }
        //获取随机奖品
        Integer intProduct = intProductGetter.getProduct();
        System.err.println("恭喜您,您抽中了："+intProduct);
    }
}
