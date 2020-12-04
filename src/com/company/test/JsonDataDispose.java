package com.company.test;

public class JsonDataDispose {
    public static void main(String[] args) {
        String dataStr = "{\"matterPropertyUpdateTimeDesc\":\"事项属性本身的更新时间，key为属性id，value为更新时间\"," +
                "\"matterPropertyUpdateTime\":{\"self.FRSFZ\":\"2020-08-24 16:38:28\",\"self" +
                ".FDDBR\":\"2020-08-24 16:38:30\",\"ZYCYRYDJ#NAME\":\"2020-11-27 10:12:48\",\"self" +
                ".LXRDH\":\"2020-11-27 10:55:52\",\"self.FZR\":\"2020-11-27 11:03:29\",\"self" +
                ".TYSHXYDM\":\"2020-08-24 16:38:30\",\"ZYCYRYDJ#YCJJZGZSH\":\"2020-11-27 10:13:52\"," +
                "\"self.JJLX_WH\":\"2020-11-26 15:49:00\",\"self.ZCZJ_WH\":\"2020-11-26 17:49:19\"," +
                "\"self.ZYFZRDH\":\"2020-11-27 11:03:29\",\"self.GSDJJG\":\"2020-11-26 16:14:21\"," +
                "\"self.SSHM\":\"2020-11-27 09:44:52\",\"ZYCYRYDJ#XB\":\"2020-11-27 10:13:03\"," +
                "\"self.QYTXDZ\":\"2020-11-26 15:49:00\",\"self.SBDW\":\"2020-08-24 16:38:28\"," +
                "\"self.LXRXM\":\"2020-11-27 10:55:52\",\"self.ZYCYRYDJ\":\"2020-11-27 10:15:38\"," +
                "\"ZYCYRYDJ#SFZH8\":\"2020-11-27 10:13:40\",\"self.LXRSFZ\":\"2020-11-27 11:03:29\"," +
                "\"ZYCYRYDJ#XZZW88\":\"2020-11-27 10:14:00\",\"self.YYQX43\":\"2020-11-26 " +
                "16:33:35\"},\"cardPropertyFeature\":{\"self" +
                ".ZYCYRYDJ\":{\"XZZW88\":\"isUniqueIndex:false\"}},\"mergedTemplateCode\":{}}," +
                "\"schemaType\":\"superform\",\"schemaVersion\":\"1.0\"," +
                "\"request\":[{\"requestId\":\"enterpriseInfo\"," +
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
                "\"}},\"self.JJLX_WH\":{\"props\":{\"value\":\"${res}.companyType\"," +
                "\"behavior\":\"${res}.companyType ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : " +
                "{\\'fieldBehavior\\': \\'DISABLED\\'} \"}},\"self" +
                ".GSDJJG\":{\"props\":{\"value\":\"${res}.regOrg\",\"behavior\":\"${res}.regOrg " +
                "==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': \\'DISABLED\\'} \"}}," +
                "\"self.ZCZJ_WH\":{\"props\":{\"value\":\"${res}.registerAmount\"," +
                "\"behavior\":\"${res}.registerAmount ==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : " +
                "{\\'fieldBehavior\\': \\'DISABLED\\'} \"}},\"self" +
                ".JYFW\":{\"props\":{\"value\":\"${res}.opScope\",\"behavior\":\"${res}.opScope " +
                "==\\'\\' ? {\\'fieldBehavior\\': \\'NORMAL\\'} : {\\'fieldBehavior\\': \\'DISABLED\\'} \"}}}}]," +
                "\"rules\":[],\"pages\":[{\"id\":\"PAGE_101100720\"," +
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
                "\"info\":\"\",\"fieldId\":\"self.ZCZJ_WH\",\"label\":\"注册资金(单位：万元)\"," +
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
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_QYTXDZ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.QYTXDZ\",\"fieldId\":\"self.QYTXDZ\"," +
                "\"label\":\"住所\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
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
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"]}},{\"componentName\":\"Input\",\"id\":\"self_FRSFZ_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId2\":\"self" +
                ".FRSFZ\",\"fieldId\":\"self.FRSFZ\",\"label\":\"法人代表身份证\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"},{\"type\":\"idCard\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_SSHM_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.SSHM\"," +
                "\"label\":\"法人代表手机\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"mobile\",\"param\":\"^[1]([3-9])[0-9]{9}$\"," +
                "\"message\":\"手机号码不符合规则\"},{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_khzoibyb\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_khzoibyf\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_FZR_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.FZR\",\"label\":\"主要负责人姓名\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_ZYFZRDH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.ZYFZRDH\",\"label\":\"主要负责人手机\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"},{\"type\":\"mobile\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]},{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_khym1td4\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_khym1td8\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_LXRXM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId2\":\"self.LXRXM\",\"fieldId\":\"self.LXRXM\"," +
                "\"label\":\"联系人姓名\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
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
                "\"message\":\"当前字段不能为空\"},{\"type\":\"idCard\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_LXRDH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.LXRDH\",\"label\":\"联系人手机\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"},{\"type\":\"mobile\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}}]}]},{\"componentName\":\"BigTable\"," +
                "\"id\":\"self_ZYCYRYDJ_view_id\",\"props\":{\"_type\":\"bigTable\"," +
                "\"layout\":\"VERTICAL\",\"gridLayout\":\"[]\",\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"buttonName\":\"新增一条记录\",\"showIndex\":true," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"fieldId\":\"self.ZYCYRYDJ\"," +
                "\"label\":\"主要从业人员登记\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"readonly\":false,\"visible\":true," +
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
                "\"id\":\"NAME_self_ZYCYRYDJ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"NAME\",\"label\":\"姓名\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[{\"type\":\"required\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Radio\",\"id\":\"XB_self_ZYCYRYDJ_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"XB\",\"label\":\"性别\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"displayStyle\":\"horizontal\"," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"男\"," +
                "\"value\":\"1\"},{\"text\":\"女\",\"value\":\"2\"}]}," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"XZZW88_self_ZYCYRYDJ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"XZZW88\",\"label\":\"职务\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"SFZH8_self_ZYCYRYDJ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"SFZH8\",\"label\":\"身份证号\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"},{\"type\":\"idCard\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"YCJJZGZSH_self_ZYCYRYDJ_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"YCJJZGZSH\"," +
                "\"label\":\"演出经纪资格证书号\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]}]},\"params\":{}}]}";
        dataStr = dataStr.replaceAll("\",\"label\":\"","&&&\"");
        dataStr = dataStr.replaceAll("\"fieldId\":\"","&&&");
        dataStr = dataStr.replaceAll(",\"showLabel\"","&&&");
        String [] s = dataStr.split("&&&");
        String newData = "";
        for (int i = 0; i < s.length;i++) {
            if (s[i].length()<100){
                newData += s[i];
            }
        }
        System.out.println(newData);
        String [] ns = newData.split("\"");
        String unique = "";
        String name = "";
        for (int i = 0;i < ns.length; i++){
            if (i%2==0){
                unique +="\n" + ns[i];
            }else {
                name += "\n" + ns[i];
            }
        }
        System.out.println(unique);
        System.out.println(name);
    }
}
