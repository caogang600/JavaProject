package com.company.threadDemo;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str1 = "{\"_form\":{\"matterPropertyUpdateTimeDesc\":\"事项属性本身的更新时间，key为属性id，value为更新时间\"," +
                "\"matterPropertyUpdateTime\":{\"self.FRSFZ\":\"2020-08-14 16:54:41\",\"self.FRDZYX\":\"2020-08-14 " +
                "16:58:13\",\"self.WJWJBR\":\"2020-08-14 16:54:49\",\"self.JBRSJH73\":\"2020-08-14 16:56:27\",\"self" +
                ".LXRDH\":\"2020-08-14 16:57:47\",\"self.TYSHXYDM\":\"2020-08-14 16:54:06\",\"self" +
                ".FRWYBS\":\"2020-08-14 17:09:01\",\"self.JBRSFZH\":\"2020-08-14 16:56:12\",\"self" +
                ".LXRSJHM\":\"2020-08-14 16:57:13\",\"self.FDDBRXM\":\"2020-08-14 16:54:30\",\"self" +
                ".YZBM01\":\"2020-08-14 16:58:25\",\"self.QYMC\":\"2020-08-14 16:53:46\",\"self.BZ75\":\"2020-08-14 " +
                "17:08:13\",\"self.SPSXMC14\":\"2020-08-14 17:08:26\",\"self.CZHM\":\"2020-08-14 16:58:01\",\"self" +
                ".QYTXDZ\":\"2020-08-14 16:58:37\",\"self.LXRXM\":\"2020-08-14 16:56:40\",\"self" +
                ".LXRSFZ\":\"2020-08-14 16:57:35\",\"self.JBRLXDH\":\"2020-08-14 16:55:58\",\"self" +
                ".SFKD\":\"2020-08-14 16:59:03\",\"self.KDDZ\":\"2020-08-14 16:59:03\",\"self.XMMC50\":\"2020-08-14 " +
                "17:04:12\"},\"cardPropertyFeature\":{},\"propertyTemplate\":{},\"mergedTemplateCode\":{}}," +
                "\"schemaType\":\"superform\",\"schemaVersion\":\"1.0\",\"request\":[{\"requestId\":\"getFg2\"," +
                "\"action\":\"/form/commonAsyncDatashare\",\"params\":{\"companyName\":\"${self.QYMC}.value\"," +
                "\"bizCode\":\"${self.TYSHXYDM}.value\",\"registerNo\":\"\",\"entType\":\"\",\"additional\":\"\"}," +
                "\"type\":\"POST\",\"self.QYMC\":{\"value\":\"\"},\"self.TYSHXYDM\":{\"value\":\"\"},\"self" +
                ".FDDBRXM\":{\"value\":\"${res}.legalPersonName\"},\"self.FRSFZ\":{\"value\":\"${res}" +
                ".legalPersonPaperNo\"},\"self.LXRXM\":{\"value\":\"${res}.liaisonInfo_name\"},\"self" +
                ".YZBM01\":{\"value\":\"${res}.postalcode\"},\"self.QYTXDZ\":{\"value\":\"${res}.companyAddr\"}," +
                "\"self.LXRDH\":{\"value\":\"${res}.liaisonInfo_tel\"}}],\"pages\":[{\"id\":\"PAGE_101102344\"," +
                "\"layout\":{\"componentName\":\"Root\",\"id\":\"root\",\"props\":{\"flexible\":false," +
                "\"mode\":\"normal\",\"containerStyle\":{},\"pageStyle\":{\"backgroundColor\":\"#fff\"}}," +
                "\"children\":[{\"componentName\":\"GroupLayout\",\"id\":\"node_jzdiukfw\"," +
                "\"props\":{\"fieldId\":\"group_jzdkd9yz\",\"fieldId$$2\":\"group_jzdkd9yz\"," +
                "\"title\":{\"type\":\"i18n\",\"use\":null,\"en_US\":\"Group\",\"zh_CN\":\"分组\"}," +
                "\"subTitle\":{\"type\":\"i18n\",\"use\":null,\"en_US\":null,\"zh_CN\":\"\"}," +
                "\"description\":{\"type\":\"i18n\",\"use\":null,\"en_US\":null,\"zh_CN\":\"\"},\"visible\":true," +
                "\"hideOnNav\":false},\"children\":[]},{\"componentName\":\"Input\",\"id\":\"self_SPSXMC14_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.SPSXMC14\",\"label\":\"审批事项名称\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\",\"message\":\"当前字段不能为空\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Textarea\"," +
                "\"id\":\"self_XMMC50_view_id\",\"props\":{\"group\":\"\",\"_type\":\"string\",\"info\":\"\"," +
                "\"fieldId\":\"self.XMMC50\",\"label\":\"项目名称\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"style\":{\"maxWidth\":\"446px\"},\"maxHeight\":120,\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"disabled\":false,\"visible\":true," +
                "\"autoTrim\":false,\"showCounter\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_QYMC_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"_vaildation\":[],\"fieldId\":\"self.QYMC\"," +
                "\"label\":\"企业名称\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\",\"message\":\"当前字段不能为空\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"]}},{\"componentName\":\"Input\",\"id\":\"self_TYSHXYDM_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.TYSHXYDM\",\"label\":\"统一社会信用代码\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\",\"message\":\"当前字段不能为空\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_FDDBRXM_view_id\",\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".FDDBRXM\",\"label\":\"法定代表人姓名\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\",\"message\":\"当前字段不能为空\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_FRSFZ_view_id\",\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".FRSFZ\",\"label\":\"法人身份证\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\",\"message\":\"当前字段不能为空\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_WJWJBR_view_id\",\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".WJWJBR\",\"label\":\"经办人\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_JBRLXDH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.JBRLXDH\",\"label\":\"经办人联系电话\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_JBRSFZH_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.JBRSFZH\",\"label\":\"经办人身份证号\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_JBRSJH73_view_id\",\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".JBRSJH73\",\"label\":\"经办人手机号\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_LXRXM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.LXRXM\",\"label\":\"联系人姓名\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_LXRSJHM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.LXRSJHM\",\"label\":\"联系人手机号码\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_LXRSFZ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.LXRSFZ\",\"label\":\"联系人身份证\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_LXRDH_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.LXRDH\",\"label\":\"联系人电话\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_CZHM_view_id\",\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".CZHM\",\"label\":\"传真号码\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_FRDZYX_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.FRDZYX\",\"label\":\"法人电子邮箱\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_YZBM01_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.YZBM01\",\"label\":\"邮政编码\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_QYTXDZ_view_id\",\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".QYTXDZ\",\"label\":\"企业通讯地址\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\",\"message\":\"当前字段不能为空\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Radio\"," +
                "\"id\":\"self_SFKD_view_id\",\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.SFKD\",\"label\":\"是否快递\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true," +
                "\"displayStyle\":\"horizontal\",\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"是\"," +
                "\"value\":\"1\"},{\"text\":\"否\",\"value\":\"2\"}]},\"validation\":[],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_KDDZ_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.KDDZ\",\"label\":\"快递地址\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Textarea\"," +
                "\"id\":\"self_BZ75_view_id\",\"props\":{\"group\":\"\",\"_type\":\"string\",\"info\":\"\"," +
                "\"fieldId\":\"self.BZ75\",\"label\":\"备注\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"maxHeight\":120,\"layout\":\"HORIZONTAL\",\"size\":\"large\"," +
                "\"gridLayout\":\"[]\",\"readonly\":false,\"disabled\":false,\"visible\":true,\"autoTrim\":false," +
                "\"showCounter\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_FRWYBS_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.FRWYBS\",\"label\":\"法人唯一标识\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":false,\"inputType\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},\"params\":{}}]}";
        str1 = str1.replaceAll("\",\"label\":\"","&\"");
        str1 = str1.replaceAll("\"fieldId\":\"","&");
        str1 = str1.replaceAll(",\"showLabel\"","&");
        String[] s = str1.split("&");
        String l = "";
        for(int i=0; i<s.length;i++){
            if(s[i].length()<100){
                l += s[i];
            }
        }
        String arrString = Arrays.toString(s);

        System.out.println(l);
        String[] lll = l.split("\"");
        String m = "";
        String n = "";
        for(int i=0; i<lll.length;i++){
            if(i%2==0){
                m += "\n"+lll[i];
            }else{
                n += "\n"+lll[i];
            }

        }
        System.out.println(m);//字段
        System.out.println(n);//中文
    }
}
