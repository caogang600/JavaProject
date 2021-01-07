package com.company.threadDemo;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str1 = "'{\"_form\":{\"matterPropertyUpdateTimeDesc\":\"事项属性本身的更新时间，key为属性id，value为更新时间\"," +
                "\"matterPropertyUpdateTime\":{\"self.FRSFZ\":\"2020-12-24 08:37:42\",\"self" +
                ".FDDBR\":\"2020-08-24 16:39:32\",\"self.GDZC\":\"2020-12-23 16:29:15\",\"self" +
                ".HSXS\":\"2020-12-24 14:08:47\",\"WZXX#WZYM\":\"2020-12-23 15:23:32\"," +
                "\"GQJG#HHRHZGDXM_CZ\":\"2020-12-23 15:21:53\",\"self.CLSJ\":\"2020-12-24 13:25:21\"," +
                "\"self.YB\":\"2020-12-23 17:08:23\",\"GQJG#YYZZHM\":\"2020-12-23 15:22:02\",\"self" +
                ".ZCZJ_WH\":\"2020-12-23 17:08:23\",\"self.LXRZJLX\":\"2020-12-24 14:08:47\",\"self" +
                ".JYMJ77\":\"2020-12-23 17:08:24\",\"self.SSXZQH\":\"2020-12-24 14:09:41\",\"self" +
                ".BZ64\":\"2020-12-24 14:08:47\",\"self.GSDJJG\":\"2020-12-24 14:08:47\",\"self" +
                ".QYTXDZ\":\"2020-12-23 14:21:23\",\"self.LXRXM\":\"2020-12-24 08:48:59\",\"self" +
                ".LXDWDH\":\"2020-12-23 17:08:23\",\"self.LXRSFZ\":\"2020-12-24 14:08:47\",\"self" +
                ".YXZH\":\"2020-12-23 17:08:23\",\"self.XB1\":\"2020-12-24 14:15:36\",\"self" +
                ".ZJLX220\":\"2020-12-24 14:15:10\",\"self.XL87\":\"2020-12-24 14:08:48\",\"self" +
                ".DHHM01\":\"2020-12-23 17:08:23\",\"self.ZZXS34\":\"2020-12-24 14:08:47\",\"self" +
                ".GQJG\":\"2020-12-24 14:08:47\",\"self.DWRS1\":\"2020-12-23 17:08:23\",\"self" +
                ".JJLX33\":\"2020-12-24 14:08:47\",\"GQJG#CZE_WY\":\"2020-12-23 15:22:08\",\"self" +
                ".TYSHXYDM\":\"2020-08-24 16:39:32\",\"self.LXRSJHM\":\"2020-12-24 14:09:42\",\"self" +
                ".WZXX\":\"2020-12-24 14:08:48\",\"self.ZSGS\":\"2020-12-24 14:08:47\",\"self" +
                ".BZ99\":\"2020-12-24 14:08:47\",\"WZXX#WZMC73\":\"2020-12-23 15:23:26\",\"self" +
                ".SQXM0\":\"2020-12-24 14:08:47\",\"self.SBDW\":\"2020-08-24 16:39:32\",\"self" +
                ".FRSJH68\":\"2020-12-24 14:15:10\",\"self.FRZG\":\"2020-12-24 14:15:10\",\"self" +
                ".CZ69\":\"2020-12-24 14:08:47\",\"self.ZZZG\":\"2020-12-24 14:08:47\",\"self" +
                ".FWQ47\":\"2020-12-23 17:08:23\",\"self.ZBGC_XL\":\"2020-12-23 17:08:23\",\"self" +
                ".ZZLX63\":\"2020-12-24 14:08:47\",\"self.ZQQTWXYY\":\"2020-12-24 14:08:47\"," +
                "\"WZXX#WZIPDZ\":\"2020-12-23 15:23:37\",\"self.YYQX43\":\"2020-12-24 14:08:47\"}," +
                "\"cardPropertyFeature\":{\"self.WZXX\":{\"WZMC73\":\"isUniqueIndex:false\"," +
                "\"WZIPDZ\":\"isUniqueIndex:false\",\"WZYM\":\"isUniqueIndex:false\"},\"self" +
                ".GQJG\":{\"HHRHZGDXM_CZ\":\"isUniqueIndex:false\"," +
                "\"CZE_WY\":\"isUniqueIndex:false\",\"YYZZHM\":\"isUniqueIndex:false\"}}," +
                "\"mergedTemplateCode\":{}},\"schemaType\":\"superform\",\"schemaVersion\":\"1" +
                ".0\",\"request\":[{\"requestId\":\"enterpriseInfo\"," +
                "\"action\":\"/form/commonAsyncDatashare\",\"event\":\"\"," +
                "\"params\":{\"scriptId\":\"103503297\",\"entityCode\":\"enterpriseInfo\"," +
                "\"entType\":\"E\",\"bizCode\":\"${self.TYSHXYDM}.value\"," +
                "\"key_bizCode\":\"self.TYSHXYDM\",\"desensitizeConfig\":\"self.FDDBR=legalPersonName;" +
                "self.FRSFZ=legalPersonPaperNo\"},\"type\":\"POST\",\"target\":{\"self" +
                ".FDDBR\":{\"props\":{\"value\":\"${res}.legalPersonName\",\"behavior\":\"${res}" +
                ".legalPersonName ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': " +
                "\\'DISABLED\\'} \"}},\"self.FRSFZ\":{\"props\":{\"value\":\"${res}" +
                ".legalPersonPaperNo\",\"behavior\":\"${res}.legalPersonPaperNo ==\\'\\' ? " +
                "{\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': \\'DISABLED\\'} \"}},\"self" +
                ".QYTXDZ\":{\"props\":{\"value\":\"${res}.companyAddr\"}},\"self" +
                ".YYQX43\":{\"props\":{\"value\":\"${res}.dateMap\",\"behavior\":\"${res}.dateMap" +
                ".endDate ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': \\'DISABLED\\'} " +
                "\"}},\"self.GSDJJG\":{\"props\":{\"value\":\"${res}.regOrg\"," +
                "\"behavior\":\"${res}.regOrg ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : " +
                "{\\'fieldBehavior\\': \\'DISABLED\\'} \"}},\"self" +
                ".ZCZJ_WH\":{\"props\":{\"value\":\"${res}.registerAmount\",\"behavior\":\"${res}" +
                ".registerAmount ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': " +
                "\\'DISABLED\\'} \"}}}},{\"requestId\":\"jyfwChange\"," +
                "\"action\":\"/form/processFormData\",\"event\":\"${self.SQXM0}:change\"," +
                "\"params\":{\"scriptId\":\"103101936\",\"jyfw\":\"${self.SQXM0}.value\"," +
                "\"jyfwObj\":\"${self.SQXM0}\"},\"type\":\"POST\",\"target\":{\"self" +
                ".ZQQTWXYY\":{\"props\":{\"value\":\"${res}.jyfwStr\"}}}}," +
                "{\"requestId\":\"enterpriseInfo\",\"action\":\"/form/commonAsyncDatashare\"," +
                "\"event\":\"\",\"params\":{\"scriptId\":\"103202012241701915\"," +
                "\"entityCode\":\"enterpriseInfo\",\"entType\":\"E\",\"bizCode\":\"${self" +
                ".TYSHXYDM}.value\",\"key_bizCode\":\"self.TYSHXYDM\",\"desensitizeConfig\":\"self" +
                ".FDDBR=legalPersonName;self.FRSFZ=legalPersonPaperNo\"},\"type\":\"POST\"," +
                "\"target\":{\"self.CLSJ\":{\"props\":{\"value\":\"${res}.estDateNew\"," +
                "\"behavior\":\"${res}.estDateNew ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : " +
                "{\\'fieldBehavior\\': \\'DISABLED\\'} \"}}}}],\"rules\":[]," +
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
                "\"children\":[{\"componentName\":\"AutoColumnsLayout\",\"id\":\"node_kj14f0sr\"," +
                "\"props\":{\"layout\":2,\"fieldId\":\"columns_kj14f0ss\"}," +
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
                "\"id\":\"node_kj14moz0\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kj14moz3\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_FDDBR_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"_vaildation\":[],\"fieldId2\":\"self.FDDBR\"," +
                "\"fieldId\":\"self.FDDBR\",\"label\":\"法人代表\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"]}},{\"componentName\":\"Select\",\"id\":\"self_FRZG_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.FRZG\",\"label\":\"法人资格\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"法人组织\"," +
                "\"value\":\"1\"},{\"text\":\"非法人组织\",\"value\":\"2\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_FRSJH68_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.FRSJH68\",\"label\":\"法人手机号\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Select\",\"id\":\"self_XB1_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.XB1\",\"label\":\"性别\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"男\"," +
                "\"value\":\"0\"},{\"text\":\"女\",\"value\":\"1\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Select\"," +
                "\"id\":\"self_ZJLX220_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"self.ZJLX220\"," +
                "\"label\":\"证件类型\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"居民身份证\"," +
                "\"value\":\"1\",\"defaultChecked\":true},{\"text\":\"户口簿\"," +
                "\"value\":\"2\",\"defaultChecked\":false},{\"text\":\"护照\"," +
                "\"value\":\"3\",\"defaultChecked\":false},{\"text\":\"港澳居民往来内地通行证\"," +
                "\"value\":\"4\",\"defaultChecked\":false},{\"text\":\"台湾居民来往大陆通行证\"," +
                "\"value\":\"5\",\"defaultChecked\":false}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_FRSFZ_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".FRSFZ\",\"label\":\"证件号码\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Select\",\"id\":\"self_XL87_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.XL87\",\"label\":\"学历\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"专科及其以下\"," +
                "\"value\":\"1\"},{\"text\":\"本科\",\"value\":\"2\"},{\"text\":\"硕士\"," +
                "\"value\":\"3\"},{\"text\":\"本科\",\"value\":\"4\"},{\"text\":\"博士\"," +
                "\"value\":\"5\"}]},\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_kj14moz3\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kj14moz6\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_LXRXM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.LXRXM\",\"fieldId\":\"self.LXRXM\"," +
                "\"label\":\"主要负责人（单位联系人）姓名\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_LXRSJHM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.LXRSJHM\",\"fieldId\":\"self.LXRSJHM\"," +
                "\"label\":\"联系人手机号码\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"},{\"type\":\"mobile\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Select\"," +
                "\"id\":\"self_LXRZJLX_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"self.LXRZJLX\"," +
                "\"label\":\"联系人证件类型\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"身份证\"," +
                "\"value\":\"01001\",\"defaultChecked\":true},{\"text\":\"其他\"," +
                "\"value\":\"01002\",\"defaultChecked\":false},{\"text\":\"军官证\"," +
                "\"value\":\"01003\",\"defaultChecked\":false},{\"text\":\"外国人护照\"," +
                "\"value\":\"01004\",\"defaultChecked\":false},{\"text\":\"港澳居民来往内地通行证\"," +
                "\"value\":\"01005\",\"defaultChecked\":false},{\"text\":\"台湾居民来往大陆通行证\"," +
                "\"value\":\"01006\",\"defaultChecked\":false},{\"text\":\"港澳台居民居住证\"," +
                "\"value\":\"01007\",\"defaultChecked\":false}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_LXRSFZ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.LXRSFZ\",\"label\":\"联系人身份证\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_DHHM01_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.DHHM01\",\"label\":\"办公电话\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_CZ69_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.CZ69\"," +
                "\"label\":\"传真\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_kj14fzpk\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kj14fzpn\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_LXDWDH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.LXDWDH\",\"label\":\"单位电话\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Number\",\"id\":\"self_GDZC_view_id\"," +
                "\"props\":{\"_type\":\"long\",\"info\":\"\",\"fieldId\":\"self.GDZC\"," +
                "\"label\":\"固定资产（万元）\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"jsxtype\":\"\",\"delimiter\":\"\",\"roundMode\":\"1\"," +
                "\"align\":\"left\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_kj14fzpi\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kj14fzpl\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_YB_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.YB\",\"label\":\"邮编\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"FloatNumber\",\"id\":\"self_ZCZJ_WH_view_id\"," +
                "\"props\":{\"_type\":\"double\",\"info\":\"\",\"fieldId\":\"self" +
                ".ZCZJ_WH\",\"label\":\"注册资金（万元）\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"jsxtype\":\"\",\"delimiter\":\"\",\"roundMode\":\"1\"," +
                "\"align\":\"left\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_kj14fzpj\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kj14fzpm\"},\"children\":[{\"componentName\":\"Number\"," +
                "\"id\":\"self_FWQ47_view_id\",\"props\":{\"_type\":\"long\"," +
                "\"info\":\"\",\"fieldId\":\"self.FWQ47\",\"label\":\"服务器（个、组）\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"jsxtype\":\"\"," +
                "\"delimiter\":\"\",\"roundMode\":\"1\",\"align\":\"left\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Number\"," +
                "\"id\":\"self_DWRS1_view_id\",\"props\":{\"_type\":\"long\"," +
                "\"info\":\"\",\"fieldId\":\"self.DWRS1\",\"label\":\"单位人数（人）\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"jsxtype\":\"\"," +
                "\"delimiter\":\"\",\"roundMode\":\"1\",\"align\":\"left\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_kj18gu27\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kj18gu2b\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_YXZH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.YXZH\",\"label\":\"E_mail\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_QYTXDZ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.QYTXDZ\",\"fieldId\":\"self.QYTXDZ\"," +
                "\"label\":\"注册地址\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_BZ64_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.BZ64\"," +
                "\"label\":\"备注\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}]}," +
                "{\"componentName\":\"AutoColumnsLayout\",\"id\":\"node_kj16gkd4\"," +
                "\"props\":{\"layout\":2,\"fieldId\":\"columns_kj16gkd8\"}," +
                "\"children\":[{\"componentName\":\"Select\",\"id\":\"self_SSXZQH_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.SSXZQH\",\"label\":\"所属行政区划\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Date\",\"id\":\"self_CLSJ_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"date\",\"info\":\"\"," +
                "\"fieldId\":\"self.CLSJ\",\"label\":\"企业成立时间\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"format\":\"yyyy-MM-dd\",\"clearUnusedTimestamp\":\"false\"," +
                "\"disabledDate\":{\"type\":\"NONE\"},\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Select\"," +
                "\"id\":\"self_ZSGS_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"self.ZSGS\"," +
                "\"label\":\"住所归属\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"自有\"," +
                "\"value\":\"1\"},{\"text\":\"租赁\",\"value\":\"2\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"MultiSelect\"," +
                "\"id\":\"self_SQXM0_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"multiEnum\",\"info\":\"\",\"fieldId\":\"self.SQXM0\"," +
                "\"label\":\"申请项目\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"dataSource\":{\"type\":\"OPTIONS\"," +
                "\"options\":[{\"text\":\"网络音乐\",\"value\":\"1\"}," +
                "{\"text\":\"网络演出剧（节）目\",\"value\":\"2\"},{\"text\":\"网络表演\"," +
                "\"value\":\"3\"},{\"text\":\"网络艺术品\",\"value\":\"4\"}," +
                "{\"text\":\"网络动漫\",\"value\":\"5\"},{\"text\":\"展览、比赛活动\"," +
                "\"value\":\"6\"}]},\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]},{\"componentName\":\"BigTable\"," +
                "\"id\":\"self_WZXX_view_id\",\"props\":{\"_type\":\"bigTable\"," +
                "\"layout\":\"VERTICAL\",\"gridLayout\":\"[]\",\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"buttonName\":\"新增一条记录\",\"showIndex\":true," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"fieldId\":\"self.WZXX\",\"label\":\"网站信息\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
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
                "\"children\":[{\"componentName\":\"Input\",\"id\":\"WZMC73_self_WZXX_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"WZMC73\"," +
                "\"label\":\"中文网站名称\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"WZYM_self_WZXX_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"WZYM\",\"label\":\"英文域名\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"WZIPDZ_self_WZXX_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"WZIPDZ\",\"label\":\"IP地址\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"BigTable\"," +
                "\"id\":\"self_GQJG_view_id\",\"props\":{\"_type\":\"bigTable\"," +
                "\"layout\":\"VERTICAL\",\"gridLayout\":\"[]\",\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"buttonName\":\"新增一条记录\",\"showIndex\":true," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"fieldId\":\"self.GQJG\",\"label\":\"股权结构\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
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
                "\"id\":\"HHRHZGDXM_CZ_self_GQJG_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"HHRHZGDXM_CZ\",\"label\":\"股东（法人名称、自然人姓名）\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"FloatNumber\"," +
                "\"id\":\"CZE_WY_self_GQJG_view_id\",\"props\":{\"info\":\"\"," +
                "\"_type\":\"double\",\"fieldId\":\"CZE_WY\",\"label\":\"出资额（万元）\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"jsxtype\":\"\"," +
                "\"delimiter\":\"\",\"roundMode\":\"1\",\"align\":\"left\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[{\"type\":\"required\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"YYZZHM_self_GQJG_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"YYZZHM\"," +
                "\"label\":\"法人工商执照号、自然人身份证号\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"GroupLayout\"," +
                "\"id\":\"node_kj14xxbp\",\"props\":{\"fieldId\":\"group_kj14xxcm\"," +
                "\"fieldId$$2\":\"group_kj14xxcm\",\"title\":\"营业信息\",\"subTitle\":\"\"," +
                "\"description\":\"\",\"visible\":true,\"hideOnNav\":false}," +
                "\"children\":[{\"componentName\":\"AutoColumnsLayout\",\"id\":\"node_kj151h7n\"," +
                "\"props\":{\"layout\":2,\"fieldId\":\"columns_kj151h7q\"}," +
                "\"children\":[{\"componentName\":\"Select\",\"id\":\"self_ZZZG_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.ZZZG\",\"label\":\"组织资格\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"已有\"," +
                "\"value\":\"1\"},{\"text\":\"名称预先核准\",\"value\":\"2\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Select\"," +
                "\"id\":\"self_ZZXS34_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"self.ZZXS34\"," +
                "\"label\":\"组织形式\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"企业单位\"," +
                "\"value\":\"1\"},{\"text\":\"个体工商\",\"value\":\"2\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"FloatNumber\"," +
                "\"id\":\"self_JYMJ77_view_id\",\"props\":{\"info\":\"\"," +
                "\"_type\":\"double\",\"fieldId\":\"self.JYMJ77\",\"label\":\"经营面积（平方米）\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"jsxtype\":\"\"," +
                "\"delimiter\":\"\",\"roundMode\":\"1\",\"align\":\"left\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_ZZLX63_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.ZZLX63\",\"label\":\"证照类型\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[],\"_extension\":[{\"key\":\"setDefaultValue\"," +
                "\"param\":\"营业执照\"}]}},{\"componentName\":\"CascadeDate\"," +
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
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_GSDJJG_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.GSDJJG\",\"label\":\"工商登记机关\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_JJLX33_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.JJLX33\",\"label\":\"经济类型\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Select\",\"id\":\"self_HSXS_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.HSXS\",\"label\":\"核算形式\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"独立\"," +
                "\"value\":\"1\"},{\"text\":\"非独立\",\"value\":\"2\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Select\"," +
                "\"id\":\"self_ZBGC_XL_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"self.ZBGC_XL\"," +
                "\"label\":\"资本构成\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"台湾独资\"," +
                "\"value\":\"1\"},{\"text\":\"内资\",\"value\":\"2\"}," +
                "{\"text\":\"港澳独资\",\"value\":\"3\"},{\"text\":\"港澳合资\"," +
                "\"value\":\"4\"},{\"text\":\"港澳合作\",\"value\":\"5\"}," +
                "{\"text\":\"台资合作\",\"value\":\"6\"},{\"text\":\"外商合资\"," +
                "\"value\":\"7\"},{\"text\":\"外商合作\",\"value\":\"8\"}," +
                "{\"text\":\"外商独资\",\"value\":\"9\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Select\",\"id\":\"self_BZ99_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.BZ99\",\"label\":\"币种\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"人民币\"," +
                "\"value\":\"1\"},{\"text\":\"港元\",\"value\":\"2\"},{\"text\":\"美元\"," +
                "\"value\":\"3\"},{\"text\":\"欧元\",\"value\":\"4\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]}]},{\"componentName\":\"Input\"," +
                "\"id\":\"self_ZQQTWXYY_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.ZQQTWXYY\",\"label\":\"质权其他无效原因\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}]},\"params\":{}}]}';";
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
