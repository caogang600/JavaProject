package com.company.threadDemo;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str1 = "{\"matterPropertyUpdateTimeDesc\":\"事项属性本身的更新时间，key为属性id，value为更新时间\"," +
                "\"matterPropertyUpdateTime\":{\"self.FRSFZ\":\"2020-08-24 16:38:28\",\"self" +
                ".FDDBR\":\"2020-08-24 16:38:30\",\"self.LXRDH\":\"2020-11-26 16:11:09\",\"self" +
                ".TYSHXYDM\":\"2020-08-24 16:38:30\",\"self.JJLX_WH\":\"2020-11-26 15:49:00\",\"self" +
                ".ZCZJ_WH\":\"2020-11-26 15:49:10\",\"ZYCYRYXX_WH#ZYCYRYDJZW_WH\":\"2020-05-22 " +
                "10:05:27\",\"self.GSDJJG\":\"2020-11-26 16:14:21\",\"self.QYTXDZ\":\"2020-11-26 " +
                "15:49:00\",\"self.SBDW\":\"2020-08-24 16:38:28\",\"self.LXRXM\":\"2020-08-24 " +
                "16:38:30\",\"ZYCYRYXX_WH#ZYCYRYDJXB_WH\":\"2020-05-22 10:05:27\"," +
                "\"ZYCYRYXX_WH#ZYCYRYDJ_YCJJZGZSH_WH\":\"2020-05-22 10:05:27\",\"self" +
                ".ZYCYRYXX_WH\":\"2020-11-26 16:29:48\",\"ZYCYRYXX_WH#ZYCYRYDJXM_WH\":\"2020-05-22 " +
                "10:05:27\",\"ZYCYRYXX_WH#ZYCYRYDJSFZH_WH\":\"2020-05-22 10:05:27\",\"self" +
                ".YYQX43\":\"2020-11-26 16:33:35\"},\"cardPropertyFeature\":{\"self" +
                ".ZYCYRYXX_WH\":{\"ZYCYRYDJZW_WH\":\"isUniqueIndex:false\"," +
                "\"ZYCYRYDJSFZH_WH\":\"isUniqueIndex:false\"," +
                "\"ZYCYRYDJXB_WH\":\"isUniqueIndex:false\",\"ZYCYRYDJXM_WH\":\"isUniqueIndex:false\"," +
                "\"ZYCYRYDJ_YCJJZGZSH_WH\":\"isUniqueIndex:false\"}},\"mergedTemplateCode\":{}}," +
                "\"schemaType\":\"superform\",\"schemaVersion\":\"1.0\"," +
                "\"request\":[{\"requestId\":\"enterpriseInfo\"," +
                "\"action\":\"/form/commonAsyncDatashare\",\"event\":\"\"," +
                "\"params\":{\"entityCode\":\"enterpriseInfo\",\"entType\":\"E\"," +
                "\"bizCode\":\"${self.TYSHXYDM}.value\",\"key_bizCode\":\"self.TYSHXYDM\"," +
                "\"desensitizeConfig\":\"self.FDDBR=legalPersonName;self.FRSFZ=legalPersonPaperNo\"}," +
                "\"type\":\"POST\",\"target\":{\"self" +
                ".FDDBR\":{\"props\":{\"value\":\"${res}.legalPersonName\",\"behavior\":\"${res}" +
                ".legalPersonName ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': " +
                "\\'DISABLED\\'} \"}},\"self.FRSFZ\":{\"props\":{\"value\":\"${res}" +
                ".legalPersonPaperNo\",\"behavior\":\"${res}.legalPersonPaperNo ==\\'\\' ? " +
                "{\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': \\'DISABLED\\'} \"}},\"self" +
                ".QYTXDZ\":{\"props\":{\"value\":\"${res}.companyAddr\"}}}}],\"rules\":[]," +
                "\"pages\":[{\"id\":\"PAGE_101100720\"," +
                "\"layout\":{\"componentName\":\"Root\",\"id\":\"root\"," +
                "\"props\":{\"flexible\":false,\"mode\":\"normal\",\"containerStyle\":{}," +
                "\"pageStyle\":{\"backgroundColor\":\"#f2f2f2\"}}," +
                "\"children\":[{\"componentName\":\"GroupLayout\",\"id\":\"node_jzdiukfw\"," +
                "\"props\":{\"fieldId2\":\"group_jzdkd9yz\",\"fieldId\":\"group_jzdkd9yz\"," +
                "\"fieldId$$2\":\"group_jzdkd9yz\",\"title\":{\"type\":\"i18n\",\"use\":null," +
                "\"en_US\":\"Group\",\"zh_CN\":\"基本信息\"},\"subTitle\":{\"type\":\"i18n\"," +
                "\"use\":null,\"en_US\":null,\"zh_CN\":\"\"}," +
                "\"description\":{\"type\":\"i18n\",\"use\":null,\"en_US\":null," +
                "\"zh_CN\":\"\"},\"visible\":true,\"hideOnNav\":false}," +
                "\"children\":[{\"componentName\":\"AutoColumnsLayout\",\"id\":\"node_khylyzxe\"," +
                "\"props\":{\"layout\":2,\"fieldId\":\"columns_khylyzxp\"}," +
                "\"children\":[{\"componentName\":\"Input\",\"id\":\"self_SBDW_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId2\":\"self" +
                ".SBDW\",\"fieldId\":\"self.SBDW\",\"label\":\"申报单位\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":true,\"visible\":true," +
                "\"inputType\":false,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_TYSHXYDM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.TYSHXYDM\",\"fieldId\":\"self.TYSHXYDM\"," +
                "\"label\":\"统一社会信用代码\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":true,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_khym02s0\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_khym02s4\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_JJLX_WH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.JJLX_WH\",\"label\":\"经济类型\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"FloatNumber\"," +
                "\"id\":\"self_ZCZJ_WH_view_id\",\"props\":{\"_type\":\"double\"," +
                "\"info\":\"\",\"fieldId\":\"self.ZCZJ_WH\",\"label\":\"注册资金\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"jsxtype\":\"\"," +
                "\"delimiter\":\"\",\"roundMode\":\"1\",\"align\":\"left\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_khym0w87\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_khym0w88\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_GSDJJG_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.GSDJJG\",\"label\":\"工商注册机关\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"CascadeDate\"," +
                "\"id\":\"self_YYQX43_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"timeRange\",\"info\":\"\",\"fieldId\":\"self.YYQX43\"," +
                "\"label\":\"营业期限\",\"showLabel\":true,\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"dateType\":\"yyyy-mm-dd\"," +
                "\"autoMatchWidth\":true,\"placeholder\":{\"start\":\"开始时间\"," +
                "\"end\":\"结束时间\"},\"selectable\":{},\"__formatIn__\":\"\"," +
                "\"__formatOut__\":\"\",\"requireType\":\"both\"," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_khym1j3w\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_khym1j3z\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_FDDBR_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"_vaildation\":[],\"fieldId2\":\"self.FDDBR\"," +
                "\"fieldId\":\"self.FDDBR\",\"label\":\"法人代表\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":true,\"visible\":true," +
                "\"inputType\":false,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_FRSFZ_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId2\":\"self" +
                ".FRSFZ\",\"fieldId\":\"self.FRSFZ\",\"label\":\"法人代表身份证\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":true,\"visible\":true," +
                "\"inputType\":false,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"},{\"type\":\"idCard\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_khym1td4\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_khym1td8\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_LXRXM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.LXRXM\",\"fieldId\":\"self.LXRXM\"," +
                "\"label\":\"联系人\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_LXRDH_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".LXRDH\",\"label\":\"联系人电话\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"Input\"," +
                "\"id\":\"self_QYTXDZ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.QYTXDZ\",\"fieldId\":\"self.QYTXDZ\"," +
                "\"label\":\"住所\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"BigTable\"," +
                "\"id\":\"self_ZYCYRYXX_WH_view_id\",\"props\":{\"_type\":\"bigTable\"," +
                "\"layout\":\"VERTICAL\",\"gridLayout\":\"[]\",\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"buttonName\":\"新增一条记录\",\"showIndex\":true," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"fieldId\":\"self.ZYCYRYXX_WH\",\"label\":\"主要 从业 " +
                "人员 登记\",\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"readonly\":false,\"visible\":true," +
                "\"style\":{\"maxWidth\":\"100%\"},\"theme\":\"split\"," +
                "\"importMode\":\"upload\",\"rowSelector\":\"checkboxSelector\"," +
                "\"enableEdit\":true,\"enableDelete\":true,\"showTableHead\":true," +
                "\"showSortable\":false,\"pageSize\":10,\"enableAdd\":true," +
                "\"genTemplateType\":\"AUTO\",\"enableSearch\":false," +
                "\"searchColumns\":[{\"searchKey\":\"searchColumn1\"}," +
                "{\"searchKey\":\"searchColumn2\"},{\"searchKey\":\"searchColumn3\"}]," +
                "\"dataShareSearchFields\":[{\"label\":\"搜索关键字\"}],\"addButtonName\":\"单个增加\"," +
                "\"editButtonName\":\"修改\",\"deleteButtonName\":\"删除\"}," +
                "\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"ZYCYRYDJXM_WH_self_ZYCYRYXX_WH_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\"," +
                "\"fieldId\":\"ZYCYRYDJXM_WH\",\"label\":\"姓名\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Select\"," +
                "\"id\":\"ZYCYRYDJXB_WH_self_ZYCYRYXX_WH_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"ZYCYRYDJXB_WH\"," +
                "\"label\":\"性别\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[]},\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"ZYCYRYDJZW_WH_self_ZYCYRYXX_WH_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\"," +
                "\"fieldId\":\"ZYCYRYDJZW_WH\",\"label\":\"职务\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Number\"," +
                "\"id\":\"ZYCYRYDJSFZH_WH_self_ZYCYRYXX_WH_view_id\"," +
                "\"props\":{\"_type\":\"long\",\"info\":\"\"," +
                "\"fieldId\":\"ZYCYRYDJSFZH_WH\",\"label\":\"身份证号\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"jsxtype\":\"\",\"delimiter\":\"\"," +
                "\"roundMode\":\"1\",\"align\":\"left\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Number\"," +
                "\"id\":\"ZYCYRYDJ_YCJJZGZSH_WH_self_ZYCYRYXX_WH_view_id\"," +
                "\"props\":{\"_type\":\"long\",\"info\":\"\"," +
                "\"fieldId\":\"ZYCYRYDJ_YCJJZGZSH_WH\",\"label\":\"演出经纪资格证书号\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"jsxtype\":\"\"," +
                "\"delimiter\":\"\",\"roundMode\":\"1\",\"align\":\"left\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]}]},\"params\":{}}]}";
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
