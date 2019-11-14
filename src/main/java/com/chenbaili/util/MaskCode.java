package com.chenbaili.util;


public class MaskCode {
    public static void main(String[] args) {
        String decryptName ="LEthItuyEt.".trim().replace(" ", "");
        String realName ="LEthItuyEt".trim().replace(" ", "");
        Float result = BlurMatchingNameUtil.checkName(decryptName,realName);
        System.out.println(result);

    }
}
