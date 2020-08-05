package com.company.test;

import java.io.IOException;
import java.net.UnknownHostException;

public interface NetworkDemo {
    public void getHostIp();
    public void getHostNewIp()throws Exception;
    public void getFileSize() throws Exception;
    public void catchWebView() throws Exception;
    public void getURLConnection() throws Exception;
    public void createServiceSocket ();
    public void createClientSocket ();
}
