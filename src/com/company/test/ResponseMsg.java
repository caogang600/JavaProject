package com.company.test;

public class ResponseMsg<T extends BaseData> {
    private static int SUCCESS_CODE = 1;
    private static int ERROR_CODE = 0;
    private static int ORTHER_CODE = -1;
    private  int code;
    private  String msg;
    private  T data;

    private  static <U extends BaseData> ResponseMsg sendSuccess(U data){
        ResponseMsg<U> responseMsg = new ResponseMsg<>();
        responseMsg.code = SUCCESS_CODE;
        responseMsg.data = data;
        responseMsg.msg = "Remote Call Success!";
        return responseMsg;
    };

    private  static <U extends BaseData> ResponseMsg sendError(U data, String msg){
        ResponseMsg<U> responseMsg = new ResponseMsg<>();
        responseMsg.code = ERROR_CODE;
        responseMsg.data = data;
        responseMsg.msg = "Remote Call Error!";
        return responseMsg;
    };

    private  static <U extends BaseData> ResponseMsg sendOther(U data, String msg){
        ResponseMsg<U> responseMsg = new ResponseMsg<>();
        responseMsg.code = ORTHER_CODE ;
        responseMsg.data = data;
        responseMsg.msg = msg;
        return responseMsg;
    };

    public static void main (String[] args){
        System.out.println(ResponseMsg.<ResponseObject>sendError(new ResponseObject<String >("value1","value2"),"errorMsg"));
    }

    /*
    System.out.println实体类必须实现以下方法
    * */
    @Override
    public String toString() {
        return "ResponseMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
