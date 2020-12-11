package com.company.threadDemo;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str1 = "'{\"_form\":{\"matterPropertyUpdateTimeDesc\":\"事项属性本身的更新时间，key为属性id，value为更新时间\"," +
                "\"matterPropertyUpdateTime\":{\"self.SJRLXFS\":\"2020-10-16 17:51:46\",\"self" +
                ".XZSBDD\":\"2020-11-05 18:07:28\",\"self.WJWJBR\":\"2020-11-09 09:22:12\",\"self" +
                ".SJRXM\":\"2020-10-16 17:51:46\",\"self.WTR\":\"2020-10-16 17:51:46\",\"self" +
                ".SZQY86\":\"2020-10-27 15:50:48\",\"self.SQDWMC\":\"2020-10-16 17:51:46\",\"self" +
                ".SQRXM40\":\"2020-10-16 17:51:46\",\"self.XXDZ\":\"2020-10-16 17:51:46\",\"self" +
                ".JBRYDDH\":\"2020-11-06 16:08:32\",\"self.SYCSDSDX\":\"2020-10-16 17:51:46\",\"self" +
                ".BGDZ\":\"2020-10-16 17:51:46\",\"self.Mailing_add\":\"2020-10-16 17:51:46\",\"self" +
                ".YXZH\":\"2020-10-16 17:51:46\",\"self.XB3\":\"2020-11-05 18:07:28\",\"self" +
                ".BZ\":\"2020-10-16 17:51:47\",\"self.SXDAMC\":\"2020-10-16 17:51:47\",\"self" +
                ".DAHQFS\":\"2020-10-16 17:51:46\",\"self.YSYCDGX\":\"2020-11-05 18:07:28\",\"self" +
                ".ZJHM\":\"2020-10-20 10:19:18\",\"self.SFWBRBL\":\"2020-11-05 18:07:28\",\"self" +
                ".XMMC17\":\"2020-10-16 17:51:46\",\"self.SZJZZCS\":\"2020-10-16 17:51:47\",\"self" +
                ".GHXKZ\":\"2020-10-16 17:51:47\",\"self.TYSHXYDM\":\"2020-10-16 17:51:47\",\"self" +
                ".SSHM\":\"2020-10-16 17:51:46\",\"self.KMMC\":\"2020-10-16 17:51:46\",\"self" +
                ".JSDWMC\":\"2020-10-16 17:51:46\",\"self.SMHWTRSFZHYXZJHM\":\"2020-10-16 17:51:46\"," +
                "\"self.LYMD90\":\"2020-10-16 17:51:46\",\"self.WTRLXDH\":\"2020-10-16 17:51:47\"," +
                "\"self.YMMC\":\"2020-11-05 18:07:28\",\"self.CDBLDX\":\"2020-11-05 18:07:28\"}," +
                "\"cardPropertyFeature\":{},\"propertyTemplate\":{},\"mergedTemplateCode\":{}}," +
                "\"schemaType\":\"superform\",\"schemaVersion\":\"1.0\"," +
                "\"rules\":[{\"condition\":\"${self.DAHQFS}.value.value == \\'zq\\'\"," +
                "\"event\":\"${self.DAHQFS}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"visible\":true}},\"self" +
                ".YXZH\":{\"props\":{\"visible\":false,\"validation\":[]}},\"self" +
                ".Mailing_add\":{\"props\":{\"visible\":false,\"validation\":[]}},\"self" +
                ".SJRLXFS\":{\"props\":{\"visible\":false,\"validation\":[]}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'scq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"杭州市城建档案馆：杭州市下城区杨六堡路8号一楼，窗口电话：0571-85379545\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'xcq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"杭州市城建档案馆：杭州市下城区杨六堡路8号一楼，窗口电话：0571-85379545\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'jgq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"杭州市城建档案馆：杭州市下城区杨六堡路8号一楼，窗口电话：0571-85379545\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'gsq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"杭州市城建档案馆：杭州市下城区杨六堡路8号一楼，窗口电话：0571-85379545\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'xhq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"杭州市城建档案馆：杭州市下城区杨六堡路8号一楼，窗口电话：0571-85379545\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'bjq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"杭州高新区（滨江）城建档案馆：滨江区官河路7号，窗口电话：0571-87795846\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'yhq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"余杭区城建档案馆：余杭区藕花洲大街西段160号，窗口电话：0571-86265910\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'xsq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"萧山区城建档案馆：萧山区城厢街道育才路517号，窗口电话：0571-82797696\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'fyq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"富阳区城建档案馆：富阳区富春街道天河路108号，窗口电话：0571-63139507\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'laq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"临安区建设档案馆：临安区横潭路111号，窗口电话：0571-63723144\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'qtxq\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"杭州市城建档案馆：杭州市下城区杨六堡路8号一楼，窗口电话：0571-85379545\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'tlx\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"桐庐县城建档案馆：桐庐县城南街道迎春南路333号，窗口电话：0571-64217829\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'jds\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"建德市城建档案馆：建德市新安江街道叶家依城苑1号楼，窗口电话：0571-64719638\"}}}}," +
                "{\"condition\":\"${self.SZQY86}.value.value == \\'cax\\'\",\"event\":\"${self" +
                ".SZQY86}:change\",\"target\":{\"self" +
                ".BGDZ\":{\"props\":{\"value\":\"淳安县城建档案中心：淳安县千岛湖镇环湖北路655号，窗口电话：0571-65067130\"}}}}," +
                "{\"condition\":\"${self.DAHQFS}.value.value == \\'ems\\'\",\"event\":\"${self" +
                ".DAHQFS}:change\",\"target\":{\"self.SJRLXFS\":{\"props\":{\"visible\":true}}," +
                "\"self.Mailing_add\":{\"props\":{\"visible\":true}},\"self" +
                ".BGDZ\":{\"props\":{\"visible\":false}}}},{\"condition\":\"${self.DAHQFS}.value" +
                ".value == \\'email\\'\",\"event\":\"${self.DAHQFS}:change\",\"target\":{\"self" +
                ".SJRXM\":{\"props\":{\"visible\":false," +
                "\"validation\":[{\"type\":\"required\"}]}},\"self" +
                ".Mailing_add\":{\"props\":{\"visible\":false}},\"self" +
                ".SJRLXFS\":{\"props\":{\"visible\":false}},\"self" +
                ".BGDZ\":{\"props\":{\"visible\":false}}}},{\"condition\":\"${self.DAHQFS}.value" +
                ".value == \\'ems\\'\",\"event\":\"${self.DAHQFS}:change\",\"target\":{\"self" +
                ".SJRXM\":{\"props\":{\"visible\":true," +
                "\"validation\":[{\"type\":\"required\"}]}},\"self" +
                ".YXZH\":{\"props\":{\"visible\":false}},\"self" +
                ".Mailing_add\":{\"props\":{\"visible\":true," +
                "\"validation\":[{\"type\":\"required\"}]}},\"self" +
                ".SJRLXFS\":{\"props\":{\"visible\":true," +
                "\"validation\":[{\"type\":\"required\"}]}},\"self" +
                ".BGDZ\":{\"props\":{\"visible\":false}}}}]," +
                "\"request\":[{\"requestId\":\"getApasInfoUnid\"," +
                "\"action\":\"/form/commonAsyncDatashare\"," +
                "\"params\":{\"entityCode\":\"personnelFileQuery\",\"bizCode\":\"身份证\"," +
                "\"key_bizCode\":\"${self.ZJHM}.value\"},\"type\":\"POST\",\"target\":{\"self" +
                ".SSHM\":{\"props\":{\"value\":\"${res}.SSHM\"}},\"self" +
                ".TYSHXYDM\":{\"props\":{\"value\":\"${res}.TYSHXYDM\"}},\"self" +
                ".SQDWMC\":{\"props\":{\"value\":\"${res}.SQDWMC\"}},\"self" +
                ".ZJHM\":{\"props\":{\"value\":\"${res}.ZJHM\"}},\"self" +
                ".SQRXM40\":{\"props\":{\"value\":\"${res}.SQRXM40\"}},\"self" +
                ".SJRXM\":{\"props\":{\"value\":\"${res}.SJRXM\"}},\"self" +
                ".SJRLXFS\":{\"props\":{\"value\":\"${res}.SJRLXFS\"}}}}," +
                "{\"requestId\":\"idCardLicense\",\"action\":\"/form/commonAsyncDatashare\"," +
                "\"params\":{\"entityCode\":\"idCardLicense\",\"userName\":\"${self.SQRXM40}" +
                ".value\",\"key_userName\":\"self.SQRXM40\",\"bizCode\":\"${self.ZJHM}.value\"," +
                "\"key_bizCode\":\"self.ZJHM\"},\"type\":\"POST\",\"ignoreError\":true," +
                "\"target\":{\"self.XB3\":{\"props\":{\"value\":\"${res}.sex\"}}}}," +
                "{\"requestId\":\"xialaChange\",\"action\":\"/form/processFormData\"," +
                "\"event\":\"${self.SXDAMC}:change\",\"params\":{\"scriptId\":\"1031001030\"," +
                "\"xl\":\"${self.SXDAMC}.value\",\"xlobj\":\"${self.SXDAMC}\"}," +
                "\"type\":\"POST\",\"target\":{\"self.YMMC\":{\"props\":{\"value\":\"${res}" +
                ".jyfwStr\"}}}}],\"pages\":[{\"id\":\"PAGE_101304535\"," +
                "\"layout\":{\"componentName\":\"Root\",\"id\":\"root\"," +
                "\"props\":{\"flexible\":false,\"mode\":\"normal\",\"containerStyle\":{}," +
                "\"pageStyle\":{\"backgroundColor\":\"#f2f2f2\"}}," +
                "\"children\":[{\"componentName\":\"GroupLayout\",\"id\":\"node_jzdiukfw\"," +
                "\"props\":{\"fieldId\":\"group_jzdkd9yz\",\"fieldId$$2\":\"group_jzdkd9yz\"," +
                "\"title\":{\"type\":\"i18n\",\"use\":null,\"en_US\":\"Group\"," +
                "\"zh_CN\":\"申请人信息\"},\"subTitle\":{\"type\":\"i18n\",\"use\":null," +
                "\"en_US\":null,\"zh_CN\":\"\"},\"description\":{\"type\":\"i18n\"," +
                "\"use\":null,\"en_US\":null,\"zh_CN\":\"\"},\"visible\":true," +
                "\"hideOnNav\":false},\"children\":[{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_kdtwbh21\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kdtwbh24\"},\"children\":[{\"componentName\":\"Input\"," +
                "\"id\":\"self_SQRXM40_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.SQRXM40\",\"label\":\"申请人姓名\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":true,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_ZJHM_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"_vaildation\":[]," +
                "\"fieldId\":\"self.ZJHM\",\"label\":\"证件号码\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":true,\"visible\":true," +
                "\"inputType\":false,\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"},{\"type\":\"idCard\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"]}},{\"componentName\":\"Input\",\"id\":\"self_XB3_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.XB3\"," +
                "\"label\":\"性别\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_SSHM_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.SSHM\"," +
                "\"label\":\"手机号码\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":true,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"mobile\",\"param\":\"^[1]([3-9])[0-9]{9}$\"," +
                "\"message\":\"手机号码不符合规则\"},{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_SQDWMC_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.SQDWMC\",\"label\":\"申请单位名称\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":true,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_TYSHXYDM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.TYSHXYDM\",\"label\":\"统一社会信用代码\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":true,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_WJWJBR_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.WJWJBR\",\"label\":\"经办人姓名\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_JBRYDDH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.JBRYDDH\",\"label\":\"经办人移动电话\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"},{\"type\":\"mobile\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_WTR_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.WTR\"," +
                "\"label\":\"委托人/单位名称\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_SMHWTRSFZHYXZJHM_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.SMHWTRSFZHYXZJHM\",\"label\":\"委托人身份证\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"},{\"type\":\"idCard\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_WTRLXDH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.WTRLXDH\",\"label\":\"委托人联系电话\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"},{\"type\":\"mobile\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_YXZH_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.YXZH\",\"label\":\"电子邮箱地址\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\"},{\"type\":\"email\"}]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]," +
                "\"_extension\":[{\"key\":\"setVisible\"}]}}]}]}," +
                "{\"componentName\":\"GroupLayout\",\"id\":\"node_kdr63bc4\"," +
                "\"props\":{\"fieldId\":\"group_kdr63bco\",\"fieldId$$2\":\"group_kdr63bco\"," +
                "\"title\":{\"type\":\"i18n\",\"use\":null,\"en_US\":null," +
                "\"zh_CN\":\"查询信息\"},\"subTitle\":{\"type\":\"i18n\",\"use\":null," +
                "\"en_US\":null,\"zh_CN\":\"\"},\"description\":{\"type\":\"i18n\"," +
                "\"use\":null,\"en_US\":null,\"zh_CN\":\"\"},\"visible\":true," +
                "\"hideOnNav\":false},\"children\":[{\"componentName\":\"AutoColumnsLayout\"," +
                "\"id\":\"node_kdtx383t\",\"props\":{\"layout\":2," +
                "\"fieldId\":\"columns_kdtx383w\"},\"children\":[{\"componentName\":\"Select\"," +
                "\"id\":\"self_LYMD90_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"self.LYMD90\"," +
                "\"label\":\"利用目的\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"产权登记\\t\"," +
                "\"value\":\"cqdj\"},{\"text\":\"设计参考\\t\",\"value\":\"sjck\"}," +
                "{\"text\":\"装修维修\\t\",\"value\":\"zxwx\"},{\"text\":\"解决纠纷\\t\"," +
                "\"value\":\"jjjf\"},{\"text\":\"学术研究\",\"value\":\"xsyj\"}," +
                "{\"text\":\"项目审批\",\"value\":\"xmsp\"},{\"text\":\"违法调查取证\\t\"," +
                "\"value\":\"dcqz\"},{\"text\":\"宣传工作\",\"value\":\"xcgz\"}," +
                "{\"text\":\"存档\\t\",\"value\":\"cd\"},{\"text\":\"其他\"," +
                "\"value\":\"qt\"}]},\"validation\":[{\"type\":\"required\"," +
                "\"param\":\"\",\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_XMMC17_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.XMMC17\",\"label\":\"项目名称\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入对应项目名称\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_JSDWMC_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".JSDWMC\",\"label\":\"建设单位名称\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_GHXKZ_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".GHXKZ\",\"label\":\"规划许可证号\",\"showLabel\":true," +
                "\"placeholder\":\"请输入建设工程规划许可证号码\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"inputType\":false,\"validation\":[],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"AddressSelect\"," +
                "\"id\":\"self_XZSBDD_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"address\",\"info\":\"\",\"fieldId\":\"self.XZSBDD\"," +
                "\"label\":\"所属区域\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"addressType\":\"DEFAULT\"," +
                "\"areas\":{\"type\":\"CUSTOM\",\"provinces\":[\"330000\"]}," +
                "\"includeCitySelf\":false,\"showSearch\":false,\"columns\":[\"1\",\"2\"," +
                "\"3\"],\"asyncOptions\":true,\"dataSource\":{}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Number\"," +
                "\"id\":\"self_SZJZZCS_view_id\",\"props\":{\"_type\":\"long\"," +
                "\"info\":\"\",\"fieldId\":\"self.SZJZZCS\",\"label\":\"所在建筑总层数\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"jsxtype\":\"\"," +
                "\"delimiter\":\"\",\"roundMode\":\"1\",\"align\":\"left\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"validation\":[],\"visibility\":[\"PC\"," +
                "\"MOBILE\"],\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_XXDZ_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.XXDZ\",\"label\":\"建筑物具体地址\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_SYCSDSDX_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.SYCSDSDX\",\"label\":\"所在层号\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Checkbox\",\"id\":\"self_SXDAMC_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"multiEnum\",\"info\":\"\"," +
                "\"fieldId\":\"self.SXDAMC\",\"label\":\"所需档案名称\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":true,\"displayStyle\":\"horizontal\"," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"建筑竣工图\\t\"," +
                "\"value\":\"jzjgt\"},{\"text\":\"结构竣工图\\t\",\"value\":\"jgjgt\"}," +
                "{\"text\":\"给排水竣工图\\t\",\"value\":\"jpsjgt\"},{\"text\":\"电气竣工图\\t\"," +
                "\"value\":\"dqjgt\"},{\"text\":\"其他\\t\",\"value\":\"qt\"}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_KMMC_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.KMMC\"," +
                "\"label\":\" 其他档案名称\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":true,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Select\",\"id\":\"self_SZQY86_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.SZQY86\",\"label\":\"所在区\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":false,\"hasClear\":false,\"showSearch\":false," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"上城区\"," +
                "\"value\":\"scq\",\"defaultChecked\":false},{\"text\":\"下城区\\t\"," +
                "\"value\":\"xcq\",\"defaultChecked\":false},{\"text\":\"江干区\"," +
                "\"value\":\"jgq\",\"defaultChecked\":false},{\"text\":\"拱墅区\"," +
                "\"value\":\"gsq\",\"defaultChecked\":false},{\"text\":\"西湖区\"," +
                "\"value\":\"xhq\",\"defaultChecked\":false},{\"text\":\"滨江区\"," +
                "\"value\":\"bjq\",\"defaultChecked\":false},{\"text\":\"余杭区\"," +
                "\"value\":\"yhq\",\"defaultChecked\":false},{\"text\":\"萧山区\"," +
                "\"value\":\"xsq\",\"defaultChecked\":false},{\"text\":\"富阳区\"," +
                "\"value\":\"fyq\",\"defaultChecked\":false},{\"text\":\"临安区\\t\"," +
                "\"value\":\"laq\",\"defaultChecked\":false},{\"text\":\"钱塘新区\\t\"," +
                "\"value\":\"qtxq\",\"defaultChecked\":false},{\"text\":\"桐庐县\\t\"," +
                "\"value\":\"tlx\",\"defaultChecked\":false},{\"text\":\"建德市\\t\"," +
                "\"value\":\"jds\",\"defaultChecked\":false},{\"text\":\"淳安县\\t\"," +
                "\"value\":\"cax\",\"defaultChecked\":false}]},\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Textarea\",\"id\":\"self_BZ_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"string\",\"info\":\"\"," +
                "\"fieldId\":\"self.BZ\",\"label\":\"补充说明\",\"showLabel\":true," +
                "\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"maxHeight\":120," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"disabled\":false,\"visible\":true,\"autoTrim\":false," +
                "\"showCounter\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}}]}]},{\"componentName\":\"GroupLayout\"," +
                "\"id\":\"node_kdr642vl\",\"props\":{\"fieldId\":\"group_kdr642w8\"," +
                "\"fieldId$$2\":\"group_kdr642w8\",\"title\":{\"type\":\"i18n\",\"use\":null," +
                "\"en_US\":null,\"zh_CN\":\"查档结果获取\"},\"subTitle\":{\"type\":\"i18n\"," +
                "\"use\":null,\"en_US\":null,\"zh_CN\":\"\"}," +
                "\"description\":{\"type\":\"i18n\",\"use\":null,\"en_US\":null," +
                "\"zh_CN\":\"\"},\"visible\":false,\"hideOnNav\":true}," +
                "\"children\":[{\"componentName\":\"Radio\",\"id\":\"self_DAHQFS_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.DAHQFS\",\"label\":\"档案获取方式\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":false,\"displayStyle\":\"horizontal\"," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"自取\"," +
                "\"value\":\"zq\",\"defaultChecked\":false},{\"text\":\"电子邮件\"," +
                "\"value\":\"email\",\"defaultChecked\":true},{\"text\":\"EMS快递到付(查档量大邮寄光盘)\"," +
                "\"value\":\"ems\",\"defaultChecked\":false}]}," +
                "\"validation\":[{\"type\":\"required\",\"param\":\"\"," +
                "\"message\":\"当前字段不能为空\"}],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[],\"_extension\":[{\"key\":\"setVisible\"}]}}," +
                "{\"componentName\":\"Input\",\"id\":\"self_SJRXM_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self" +
                ".SJRXM\",\"label\":\"收件人姓名\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":true,\"visible\":false,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]," +
                "\"_extension\":[{\"key\":\"setVisible\"}]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_Mailing_add_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.Mailing_add\",\"label\":\"邮寄地址\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":false,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]," +
                "\"_extension\":[{\"key\":\"setVisible\"}]}},{\"componentName\":\"Input\"," +
                "\"id\":\"self_SJRLXFS_view_id\",\"props\":{\"_type\":\"string\"," +
                "\"info\":\"\",\"fieldId\":\"self.SJRLXFS\",\"label\":\"收件人联系方式\"," +
                "\"showLabel\":true,\"placeholder\":\"请输入\",\"tips\":\"\"," +
                "\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":false,\"inputType\":false,\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]," +
                "\"_extension\":[{\"key\":\"setVisible\"}]}},{\"componentName\":\"Textarea\"," +
                "\"id\":\"self_BGDZ_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.BGDZ\"," +
                "\"label\":\"档案自取地址\",\"showLabel\":true,\"placeholder\":\"\"," +
                "\"tips\":\"\",\"style\":{\"maxWidth\":\"446px\"},\"maxHeight\":120," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":true,\"disabled\":false,\"visible\":false,\"autoTrim\":false," +
                "\"showCounter\":false,\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[],\"_extension\":[{\"key\":\"setVisible\"}]}}]}," +
                "{\"componentName\":\"Radio\",\"id\":\"self_CDBLDX_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.CDBLDX\",\"label\":\"查档办理对象\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":false,\"displayStyle\":\"horizontal\"," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"个人\"," +
                "\"value\":\"1\"},{\"text\":\"单位\",\"value\":\"2\"}]},\"validation\":[]," +
                "\"visibility\":[\"PC\",\"MOBILE\"],\"_validation\":[]}}," +
                "{\"componentName\":\"Radio\",\"id\":\"self_SFWBRBL_view_id\"," +
                "\"props\":{\"group\":\"\",\"_type\":\"enum\",\"info\":\"\"," +
                "\"fieldId\":\"self.SFWBRBL\",\"label\":\"是否为本人办理\",\"showLabel\":true," +
                "\"placeholder\":\"请选择\",\"tips\":\"\",\"tipsType\":\"TILE\"," +
                "\"style\":{\"maxWidth\":\"446px\"},\"layout\":\"HORIZONTAL\"," +
                "\"size\":\"large\",\"gridLayout\":\"[]\",\"readonly\":false," +
                "\"visible\":false,\"displayStyle\":\"horizontal\"," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"本人办理\"," +
                "\"value\":\"1\"},{\"text\":\"代人办理\",\"value\":\"2\"}," +
                "{\"text\":\"本单位办理\",\"value\":\"3\"},{\"text\":\"其他单位委托办理\"," +
                "\"value\":\"4\"}]},\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Radio\"," +
                "\"id\":\"self_YSYCDGX_view_id\",\"props\":{\"group\":\"\"," +
                "\"_type\":\"enum\",\"info\":\"\",\"fieldId\":\"self.YSYCDGX\"," +
                "\"label\":\"与所要查档关系\",\"showLabel\":true,\"placeholder\":\"请选择\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":false,\"displayStyle\":\"horizontal\"," +
                "\"dataSource\":{\"type\":\"OPTIONS\",\"options\":[{\"text\":\"产权人\"," +
                "\"value\":\"1\"},{\"text\":\"使用人/租赁人\",\"value\":\"2\"}," +
                "{\"text\":\"学术研究\",\"value\":\"3\"},{\"text\":\"其他情形\"," +
                "\"value\":\"4\"},{\"text\":\"参建五方主体\",\"value\":\"5\"}," +
                "{\"text\":\"政府职能部门（档案形成者）\",\"value\":\"6\"},{\"text\":\"物业企业\"," +
                "\"value\":\"7\"},{\"text\":\"业委会\",\"value\":\"8\"}," +
                "{\"text\":\"国家机关\",\"value\":\"9\"},{\"text\":\"项目参考\"," +
                "\"value\":\"10\"}]},\"validation\":[],\"visibility\":[\"PC\",\"MOBILE\"]," +
                "\"_validation\":[]}},{\"componentName\":\"Input\",\"id\":\"self_YMMC_view_id\"," +
                "\"props\":{\"_type\":\"string\",\"info\":\"\",\"fieldId\":\"self.YMMC\"," +
                "\"label\":\"所需档案名称\",\"showLabel\":true,\"placeholder\":\"请输入\"," +
                "\"tips\":\"\",\"tipsType\":\"TILE\",\"style\":{\"maxWidth\":\"446px\"}," +
                "\"layout\":\"HORIZONTAL\",\"size\":\"large\",\"gridLayout\":\"[]\"," +
                "\"readonly\":false,\"visible\":false,\"inputType\":false,\"validation\":[]," +
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
